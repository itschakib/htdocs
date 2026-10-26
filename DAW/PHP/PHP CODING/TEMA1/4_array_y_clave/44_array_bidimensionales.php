<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    // Un array bidimensional tiene como caracteristica que cada elemento del array contiene otro array
    $videojuegos = [
        ["Silksong", "Souls", 20], //0
        ["Elden Ring", "Souls", 60], //1
        ["Lego Batman", "rpg", 80]
    ];

    //echo $videojuegos[3][2];

    $videojuegos[] = ["DSIII", "Souls", 40];
    foreach ($videojuegos as $videojuego) {
        foreach ($videojuego as $caracteristicas) {
            echo $caracteristicas . " ";
        }
        echo "<br>";
    }
    for ($i = 0; $i < count($videojuegos); $i++) {
        for ($j = 0; $j < count($videojuegos[$i]); $j++) {
            echo $videojuegos[$i][$j] . " ";
        }
        echo "<br>";
    }

    foreach ($videojuegos as $jueguito) {
        list($titulo, $categoria, $precio) = $jueguito; //list() sirve para sacar los elementos de un array INDEXADO
        //siempre y cuando conozcamos la estractura del array 
        echo "<p> $titulo: $categoria, $precio € </p>";
    }
    echo "<pre>";
    print_r($videojuegos);
    echo "</pre>";



    $personas = [
        "ana" => ["dni" => "12341234A", "edad" => 23],
        "samu" => ["dni" => "12341234C", "edad" => 29],
        "neo" => ["dni" => "12341234Z", "edad" => 19],

    ];

    // ana: dni ->12341234A || edad ->23

    $resultado = "";
    foreach ($personas as $nombre => $info) {
        $resultado .= "<p>$nombre: ";
        $tam = 0;
        foreach ($info as $clave => $valor) {
            if ($tam != count($info) - 1) {
                $resultado .= $clave . "->" . $valor . " || ";
                $tam++;
            } else {
                $resultado .= $clave . "->" . $valor;
            }

            echo "</p>";
        }
    }

    echo $resultado;

    //Sacar en un array indexado la columna de las categorias del array videojuegos y en otro array
    //, la columna de los precios 


    $categorias=[];
    $precios = [];

    for ($i=0; $i < $videojuegos; $i++) { 
        #
    }
    ?>
</body>

</html>