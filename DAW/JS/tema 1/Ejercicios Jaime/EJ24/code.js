function CrearMatriz() {
  let matriz = [];

  // Crear matriz 3x4
  for (let i = 0; i < 3; i++) {
    matriz[i] = [];

    for (let j = 0; j < 4; j++) {
      matriz[i][j] = Math.floor(Math.random() * 31) + 10;
    }
  }

  console.log(matriz);

  // Variables
  let suma = 0;
  let mayor = matriz[0][0];
  let menor = matriz[0][0];
  let pares = 0;
  let impares = 0;

  // Recorrer la matriz
  for (let i = 0; i < matriz.length; i++) {
    let sumaFila = 0;

    for (let j = 0; j < matriz[i].length; j++) {
      let numero = matriz[i][j];

      suma += numero;
      sumaFila += numero;

      if (numero > mayor) {
        mayor = numero;
      }

      if (numero < menor) {
        menor = numero;
      }

      if (numero % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }

    console.log("Suma fila " + i + ": " + sumaFila);
  }

  // Resultados
  let media = suma / 12;

  console.log("Suma total: " + suma);
  console.log("Media: " + media);
  console.log("Mayor: " + mayor);
  console.log("Menor: " + menor);
  console.log("Pares: " + pares);
  console.log("Impares: " + impares);
}

CrearMatriz();
