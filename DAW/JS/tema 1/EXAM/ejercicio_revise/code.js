// EJERCICIO 1
/* CREA UNA FUNCTION QUE RECIBA UN ARRAY (DEL TAMAÑO QUE SEA ) y
un numero. A continuacion,la funcion debe devolver el numero de 
veces que aparce ese numero en el array la Primera aparicion de este.

Requisito : hacerlo todo recorriendo el array solo una vez .*/

let numeros = [2, 4, 1, 5, 6, 3];
let numero = Math.floor(Math.random() * 10) + 1;

function Array1(numeros, numero) {
  let contador = 0;
  let primeroPosicion = -1;
  for (let i = 0; i < numeros.length; i++) {
    if (numero == numeros[i]) {
      contador++;
      if (contador == 1) primeroPosicion = i;
    }
  }

  return (
    "EL numero " +
    numero +
    " parece " +
    contador +
    "la primer poscision es " +
    primeroPosicion
  );
}

//EJERCICIO 2
/*Crea una funcion que reciba una matriz de cualquier tamaño y devuelva true o false 
si la matriz es simetrica o no.

una matriz es simetrica si cada elemnto en la posicion [i][j] tiene el mismo valor que que cada elemno 
en la posicion[j][i]

requisito : itenta dar el menor numero de vueltas posible. 
[ 1  2  3]
| 2  5  6|
[ 3  6  9]
 */

let matriz = [
  [1, 2, 3],
  [2, 5, 6],
  [3, 6, 9],
];

function matrizSimetrica(matriz) {
  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      // matriz[i][j] === matriz[j][i] si hay solo una pareja equal ya es simatrico y aqui
      // si encuentramos solo una pareja difeerene ya no es simatrico
      if (matriz[i][j] != matriz[j][i]) return false;
    }
  }
  return true;
}
console.log(matrizSimetrica(matriz));

//Ejercicio 3

/* funcion que recibe una matriz de numeros y un array de numeros,devuelve una matriz donde cada 
fila de esa matriz queda multiplicada por el correspondiente numero del array ,
No importa el tamaño del array : solo uso los numeros q necesite .
1,  2,  3                                    2,  4,  6     
4,  1,  5                  Devuelve         12,  3,  15   
2,  1,  6                                    2,  1,  6

[2,3,1]                                                                                          */

let matriz2 = [
  [1, 2, 3],
  [4, 1, 5],
  [2, 1, 6],
];
let lista = [2, 3, 1];

function multiFilas(matriz2, lista) {
  let matrizM = [];
  for (let i = 0; i < matriz2.length; i++) {
    matrizM[i] = []; //eso por crear el las filas vacias por la nueva matrizM
    for (let j = 0; j < matriz2[i].length; j++) {
      matrizM[i][j] = matriz2[i][j] * lista[i]; // aqui es para meter nuevas valores en el nuevo matrizM
    }
  }
  return matrizM;
}
console.log(multiFilas(matriz2, lista));

//ejercicio 4
/*funcion que recibe una matriz de numeros de cualquier tamaño y un array de coordenadas,
(no tiene por q ser del mismo tamaño q la matriz)

una coordenada son dos valores,luego los elemntos de ese array seran arrays de dos valores , pej:
let pos = [[1,2],[0,3],[2,2],[3,1]] (suponemos q todas las cooredenadas son correctas)

devuelve una matriz nueva donde cada fila de esa matriz queda multiplicada 
por el correspondiente numero del array.

let matriz = [
[1,2,3,4],
[1,2,3,4],
[1,2,3,4],
[1,2,3,4]
]

let pos = [[1,2],[0,3],[2,2],[3,1]];

salida = [
[1,2,3,0],
[1,2,0,4],
[1,2,0,4],
[1,0,3,4]
]
*/
let matriz0 = [
  [1, 2, 3, 4],
  [1, 2, 3, 4],
  [1, 2, 3, 4],
  [1, 2, 3, 4],
];
let lista0 = [
  [1, 2],
  [0, 3],
  [2, 2],
  [3, 1],
];

function multiceros(matriz0, lista0) {
  let matrizN = [];
  //copiamos el matriz
  for (let i = 0; i < matriz0.length; i++) {
    matrizN[i] = [];
    for (let j = 0; j < matriz0[i].length; j++) {
      matrizN[i][j] = matriz0[i][j];
    }
  }
//rellenamos el matriz nuevo 
  for (let i = 0; i < lista0.length; i++) {
  

    let fila = lista0[i][0];
    let columna = lista0[i][1];
    matrizN[fila][columna] = 0;
  }
  return matrizN;
}

console.log(multiceros(matriz0, lista0));



//EJERCICIO 5
/*function que recibe una matriz de numeros de cualquier tamaño y un array de coordenadas * ( no tiene por que ser del mismo tamaño que la matriz)
una coordena son DOS valores, luego los elementos de ese array seran arrays de dos valores . PEJ : LET pos =[[1,2],[0,3],[2,2],[3,1]]*/