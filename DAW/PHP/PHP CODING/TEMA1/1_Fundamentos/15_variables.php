```php
<?php

// VARIABLES GLOBALES, LOCALES Y ESTÁTICAS


// VARIABLE LOCAL:
// Se crea dentro de una función y solo podemos usarla dentro de esta.

function mostrarAlumno()
{
    $nombre = "Mónica";

    echo "Desde dentro de la función: $nombre<br>";
}

mostrarAlumno();

// echo $nombre;
// No se puede usar porque $nombre es una variable local.


// VARIABLE GLOBAL:
// Se crea fuera de las funciones.
// Para acceder a ella desde una función usamos "global".

$modulo = "Desarrollo web en entorno servidor";

function mostrarCurso()
{
    global $modulo;

    echo "Desde dentro de la función: $modulo<br>";
}

mostrarCurso();


// Modificar una variable global

$numerito = 1;

function sumar()
{
    global $numerito;

    $numerito += 2;
}

sumar();

echo $numerito . "<br>";


// VARIABLES ESTÁTICAS

// Variable local normal:
// se reinicia en cada llamada.

function contadorConLocal()
{
    $cont = 0;

    $cont++;

    echo "Cont local: $cont<br>";
}

contadorConLocal(); // 1
contadorConLocal(); // 1
contadorConLocal(); // 1
contadorConLocal(); // 1
contadorConLocal(); // 1


// Variable estática:
// mantiene su valor entre llamadas.

function contadorConEstatica()
{
    static $cont = 0;

    $cont++;

    echo "Cont estático: $cont<br>";
}

contadorConEstatica(); // 1
contadorConEstatica(); // 2
contadorConEstatica(); // 3
contadorConEstatica(); // 4
contadorConEstatica(); // 5
contadorConEstatica(); // 6


// EJERCICIO:
// Crear una función que duplique el valor de una variable
// inicializada en 2 hasta llegar a 1024.

function duplicar()
{
    static $res = 2;

    echo $res . "<br>";

    $res *= 2;
}

duplicar(); // 2
duplicar(); // 4
duplicar(); // 8
duplicar(); // 16
duplicar(); // 32
duplicar(); // 64
duplicar(); // 128
duplicar(); // 256
duplicar(); // 512
duplicar(); // 1024

?>
```
