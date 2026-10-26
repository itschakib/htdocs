```php
<?php

// ESTRUCTURA DE UN SWITCH

// switch(valor de una variable){
//     case primer posible valor:
//         ......
//         break;
//     case segundo posible valor:
//         ......
//         break;
//     default:
//         ......
// }


// SWITCH CON NÚMEROS

function operando($operacion)
{
    switch ($operacion) {

        case 1:
            echo "La operación escogida es la suma<br>";
            break;

        case 2:
            echo "La operación escogida es la resta<br>";
            break;

        case 3:
            echo "La operación escogida es la multiplicación<br>";
            break;

        case 4:
            echo "La operación escogida es la división<br>";
            break;

        default:
            echo "La operación escogida es el módulo<br>";
    }
}

operando(rand(1, 5));
operando(rand(1, 5));
operando(rand(1, 5));
operando(rand(1, 5));
operando(rand(1, 5));


// SWITCH CON CADENAS

// Si entra "lunes" a "viernes":
// "me encantan los X"
// Si entra "finde":
// "VAMOOOO"

$dia = "lunes";

switch ($dia) {

    case "finde":
        echo "<p>VAMOOOO</p>";
        break;

    default:
        echo "<p>Me encantan los $dia</p>";
}


// VARIOS CASES PARA LA MISMA ACCIÓN

switch ($dia) {

    case "lunes":
    case "martes":
    case "miercoles":
    case "jueves":
    case "viernes":
        echo "<p>Me encantan los $dia</p>";
        break;

    default:
        echo "<p>VAMOOOO</p>";
}


// SWITCH CON TRUE

// PRIMER CASE:
// El primer número es mayor o igual al segundo
// O el segundo número es menor o igual a 2.
//
// SEGUNDO CASE:
// El primer número es menor que el segundo
// Y el segundo es igual a cinco veces el primero entre dos.

function condiciones($a, $b)
{
    switch (true) {

        case ($a >= $b || $b <= 2):
            echo "<p>Primera condición</p>";
            break;

        case (($a < $b) && ($b == ($a * 5) / 2)):
            echo "<p>Segunda condición</p>";
            break;

        default:
            echo "<p>No se cumple ninguna de las otras dos condiciones</p>";
    }
}

condiciones(4, 5);


// COMPROBAR SI UN NÚMERO ES PAR O IMPAR

$num = rand(1, 100);

switch (true) {

    case ($num % 2 == 0):
        echo "<h3>El número $num es par</h3>";
        break;

    default:
        echo "<h3>El número $num es impar</h3>";
}


// OTRA FORMA DE COMPROBAR SI ES PAR O IMPAR

$num = rand(1, 100);

$num = $num % 2;

switch ($num) {

    case 0:
        echo "par";
        break;

    default:
        echo "impar";
}

?>
```

### Lo importante de este archivo

* `switch` comprueba diferentes casos de una variable.
* `case` → cada posible caso.
* `break` → termina ese caso.
* `default` → se ejecuta si no coincide ningún `case`.
* Se pueden poner **varios `case` seguidos** para ejecutar la misma acción.
* `switch (true)` permite utilizar **condiciones** dentro de los `case`.
* `%` sirve para obtener el **resto** de una división y comprobar si un número es par o impar.
