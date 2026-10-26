```php
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios Tema 2</title>
</head>

<body>

    <h1>Ejercicios de estructuras de control</h1>


    <!-- EJERCICIO 1 -->

    <p>
        Ejercicio 1. Crea una función llamada edad que haciendo uso de la estructura
        de control switch muestre por pantalla si una persona es menor de edad,
        adulta, jubilada o anciana.
    </p>

    <?php

    function calcularEdad(int $edad): string
    {
        switch (true) {

            case $edad < 18:
                return "Menor de edad";

            case $edad < 67:
                return "Adulta";

            case $edad < 80:
                return "Jubilada";

            default:
                return "Anciana";
        }
    }

    $edad = rand(1, 100);

    echo "Edad: $edad años<br>";
    echo calcularEdad($edad);

    ?>


    <!-- EJERCICIO 2 -->

    <p>
        Ejercicio 2. Crear una función llamada notas que contenga un parámetro
        decimal. Dependiendo de la nota, mostrar la calificación correspondiente.
    </p>

    <?php

    function notas(float $nota): string
    {
        if ($nota < 5) {
            return "Suspenso";
        } elseif ($nota < 7) {
            return "Aprobado";
        } elseif ($nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    echo notas(8.5);

    ?>


    <!-- EJERCICIO 3 -->

    <p>
        Ejercicio 3. Crear una función llamada meses que, dependiendo del número
        que entre y haciendo uso del match, devuelva el nombre del mes correspondiente.
    </p>

    <?php

    function meses(int $numero): string
    {
        return match ($numero) {

            1 => "Enero",
            2 => "Febrero",
            3 => "Marzo",
            4 => "Abril",
            5 => "Mayo",
            6 => "Junio",
            7 => "Julio",
            8 => "Agosto",
            9 => "Septiembre",
            10 => "Octubre",
            11 => "Noviembre",
            12 => "Diciembre",

            default => "Número de mes no válido"
        };
    }

    echo meses(5);

    ?>


    <!-- EJERCICIO 4 -->

    <p>
        Ejercicio 4. Crear una función llamada calculadora que tenga 3 parámetros.
        Dos números y un string. Usar un switch para mostrar el resultado de la
        operación correspondiente.
    </p>

    <?php

    function calculadora(float $num1, float $num2, string $op): float
    {
        switch ($op) {

            case "suma":
                return $num1 + $num2;

            case "resta":
                return $num1 - $num2;

            case "division":

                if ($num2 == 0) {
                    return -1;
                }

                return $num1 / $num2;

            case "exponente":
                return $num1 ** $num2;

            default:
                return -1;
        }
    }

    echo calculadora(10, 2, "division");

    ?>


    <!-- EJERCICIO 5 -->

    <p>
        Ejercicio 5. Crear una función llamada analizarNumero que indique si el
        número está dentro del rango y si es par o impar.
    </p>

    <?php

    function analizarNumero(int $n, int $min, int $max): string
    {
        if ($n < $min || $n > $max) {

            return "Fuera de rango";

        } else {

            if ($n % 2 == 0) {
                $resultado = "par";
            } else {
                $resultado = "impar";
            }

            if ($n == $min || $n == $max) {
                return "El número es $resultado y está en el borde";
            } else {
                return "El número es $resultado y está en el interior";
            }
        }
    }

    echo analizarNumero(10, 1, 20);

    ?>


    <!-- EJERCICIO 6 -->

    <p>
        Ejercicio 6. Crear una función calcularEnvio usando match para determinar
        la tarifa dependiendo de si es internacional, express y del peso.
    </p>

    <?php

    function calcularEnvio(
        float $peso,
        bool $express,
        bool $internacional
    ): string {

        $resultado = match (true) {

            $internacional && $express && $peso <= 2
                => ["Express internacional ligero", 15],

            $internacional && !$express
                => ["Estándar internacional", 20],

            !$internacional && $express && $peso >= 5
                => ["Express nacional", 12],

            !$internacional && !$express
                => ["Estándar nacional", 8],

            default
                => ["Caso no contemplado", 0]
        };

        return "Tarifa: " . $resultado[0] . " -- Precio: " . $resultado[1] . "€";
    }

    echo calcularEnvio(1.5, true, true);

    ?>


    <!-- EJERCICIO 7 -->

    <h3>Ejercicio 7</h3>

    <p>
        Validación de fecha. Crear una función validarFecha que compruebe si
        una fecha es anterior, posterior o igual a la fecha actual.
    </p>

    <?php

    function validarFecha(int $dia, int $mes, int $annio): string
    {
        // Primero comprobamos si la fecha es válida

        if (!checkdate($mes, $dia, $annio)) {
            return "La fecha no es válida";
        }

        // Convertimos la fecha introducida a timestamp

        $fechaIntroducida = strtotime("$annio-$mes-$dia");

        // Obtenemos la fecha actual

        $fechaActual = strtotime(date("Y-m-d"));

        if ($fechaIntroducida < $fechaActual) {
            return "La fecha es anterior a la actual";

        } elseif ($fechaIntroducida > $fechaActual) {
            return "La fecha es posterior a la actual";

        } else {
            return "La fecha es la de hoy";
        }
    }

    echo validarFecha(29, 9, 2026);

    ?>


    <!-- OPERADOR TERNARIO -->

    <?php

    // OPERADOR TERNARIO
    // (condición) ? (si se cumple) : (si no se cumple)

    $n = rand(1, 100);

    echo "<br>";

    echo ($n % 2 == 0)
        ? "$n es par"
        : "$n es impar";

    ?>

</body>

</html>
```
