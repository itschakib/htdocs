// EJERCICIO 1
/* CREA UNA FUNCTION QUE RECIBA UN ARRAY (DEL TAMAÑO QUE SEA ) y
un numero. A continuacion,la funcion debe devolver el numero de 
veces que aparce ese numero en el array la Primera aparicion de este.

Requisito : hacerlo todo recorriendo el array solo una vez .*/

let numeros = [2, 4, 1, 5, 6, 3];
let numero = Math.floor(Math.random() * 10) + 1;

function Array1(numeros, numero) {
  let contador = 0;
  for (let i = 0; i < numeros.length; i++) {
    if (numero == numeros[i]) contador++;
  }

  return "EL numero " + numero + " parece " + contador;
}

//EJERCICIO 2
/*Crea una funcion que reciba una matriz de cualquier tamaño y devuelva true o false 
si la matriz es simetrica o no.

una matriz es simetrica si cada elemnto en la posicion [i][j] tiene el mismo valor que que cada elemno 
en la posicion[j][i]

requisito : itenta dar el menor numero de vueltas posible. 
[ 1  2  3]
| 2  5  9|
[ 3  6  9]
 */

let matriz = [
  [1, 2, 3],
  [2, 5, 6],
  [3, 6, 9]
];

function matrizSimetrica(matriz) {
  let simetrica = true;
  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      if (matriz[i][j] != matriz[j][i]) simetrica = false;
    }
  } return simetrica

}
console.log(matrizSimetrica(matriz));

