```php
<?php

$salto = "<br>";

$num1 = 14;
$num2 = 20;


// OPERADORES ARITMÉTICOS

echo "Suma: " . ($num1 + $num2) . $salto;

echo "Resta: " . ($num2 - $num1) . $salto;

echo "Multiplicación: " . ($num1 * $num2) . $salto;

echo "División: " . ($num2 / $num1) . $salto;

echo "Resto: " . ($num2 % $num1) . $salto;


// INCREMENTO Y DECREMENTO

// Postincremento
$num3 = $num2++;

echo "Valor de num3: $num3. Valor de num2: $num2 $salto";

// Preincremento
$num3 = ++$num2;

echo "Valor de num3: $num3. Valor de num2: $num2 $salto";

// Postdecremento
$num3 = $num2--;

echo "Valor de num3: $num3. Valor de num2: $num2 $salto";

// Predecremento
$num3 = --$num2;

echo "Valor de num3: $num3. Valor de num2: $num2 $salto";


// OPERADORES LÓGICOS

echo "¿Es num1 mayor que 10?: "
    . ($num1 > 10) . $salto;

echo "¿Es num3 mayor o igual a 3 O es num3 menor que num2?: "
    . (($num3 >= 3) || ($num3 < $num2)) . $salto;

echo "¿Es num3 igual a num2 Y es num1 menor que num2?: "
    . (($num3 == $num2) && ($num1 < $num2)) . $salto;


// COMPARADOR ESTRICTO

$numero = 12;
$cadena = "12";

$estricto = $numero === $cadena;

// ==  → compara valor
// === → compara valor y tipo

echo $estricto . $salto;


// NOT

echo "num1 y num2 NO son iguales: "
    . !($num1 == $num2) . $salto;

?>
```
