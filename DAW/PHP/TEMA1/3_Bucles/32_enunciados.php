```php
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios de Bucles</title>
</head>

<body>

    <h1>Ejercicios de Bucles</h1>


    <!-- EJERCICIO 1 -->

    <h2>Ejercicio 1</h2>

    <p>
        Con while, recorre desde 150 hasta 0.
        Muestra los pares que no sean múltiplos de 6.
        Calcula su cantidad, su suma y su media.
    </p>

    <?php

    $numero = 150;
    $cantidad = 0;
    $suma = 0;

    while ($numero >= 0) {

        if ($numero % 2 == 0 && $numero % 6 != 0) {

            echo "$numero<br>";

            $cantidad++;
            $suma += $numero;
        }

        $numero--;
    }

    $media = $suma / $cantidad;

    echo "<p>Cantidad: $cantidad</p>";
    echo "<p>Suma: $suma</p>";
    echo "<p>Media: $media</p>";

    ?>


    <!-- EJERCICIO 2 -->

    <h2>Ejercicio 2</h2>

    <p>
        Recorre desde 1 hasta 200 con un while,
        seleccionando los múltiplos de 7 que no sean múltiplos de 3.
    </p>

    <ol>

        <?php

        $numero = 1;
        $cantidad = 0;
        $suma = 0;

        while ($numero <= 200) {

            if ($numero % 7 == 0 && $numero % 3 != 0) {

                echo "<li>$numero</li>";

                $cantidad++;


                $suma += $numero;
            }

            $numero++;
        }

        ?>

    </ol>

    <?php

    $media = $suma / $cantidad;

    echo "<p>Cantidad: $cantidad</p>";
    echo "<p>Suma: $suma</p>";
    echo "<p>Media: $media</p>";

    ?>


    <!-- EJERCICIO 3 -->

    <h2>Ejercicio 3</h2>

    <p>
        Empiezas con 0€ y ahorras 40€ a la semana
        hasta alcanzar o superar los 4000€.
    </p>


    <!-- VERSIÓN 1 -->

    <h3>Versión 1</h3>

    <?php

    $dinero = 0;
    $semanas = 0;

    while ($dinero < 4000) {

        $dinero += 40;
        $semanas++;
    }

    echo "<p>Necesitas $semanas semanas para llegar o superar los 4000€.</p>";
    echo "<p>Dinero ahorrado: $dinero</p>";

    ?>


    <!-- VERSIÓN 2 -->

    <h3>Versión 2</h3>

    <?php

    $dinero = 0;
    $semanas = 0;

    while ($dinero < 4000) {

        $semanas++;

        // Cada cuarta semana gastamos 20€

        $aportado = 40;
        $gastado = 0;

        $dinero += $aportado;

        if ($semanas % 4 == 0) {

            $gastado = 20;
            $dinero -= $gastado;
        }

        echo "<p>
                Semana $semanas:
                Aportado: $aportado -
                Gastado: $gastado -
                Ahorrado: $dinero
              </p>";
    }

    echo "<p>Necesitas $semanas semanas para llegar o superar los 4000€.</p>";
    echo "<p>Dinero final: $dinero</p>";

    ?>
    
</body>

</html>