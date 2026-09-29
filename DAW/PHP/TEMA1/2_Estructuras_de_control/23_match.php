```php
<?php

/*
    ESTRUCTURA DE UN MATCH:

    IMPORTANTE:
    LA COMPARACIÓN ES SIEMPRE ESTRICTA (===)

    $res = match ($numero) {
        1 => "Se ha escogido la primera opción",
        2 => "Se ha escogido la segunda opción",
        3 => "Se ha escogido la tercera opción"
    };
*/


// 2 => El martes es par
// 5 => El viernes es impar

$dia = 2;

$res = match ($dia) {
    2 => "El martes es par",
    5 => "El viernes es impar",
    default => "No se ha escogido ninguna de las opciones"
};

echo $res;

?>
```
