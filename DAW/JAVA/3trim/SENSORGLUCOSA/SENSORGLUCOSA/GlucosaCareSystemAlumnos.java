package SENSORGLUCOSA;

import java.awt.Desktop;
import java.io.*;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 * PROYECTO: Nano Banana - GlucosCare
 * Misión: Implementar la robustez del sistema y el registro doble de alertas.
 */
public class GlucosaCareSystemAlumnos {

    private static final String ARCHIVO_DATOS = "diario_glucosa.txt";
    private static final String ARCHIVO_ALERTAS = "alertas_medicas.txt";
    private static final String ARCHIVO_ERRORES = "errores_sistema.txt";

    public static void main(String[] args) {
        Scanner lectorConsola = new Scanner(System.in);
        System.out.println("--- SISTEMA GLUCOSCARE: MODO DESARROLLO ---");

        while (true) {
            int nivelActual = 0; 
            try {
                System.out.print("\nEntrada del sensor: ");
                String datoEntrada = lectorConsola.nextLine();

                if (datoEntrada.equalsIgnoreCase("OFF")) {
                    System.out.println("Cerrando y generando informes...");
                    mostrarGrafica();
                    // TODO: Llamar a abrirArchivo para los 3 ficheros creados
                    break;
                }

                // 1. TODO: Convertir la entrada de String a int (Cuidado con errores de escritura)
                nivelActual = 0; // Cambiar esta línea

                // 2. TODO: Validar el nivel usando el método validarNivel
                

                // 3. REGISTRO NORMAL (Si no hay excepción, se ejecuta esto)
                int nivelAnterior = obtenerUltimoRegistro();
                String tendencia = calcularTendencia(nivelAnterior, nivelActual);
                guardarEnFichero(nivelActual, tendencia);
                System.out.println(">>> Registro normal guardado.");

            } catch (NumberFormatException e) {
                // TODO: Capturar cuando el usuario mete letras en vez de números
                // Registrar el error en ARCHIVO_ERRORES usando registrarLog
                System.err.println("Dato no numérico detectado.");

            } catch (AlertaMedicaException e) {
                // --- PUNTO CRÍTICO DE LA UNIDAD ---
                System.err.println("⚠️ ALERTA: " + e.getMessage());
                
                // TODO A: Registrar la alerta en el fichero de alertas
                
                // TODO B: Registrar TAMBIÉN el valor en el diario normal para la gráfica
                // (Incluso siendo una alerta, el médico debe ver el pico en el gráfico)
                

            } catch (IOException e) {
                System.err.println("Error de entrada/salida de archivos.");
            }
        }
    }

    /**
     * Lanza una excepción si el nivel es crítico.
     */
    private static void validarNivel(int nivel) throws AlertaMedicaException {
        // TODO: Si nivel < 70 lanza AlertaMedicaException con mensaje "Hipoglucemia"
        // TODO: Si nivel > 180 lanza AlertaMedicaException con mensaje "Hiperglucemia"
    }

    /**
     * Escribe en el archivo de datos principal.
     */
    private static void guardarEnFichero(int nivel, String tendencia) throws IOException {
        // TODO: Implementar el uso de FileWriter en modo 'append' (true)
        // Escribir la línea con el formato: [Fecha] Nivel: X mg/dL Tendencia
    }

    /**
     * Método auxiliar para el registro de logs técnicos y médicos.
     */
    private static void registrarLog(String nombreArchivo, String etiqueta, String mensaje) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            pw.println("[" + new Date().toString() + "] [" + etiqueta + "] " + mensaje);
        } catch (IOException e) {
            System.err.println("Fallo al registrar log.");
        }
    }

    // --- MÉTODOS DE APOYO (Ya resueltos para no desviar el foco) ---

    private static int obtenerUltimoRegistro() {
        File f = new File(ARCHIVO_DATOS);
        if (!f.exists()) return 100;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea, ultima = "";
            while ((linea = br.readLine()) != null) { if (!linea.trim().isEmpty()) ultima = linea; }
            if (!ultima.isEmpty()) {
                String[] partes = ultima.split(" ");
                for(int i=0; i < partes.length; i++) {
                    if(partes[i].equals("Nivel:")) return Integer.parseInt(partes[i+1]);
                }
            }
        } catch (Exception e) { return 100; }
        return 100;
    }

    private static String calcularTendencia(int ant, int act) {
        if (act > ant + 10) return "↑↑";
        if (act < ant - 10) return "↓↓";
        return "→";
    }

    public static void mostrarGrafica() {
        JFrame v = new JFrame("Análisis de Glucosa");
        v.add(new GraficaGlucosa());
        v.setSize(1000, 600);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }

    public static void abrirArchivo(String ruta) {
        try {
            File f = new File(ruta);
            if (f.exists()) Desktop.getDesktop().open(f);
        } catch (IOException e) { }
    }
}