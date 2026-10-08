// MATRICES

let una = new Array(2);
let dos = new Array(2);
let tres = new Array(2);

let total = new Array(una, dos, tres);

console.log(total);


// MATRIZ 2

function todo() {

    let matriz2 = [[], [], []];
    let columnas = 3;

    for (let i = 0; i < matriz2.length; i++) {

        for (let j = 0; j < columnas; j++) {

            if (i % 2 == 0)
                matriz2[i][j] = 12;
            else
                matriz2[i][j] = -1;
        }
    }

    let resultado = "";

    for (let i = 0; i < matriz2.length; i++) {

        for (let j = 0; j < matriz2[i].length; j++) {

            if (matriz2[i][j] > 0 && matriz2[i][j] < 10) {
                resultado += "0";
            }

            resultado += matriz2[i][j] + " ";
        }

        resultado += "\n";
    }

    console.log(resultado);
}

todo();


// TO STRING

let numero = 6.87;

numero = numero.toString();

console.log(numero);
console.log(typeof numero);