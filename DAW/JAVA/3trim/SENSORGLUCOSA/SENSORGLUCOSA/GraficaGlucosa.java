
package SENSORGLUCOSA;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GraficaGlucosa extends JPanel {

    private final List<Integer> datos;
    private final List<String> etiquetas; // Para guardar Día + Hora
    private final String ARCHIVO_DATOS = "diario_glucosa.txt";

    public GraficaGlucosa() {
        this.datos = new ArrayList<>();
        this.etiquetas = new ArrayList<>();
        leerDatos();
        setBackground(Color.WHITE);
    }

    private void leerDatos() {
        File f = new File(ARCHIVO_DATOS);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("Nivel:")) {
                    // 1. Extraer Día y Hora
                    if (linea.contains("[") && linea.contains("]")) {
                        String fechaCompleta = linea.substring(linea.indexOf("[") + 1, linea.indexOf("]"));
                        String[] p = fechaCompleta.split(" ");
                        // Formato estándar de Date: "Thu Apr 23 21:07:44 CEST 2026"
                        // Queremos Día (p[2]) y Hora (p[3])
                        if (p.length > 3) {
                            etiquetas.add(p[2] + " " + p[3]); 
                        } else {
                            etiquetas.add("Dato");
                        }
                    }

                    // 2. Extraer Valor numérico
                    String[] partes = linea.split(" ");
                    for (int i = 0; i < partes.length; i++) {
                        if (partes[i].equals("Nivel:") && i + 1 < partes.length) {
                            try {
                                datos.add(Integer.parseInt(partes[i + 1]));
                            } catch (NumberFormatException e) {}
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int ancho = getWidth();
        int alto = getHeight();
        int margenInf = 100; // Más margen abajo para las fechas inclinadas
        int margenLat = 70;
        int margenSup = 50;

        // --- 1. DIBUJAR EJES ---
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2f));
        g2.drawLine(margenLat, alto - margenInf, ancho - margenLat, alto - margenInf); // Eje X
        g2.drawLine(margenLat, margenSup, margenLat, alto - margenInf); // Eje Y

        // --- 2. VALORES DEL EJE Y ---
        g2.setFont(new Font("Arial", Font.BOLD, 11));
        int[] valoresY = {0, 50, 100, 150, 200, 250, 300};
        for (int v : valoresY) {
            int yPos = calcularY(v, alto, margenInf, margenSup);
            g2.drawString(String.valueOf(v), margenLat - 35, yPos + 5);
            g2.drawLine(margenLat - 5, yPos, margenLat, yPos); // Pequeña marca en el eje
        }

        // --- 3. LÍNEAS DE LÍMITE (70 y 180) ---
        g2.setStroke(new BasicStroke(1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{5.0f}, 0.0f)); // Línea discontinua
        
        g2.setColor(new Color(255, 0, 0, 120)); // Rojo
        int yHiper = calcularY(180, alto, margenInf, margenSup);
        g2.drawLine(margenLat, yHiper, ancho - margenLat, yHiper);
        g2.drawString("LÍMITE HIPER (180)", ancho - 180, yHiper - 5);

        int yHipo = calcularY(70, alto, margenInf, margenSup);
        g2.drawLine(margenLat, yHipo, ancho - margenLat, yHipo);
        g2.drawString("LÍMITE HIPO (70)", ancho - 180, yHipo - 5);

        // --- 4. DATOS Y EJE X (Día + Hora) ---
        if (datos.isEmpty()) return;

        double divX = (double) (ancho - 2 * margenLat) / (datos.size() > 1 ? datos.size() - 1 : 1);
        
        for (int i = 0; i < datos.size(); i++) {
            int x = margenLat + (int) (i * divX);
            int y = calcularY(datos.get(i), alto, margenInf, margenSup);

            // Dibujar punto
            g2.setColor(Color.BLUE);
            g2.fillOval(x - 4, y - 4, 8, 8);

            // Unir líneas
            if (i > 0) {
                int xAnt = margenLat + (int) ((i - 1) * divX);
                int yAnt = calcularY(datos.get(i - 1), alto, margenInf, margenSup);
                g2.setStroke(new BasicStroke(2.5f));
                g2.drawLine(xAnt, yAnt, x, y);
            }

            // Etiquetas Eje X (Día + Hora)
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Arial", Font.PLAIN, 10));
            
            // Rotar para que quepa "Día Hora"
            g2.translate(x, alto - margenInf + 15);
            g2.rotate(Math.toRadians(45));
            g2.drawString(etiquetas.get(i), 0, 0);
            g2.rotate(Math.toRadians(-45));
            g2.translate(-x, -(alto - margenInf + 15));
        }
    }

    private int calcularY(int valor, int alto, int margenInf, int margenSup) {
        int alturaUtil = alto - margenInf - margenSup;
        // Invertimos porque en Java la Y=0 está arriba
        return (alto - margenInf) - (valor * alturaUtil / 300);
    }
}