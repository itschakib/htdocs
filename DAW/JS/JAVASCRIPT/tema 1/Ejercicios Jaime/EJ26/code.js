function EJ26(){
let filas = parseInt(prompt("Dame los numeros de filas"));

while (filas < 3 || filas > 7) {
    filas = parseInt(prompt("Incorrecto atenta otra vez un numero entre 3 y 7"));
}

let columnas = parseInt(prompt("Dame los numeros de colomnas"));

while (columnas < 3 || columnas > 7) {
    columnas = parseInt(prompt("Incorrecto atenta otra vez un numero entre 3 y 7"));
}


// MATRIZ ORIGINAL
let ORIGINAL = [];

for (let i = 0; i < filas; i++) {

    ORIGINAL[i] = [];

    for (let j = 0; j < columnas; j++) {
        ORIGINAL[i][j] = Math.random() *( 9 )+ 1;
    }
}


// MATRIZ TRASPUESTA
let transpuesta = [];

for (let i = 0; i < columnas; i++) {

    transpuesta[i] = [];

    for (let j = 0; j < filas; j++) {
        transpuesta[i][j] = ORIGINAL[j][i];
    }
}


// MOSTRAR ORIGINAL
console.log("MATRIZ ORIGINAL:");

for (let i = 0; i < filas; i++) {
    console.log(ORIGINAL[i]);
}


// MOSTRAR TRASPUESTA
console.log("MATRIZ TRASPUESTA:");

for (let i = 0; i < columnas; i++) {
    console.log(transpuesta[i]);

}
}