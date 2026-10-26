```php
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <h1>Hola</h1>

    <!-- Parte estática de mi web -->
    <p>Esto es una intro de PHP</p>
    <p>Este texto es HTML puro, no tiene CSS, JS ni PHP.</p>

    <p>
        <?php
        $salto = "<br>";
        echo "Hola";
        ?>
    </p>

    <?php
    echo "<p>Hola</p>";

    echo date("d/m/Y H:i:s");

    echo "<br>";

    $lenguaje = "PHP";
    $ciclo = "DAW";

    echo "El lenguaje de backend que aprenderemos este año será "
        . $lenguaje . $salto;

    echo "El lenguaje de backend que aprenderemos este año será "
        . $lenguaje . $salto;

    // $1var = 1; ❌
    // No se puede empezar por número el nombre de una variable.

    $_1var = 1; // ✅ Usar "_" está aceptado.
    ?>

</body>
</html>
```
