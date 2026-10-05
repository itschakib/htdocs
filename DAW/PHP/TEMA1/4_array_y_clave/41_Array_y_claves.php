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

    //1.ARRAY INDEXO:CLAVES NUMERICAS AUTOMATICA DESDE 0
    $frutas = []; //creamos un array vacio
    $frutas = ["manzana", "pera", "piña"];
    echo $frutas[0] . $salto;

    //echo $frutas ; no podemos hacer un echo de un array entero 
    echo "<pre>" . print_r($frutas) . "</pre>";

    echo "pre";
    print_r($frutas);
    echo "</pre";

    var_dump($frutas);

    echo $frutas[9];

    //2.Arrays acosiativos: son arrays cuda particularidad es q accedemos a los valores de dichos arrays a traves de claves y no por posiciones
    $personas = ["2adaw" => "samu", "2bdaw" => "menganito", "2mkt" => "fulanita", "2com" => "fulgencio"];
    echo $salto . $personas["2adaw"] . $salto;

    //como meter valores nuevos a mi array ya creado 
    $personas["Vini"];
    echo "<pre>";
    print_r($personas);
    echo "</pre>";

    //3.añadir,modificar y eliminar elementos dentro de un array
    print_r($frutas);
    $frutas[] = "Coco";
    $frutas[] = "Banana";
    print_r($frutas);

    echo $salto;

    unset($frutas[0]); //cargarme el valor y la posicion dentro de un array 
    print_r($frutas);
    // unset($frutas);
    // echo "monstrando abajo el array frutas";
    // print_r($frutas);
    $frutas[1] = "Sandía";
    print_r($frutas);

    //count ($array) =>sirve para sacar el tamaño de un array
    echo "Tamaño del arra frutas: " . count($frutas) . "tamaño del array personas: " . count($personas);
    $salto;

    //Array_values($array)
    $salto;
    echo "<pre>";
    print_r(array_values($frutas));
    echo "</pre>";
    $frutas = array_values($frutas);

    $personas = array_values($personas); //transformar el array asociativo personas a un array indexado ordenador por posiciones
    echo "<pre>";
    print_r($personas);
    echo "</pre>";

    //4.Comprar claves
    $animales = ["mamifero" => "gato", "reptiles" => "serpiente", "aves" => "albatro", "Peces" => "martillo"];
    //isset($variables)=> si la funcion tiene algun valor distinto de nulo 
    var_dump(isset($animales["anfibio"]));
    //array_key_Exists()
    var_dump(array_key_exists("manifero",$animales));
    var_dump(array_key_exists("anfibio",$animales));

    // operador de fusíon nulo => ??sirve para comprobar si una variable tiene un valor distinto de nulo y , ademas , en el caso en el q dicha variable tenga valor nulo, se mostrara a un valor alternativo 

    echo $animales["anfibio"]?? " no exist".$salto;

    ?>
</body>

</html>