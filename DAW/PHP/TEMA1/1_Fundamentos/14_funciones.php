```php
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funciones en PHP</title>
</head>

<body>

    <h1>Funciones en PHP</h1>

    <?php

    // Una función es un bloque de código al que ponemos un nombre.
    // Nos permite reutilizar código sin tener que reescribirlo.


    // SIN PARÁMETROS Y SIN RETURN

    function saludar()
    {
        echo "Holis<br>";
    }

    saludar();


    // CON PARÁMETROS Y SIN RETURN

    function presentarse($nombre, $edad)
    {
        echo "Hola, mi nombre es $nombre y tengo $edad años<br>";
    }

    presentarse("Hugo", 39);

    $a = "Hugo";
    $b = 39;

    presentarse($a, $b);


    // SIN PARÁMETROS Y CON RETURN

    function saludar2()
    {
        return "Holis2<br>";
    }

    echo saludar2();


    // PARÁMETRO CON UN VALOR POR DEFECTO

    // Si no pasamos un argumento,
    // se utiliza el valor indicado.

    function darBienvenida($nombre = "NPC")
    {
        echo "Bienvenido/a, $nombre<br>";
    }

    darBienvenida("Paquito");
    darBienvenida();


    // IMPORTANTE:
    // Si combinamos parámetros obligatorios y opcionales,
    // primero van los obligatorios y después los opcionales.


    // CON PARÁMETROS Y CON RETURN

    function operar($a, $b)
    {
        return $a <= $b;
    }

    echo operar(2, 4);

    ?>

</body>
</html>
```
