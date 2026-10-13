<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h3>Ejercicio 1</h3>
    <p>la biblioteca del insti tiene los siguientes libros: "el quijote" ,"1984","dune"
        y "matilda"</p>
    <ol>
        <li>Crea la funcion "unirConComas($array)",que devuelva un texto con todos los
            valores separados por coma (sin
            coma al final),La usarás en el resto de ejercicios</li>
        <li>Añade "Momo","Dracula"y"El perfume"al final de la biblioteca</li>
        <li>Se piden prestados Dune y Halmet.para cada peticion , busca la posicion del libro
            y si esta,crea un
            array nuevo sin ese libro , de modo que no queden huecos y muestra los seguiente:
            "Prestado:Dune" Y en caso
            de que el libro no lo tengo la biblioteca,"No disponible: Hamlet"
        </li>
        <li>Muestra la lista numera(1.El quijote,2,1984...),el total de libro y
            ,en una sola linea, los libros en orden
            unverso</li>
    </ol>
    <?php
    function unirConComas($array): string
    {
        $texto = "";
        $primero = true;
        foreach ($array as $valor) {
            if (!$primero) $texto .= ", ";
            $texto .= $valor;
            $primero = false;
        }
        return $texto;
    }
    //echo unirConComas(["ale","pepe","juanito"]);

    $libros = ["El Quijote", "1984", "Dune", "Matilda"];

    array_push($libros, "Momo", "Drácula", "Frankestein"); //Forma 1
    // $libros[] = "Momo"; //Forma 2
    $peticiones = ["Dune", "Hamlet"];
    foreach ($peticiones as $titulo) {
        $encontrado = false;
        $posicion = -1;
        $i = 0;

        while ($i < count($libros) && !$encontrado) { //en el caso en el q el libro esté en la biblio, saco su posición
            if ($libros[$i] == $titulo) {
                $encontrado = true;
                $posicion = $i;
            }
            $i++;
        }

        if ($posicion != -1) {
            echo "Prestado: " . $libros[$i];
            unset($libros[$i]);
        } else {
            echo "No disponible: $titulo";
        }
    }
    echo "<ol>";
    foreach ($libros as $libro) {
        echo "<li>$libro</li>";
    }
    ?>
    </div>
    <h3>Ejercicio 2</h3>
    <?php
    //Crear el stock origignal 
    $stock = [
        "Teclados" => 12,
        "Ratones" => 4,
        "Monitores" => 5,
        "Webcams" => 3,
        "Altavoces" => 2,
    ];

    //funcion para comprar el estado del stock 
    function estadoStock($unidades){
        return match($unidades){
            0 => "Agotado",
            1,2,3 => "Pocas unidades",
            default => "Disponible" 
        };
    }
    ?>
<table border="2">
    <tr>
        <th>producto</th>
        <tr>unidades disponibles</tr>
        <tr>EstadoStock</tr>
</table>
    
</body>

</html>