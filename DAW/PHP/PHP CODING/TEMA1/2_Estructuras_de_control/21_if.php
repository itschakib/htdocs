```php
<?php

// FORMAS DE HACER UNA ESTRUCTURA DE CONTROL IF

$a = 1;


// Primera forma

if ($a > 0) {
    echo "<p>El número es positivo</p>";
}


// Segunda forma

if ($a > 0)
    echo "<p>El número es positivo</p>";


// Tercera forma

if ($a > 0):
    echo "<p>El número es positivo</p>";
endif;


// FORMAS DE HACER UNA ESTRUCTURA DE CONTROL IF ELSE

// Primera forma

if ($a > 0) {
    echo "<p>El número es positivo</p>";
} else {
    echo "<p>El número es cero o negativo</p>";
}


// Segunda forma

if ($a > 0)
    echo "<p>El número es positivo</p>";
else
    echo "<p>El número es cero o negativo</p>";


// Tercera forma

if ($a > 0):
    echo "<p>El número es positivo</p>";
else:
    echo "<p>El número es cero o negativo</p>";
endif;


// FORMAS DE HACER UN IF ELSEIF

// Primera forma

if ($a > 0) {
    echo "<p>El número es positivo</p>";
} elseif ($a === 0) {
    echo "<p>El número es cero</p>";
} else {
    echo "<p>El número es negativo</p>";
}


// Segunda forma

if ($a > 0)
    echo "<p>El número es positivo</p>";
elseif ($a === 0)
    echo "<p>El número es cero</p>";
else
    echo "<p>El número es negativo</p>";


// Tercera forma

if ($a > 0):
    echo "<p>El número es positivo</p>";
elseif ($a === 0):
    echo "<p>El número es cero</p>";
else:
    echo "<p>El número es negativo</p>";
endif;

?>
```
