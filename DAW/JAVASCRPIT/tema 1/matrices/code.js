//Matrices

/*
let una = new Array(2);

let dos = new Array(2);

let tres = new Array(2);

let total= new Array(una,dos,tres);
console.log(total);
*//*
//matriz 2
function todo() {
  let matriz2 = [[], [], []];
  // no ponemos matrizz [i] prq tenemos i = 0
  let colomnas = 3;
  for (let i = 0; i < matriz2.length; i++) {
    for (let j = 0; j < colomnas; j++) {
      if (i % 2 == 0) matriz2[i][j] = 12;
      else matriz2[i][j] = -1;
    }
  }
  //console.log(matriz2);

  
12 12 12
01 01 01
12 12 12 

let resultado="";
  for (let i = 0; i < matriz2.length; i++) {
    for (let j = 0; j < matriz2[i].length; j++) {
      if (matriz2[i][j] > 0 && matriz2[i][j] < 10) {
       resultado += "0" ;
      }
     resultado+=matriz2[i][j] + " ";
    }
    resultado+="\n";
  }
  console.log(resultado);
  
}
todo();
*/
let numero = 6.87;
//numero+=""; //chapuza
//numero = string(numero);
numero = numero.toString;
console.log(typeof numero);

//cadenas
let frase = "sigues al conejo blanco , NEO";

let resultado = frase.toLowerCase();
console.log(resultado);

let resultado2=frase.charAt();
console.log(resultado2);

let resultado3=frase.lastIndexOf(1);
console.log(resultado3);

let resultado4 =frase.split(",")
console.log(resultado4);




