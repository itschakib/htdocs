<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
   
<?php

$salto = "<br>";

// 1. Array indexado
$frutas = ["manzana", "pera", "piña"];

echo $frutas[0] . $salto;

echo "<pre>";
print_r($frutas);
echo "</pre>";

var_dump($frutas);

// Comprobar si existe la posición 9
if (isset($frutas[9])) {
    echo $frutas[9];
} else {
    echo "La posición 9 no existe" . $salto;
}

// 2. Array asociativo
$personas = [
    "2adaw" => "samu",
    "2bdaw" => "menganito",
    "2mkt" => "fulanita",
    "2com" => "fulgencio"
];

echo $personas["2adaw"] . $salto;

// Añadir un nuevo elemento
$personas["Vini"] = "Vinicius";

echo "<pre>";
print_r($personas);
echo "</pre>";

// 3. Añadir, modificar y eliminar
$frutas[] = "Coco";
$frutas[] = "Banana";

unset($frutas[0]);

$frutas[1] = "Sandía";

echo "<pre>";
print_r($frutas);
echo "</pre>";

echo "Tamaño del array frutas: " . count($frutas) . $salto;
echo "Tamaño del array personas: " . count($personas) . $salto;

// Reordenar las posiciones numéricas
$frutas = array_values($frutas);

echo "<pre>";
print_r($frutas);
echo "</pre>";

// Convertir el array asociativo en indexado
$personas = array_values($personas);

echo "<pre>";
print_r($personas);
echo "</pre>";

// 4. Comprobar claves
$animales = [
    "mamifero" => "gato",
    "reptiles" => "serpiente",
    "aves" => "albatros",
    "Peces" => "martillo"
];

var_dump(isset($animales["anfibio"]));
var_dump(array_key_exists("mamifero", $animales));
var_dump(array_key_exists("anfibio", $animales));

// Operador de fusión nulo
echo $animales["anfibio"] ?? "No existe" . $salto;

?>

</body>

</html>