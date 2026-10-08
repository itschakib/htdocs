//Ejercicio 1

/*Desarrolla un script que, al pulsar el botón correspondiente, haga uso de prompt para
pedir al usuario un número entero positivo. Si el usuario no introduce un número
entero positivo, el programa debe volver a pedirlo.
A continuación hay que indicar si ese número es un ‘Número Medac’ o no lo es.
Se considera que un número es ‘Numero Medac’ si: es de 5 cifras y además es par.*/

function ejercicio1() {}

//Ejercicio 2

function ejercicio2() {
  alert("Dame 10 calificaciones enteras(un numero entre 0 y 10)");

  let menores = 0;
  let aprobados = 0;
  let notables = 0;
  let sobresalientes = 0;

  for (let i = 0; i <= 10; i++) {
    let numero2 = 0;
    do {
      numero2 = parseInt(prompt("Dame el " + i + " numero"));
      if (numero2 < 0) {
        alert("el num es negativo atenta otra vez");
      }
    } while (numero2 < 0);

    if (numero2 < 5) {
      menores++;
    } else if (5 < numero2 < 6) {
      aprobados++;
    } else if (7 < notables < 8) {
      notables++;
    } else if (9 < sobresalientes < 10) {
      sobresalientes++;
    }
  }

  alert("El numero de notas menores a 5 es : " + menores);
  alert("El numero de notas aprobados : " + aprobados);
  alert("El numero de notas notables : " + notables);
  alert("El numero de notas sobresalientes : " + sobresalientes);
}

//Ejercicio 3
function ejercicio3() {
  alert("Dame numeros positivos (cuando quieres terminar meta un numero - )");
  //a
  let array3 = [];
  let i = 0;
  do {
    numero3 = parseInt(prompt("Dame el " + i + " numero"));
    if (numero3 < 0) {
      break;
    } else {
      array3[i] = +numero3;
      i++;
    }
  } while (numero3 > 0);

  //b
  let numeros3 = "";

  for (let i = 0; i < array3.length; i++) {
    numeros3 += array3[i] + " ";
  }
  consola(numeros3);
  //c
  let suma = 0;
  for (let i = 0; i < array3.length; i++) {
    suma += array3[i];
  }
  console.log(suma);

  //d
  let num = 0;
  do {
    num = parseInt(prompt("Dame un numero positivo"));
    if (num < 0) {
      alert("NO ATENTA OTRA VEZ!!");
    }
  } while (num < 0);
  console.log(num);

  //e
  let ultimaposcision = 0;
  let contador = 0;
  let primeroPosicion = -1;
  for (let i = 0; i < array3.length; i++) {
    if (num == array3[i]) {
      contador++;
      if (contador == 1) primeroPosicion = i;
      ultimaposcision = i;
    }
  }
  alert(
    "EL numero " +
      num +
      " parece " +
      contador +
      " la primer poscision es " +
      primeroPosicion +
      " su ultima posicion es " +
      ultimaposcision,
  );
}

//Ejercicio4
//a
function ejercicio4() {
  let matriz = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0],
  ];

  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      matriz[i][j] = Math.round(Math.random() * 19 + 2);
    }
  }
  //b
  let resultado = "";

  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      resultado += matriz[i][j] + " ";
    }

    resultado += "\n";
  }

  console.log(resultado);
  //c
  let suma = 0;

  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      suma += matriz[i][j];
    }
  }

  alert("la suma de todo los elementos es " + suma);
  //d
  let copia = [];
  //copiamos el matriz
  for (let i = 0; i < matriz.length; i++) {
    copia[i] = [];
    for (let j = 0; j < matriz[i].length; j++) {
      if (matriz[i][j] > 10) {
        copia[i][j] = 10;
      } else {
        copia[i][j] = matriz[i][j];
      }
    }
  }

  let resultado2 = "";
  //monstramos el nuevo matriz
  for (let i = 0; i < copia.length; i++) {
    for (let j = 0; j < copia[i].length; j++) {
      resultado2 += copia[i][j] + " ";
    }

    resultado2 += "\n";
  }

  console.log(resultado2);
  //e
  let num = 0;
  do {
    num += parseInt(prompt("Dame un numero entre 1 y 3"));
  } while (1 > num || num > 3);

  num -= 1;
  alert(num + 1);
  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      matriz[i][num] = copia[i][num];
    }
  }

  let resultado3 = "";
  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      resultado3 += matriz[i][j] + " ";
    }

    resultado3 += "\n";
  }

  console.log(resultado3);
}
