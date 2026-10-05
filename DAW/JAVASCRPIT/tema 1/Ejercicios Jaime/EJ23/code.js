
function Buscarnumero(matriz, numero) {
  //recorremos las filas
  for (let i = 0; i < matriz.length; i++) {
    //recorremos las columnas de cada fila tambien
    for (let j = 0; j < matriz[i].length; j++) {
      if (matriz[i][j] === numero) {
        return [i, j]; //devuelve la posicion con la fila y la columna
      }
    }
  }
  return [-1, -1]; //si termina de buscar y no hay ninguno devuelve el valor [-1,-1]
}
const matriz=[
    [3,20,9],
    [7,5,8],
    [12,3,4]
];
let numero = 5;
let posicion =Buscarnumero(matriz,numero);
console.log(posicion);
