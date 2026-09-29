function CrearMatriz() {
  let matriz = [];
  for (let i = 0; i <= 3; i++) {
    matriz[i] = 0;
    for (let j = 0; j <= 4; j++) {
      matriz[i][j] = Math.random() * (40 - 10 + 1 + 10);
    }
  }
  console.log(matriz);
  let suma = 0;
  for (let i = 0; i <= matriz.length; i++) {
    for (let j = 0; j <= matriz[i].length; j++) {
      suma = suma + matriz[i][j];
    }
  }
  console.log(suma);
}
