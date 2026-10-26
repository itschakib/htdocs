```php
<?php

$salto = "<br>";

define("numPI", 3.1416);

echo numPI . $salto;


// TIPOS DE DATOS

$var1 = 4;                  // int
$var2 = 4.1;                // float
$var3 = "cuatro coma uno";  // string
$var4 = true;               // boolean
$var5 = null;               // null

var_dump($var1);
var_dump($var2);
var_dump($var3);

echo $salto;


// CONVERSIÓN DE TIPO DE DATOS

// De X a int

$cadena = "1abc2";

echo "Mostrar el número en modo cadena: ";
var_dump($cadena);

$cadena = intval($cadena);

var_dump($cadena);

echo $salto;


// De X a string

$numero = 13.1;

echo "Mostrar el número decimal: " . $salto;

var_dump($numero);

$numero = strval($numero);

var_dump($numero);

echo $salto;


// De X a float

$entero = "1b3.1a";

echo "Mostrar el número entero: ";

var_dump($entero);

var_dump(floatval($entero));

?>
```
