<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <!--Ejercicio 7-->
    <p>CREAR una funcion que calcula con un for la suma de los siguientes numeros 1 - 2 + 3 - 4 + .... hasta n .
        Acepta enteros de 0 hasta 100 y rechaza otros valores que esten fuera de ese rango.
        la funcion devolvera la suma anterior y una comparacion con la suma normal del 1 hasta n.</p>
    <br>
    <br>
    <?php
    $Salto = "<br>";
    $num = rand(0, 100);
    function CALCULARSUMA($num)
    {
        if ($num < 0 || $num > 100) {
            return "Elnumero debe estar entre 0 y 100";
        }
        $suma = 0;
        $sumaNormal = 0;
        for ($i = 0; $i < $num; $i++) {
            if ($i % 2 == 0) {
                $suma = $suma - $i;
            } else {
                $suma = $suma + $i;
            }
            $sumaNormal = $sumaNormal + $i;
        }
        if ($suma == $sumaNormal) {
            $comparacion = "Las dos sumas son iguales";
        } else {
            $comparacion = "Las dos sumas son diferentes";
        }
        return "Para $num: suma = $suma,suma normal = $sumaNormal, $comparacion";
    }

    echo CALCULARSUMA($num);
    echo $Salto;
    echo $Salto;
    echo $Salto;
    ?>



    <!--Ejercicio 8-->
    <p>Crea la funcion factorial($n) para enteros de 0 a 15 . rechanzando valores fuera de ese parametros.</p>
    <?php
    function factorial($n)
    {
        if ($n < 0 || $n > 15) {
            return "el numero debe estar entre 0 y 15 ";
        }
        $resultado = 1;
        for ($i = 1; $i < $n; $i++) {
            $resultado = $resultado * $i;
        }
        return $resultado;
    }
    echo factorial(5);
    echo $Salto;
    echo $Salto;
    echo $Salto;
    ?>




    <!--EJERCICIO 9-->

    <p>SIn convertirlo en cadena ni array , recorre las cifras de un numero entero 0 y 99999 generado de manera aleatoria.
        calcula la cantidad de cifras que tiene el numero, la suma de sus cifras, la cifra mayor, la cifra menor y el ceros que contiene.
        Devolver una cadena como la siguiente: "Para 4050: cuatro cifras, suma 9,mayor 5 , menor 0 , 2 ceros </p>
    <?php
    $num2 = rand(0, 99999);
    function Calcular($num)
    {
        $original = $num;
        $cantidad = 0;
        $suma = 0;
        $mayor = 0;
        $menor = 0;
        $ceros = 0;



        if ($num == 0) {
            $cantidad = 1;
            $ceros = 1;
            $mayor = 0;
            $menor = 0;
        } else {
            while ($num > 0) {
                $cifra = $num % 10;

                $cantidad++;
                $suma += $cifra;

                if ($cifra > $mayor) {
                    $mayor = $cifra;
                }

                if ($cifra < $menor) {
                    $menor = $cifra;
                }

                if ($cifra == 0) {
                    $ceros++;
                }

                $num = intval($num / 10);
            }
        }
        global $Salto;
        $Salto;
        return "Para $original:$cantidad: Cifras,Suma: $suma, Mayor: $mayor, Menor: $menor,$ceros Ceros";
    }
    echo Calcular($num);
    echo $Salto;
    echo $Salto;
    echo $Salto;
    ?>

    <!--Ejercicio 10-->
    <p>Crea una funcion que dependiendo del parametro que se le pase , dibujara un triangulo mas o menos grande.
        El parametro indicara el tamaño del triangulo. Altura minima 3 (Obligatorio) </p>
        <?php

        function Triangulo($h)
        {
            global $Salto;
            if ($h < 3) {
                $h = 3;
            }
            for ($i = 1; $i <= $h; $i++) {
                for ($j = 1; $j <= $i; $j++) {
                    echo "X ";
                }
                echo  $Salto;
            }
        }
        Triangulo(8);
        echo $Salto;
        echo $Salto;
        echo $Salto;
        //otro trianglo 
        function TrianguloIsq($h)
        {
            global $Salto;
            if ($h < 3) {
                $h = 3;
            }
            for ($i = 1; $i <= $h; $i++) {
                echo "<pre>";
                for ($j = 1; $j <= $i; $j++) {

                    echo "X ";
                }
                echo  $Salto;
            }
            echo "</pre>";
        }   
       
        TrianguloIsq(8);
?>


   

        <?php
        //tablita 
        function tablita(int $n)
        {
        ?>

    <table border="">
        <thead>
            <tr>
                <th>
                </th>
                <th>
                </th>
                <th>
                </th>
            </tr>
        </thead> 
        <tbody>
            <?php
            $color=1;
            for ($i = $n; $i > -$n; $i--) {
                if($i!=0){
            ?>
                <tr
                <?php 
                if($color%2!=0) echo"style='background-color:lightblue'";
                else echo "style='background-color:pink'";
                $color++;
                ?>
                >
                    <td><?php echo $i; ?></td>
                    <td><?= pow($i, 2); ?> </td>
                    <td><?= pow($i, 3); ?> </td>
                    <td>
                        <?php
                        //if ($i > 0) echo "positivo";
                       // else echo "negativo";
                        echo ($i > 0) ? "positivo" : "negativo";
                        ?>
                    </td>
                </tr>
            <?php
            }
              }
            ?>
        </tbody>
    </table>
<?php
        }
        tablita(5);
?>

</body>

</html>