// ==========================================
// MATRICES EN JAVASCRIPT
// ==========================================


// 1. CREAR UNA MATRIZ
// Una matriz es un array que contiene otros arrays.

let matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log(matriz);


// ==========================================
// 2. ACCEDER A UN VALOR
// ==========================================

// Primero ponemos la FILA y después la COLUMNA.
// Los índices empiezan en 0.

console.log(matriz[0][0]); // 1
console.log(matriz[0][1]); // 2
console.log(matriz[1][0]); // 4
console.log(matriz[2][2]); // 9


// ==========================================
// 3. CAMBIAR UN VALOR
// ==========================================

matriz[0][0] = 100;

console.log(matriz);

// Ahora:
// [100, 2, 3]
// [4, 5, 6]
// [7, 8, 9]


// ==========================================
// 4. AÑADIR VALORES
// ==========================================

// Podemos añadir un valor a una fila con push().

matriz[0].push(200);

console.log(matriz);

// Primera fila:
// [100, 2, 3, 200]


// ==========================================
// 5. CREAR UNA MATRIZ VACÍA
// ==========================================

let matriz2 = [
    [],
    [],
    []
];


// Podemos poner valores directamente:

matriz2[0][0] = 10;
matriz2[0][1] = 20;
matriz2[1][0] = 30;
matriz2[1][1] = 40;

console.log(matriz2);


// ==========================================
// 6. RECORRER UNA MATRIZ
// ==========================================

// Usamos dos for:
// i → filas
// j → columnas

for (let i = 0; i < matriz.length; i++) {

    for (let j = 0; j < matriz[i].length; j++) {

        console.log(matriz[i][j]);

    }
}


// ==========================================
// 7. MOSTRAR LA MATRIZ COMO TABLA
// ==========================================

let resultado = "";

for (let i = 0; i < matriz.length; i++) {

    for (let j = 0; j < matriz[i].length; j++) {

        resultado += matriz[i][j] + " ";
    }

    resultado += "\n";
}

console.log(resultado);


// ==========================================
// 8. SABER CUÁNTAS FILAS TIENE
// ==========================================

console.log(matriz.length);


// ==========================================
// 9. SABER CUÁNTAS COLUMNAS TIENE
// ==========================================

// Usamos una fila concreta.

console.log(matriz[0].length);


// ==========================================
// 10. FILA Y COLUMNA
// ==========================================

// matriz[i][j]
//
// i = fila
// j = columna
//
// Ejemplo:
//
// matriz[1][2]
//
// fila 1 → [4, 5, 6]
// columna 2 → 6

console.log(matriz[1][2]);


// ==========================================
// 11. CAMBIAR TODOS LOS VALORES
// ==========================================

let matriz3 = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
];

for (let i = 0; i < matriz3.length; i++) {

    for (let j = 0; j < matriz3[i].length; j++) {

        matriz3[i][j] = 5;

    }
}

console.log(matriz3);


// ==========================================
// 12. MATRIZ CON CONDICIONES
// ==========================================

let matriz4 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

for (let i = 0; i < matriz4.length; i++) {

    for (let j = 0; j < matriz4[i].length; j++) {

        if (matriz4[i][j] > 5) {
            matriz4[i][j] = 0;
        }

    }
}

console.log(matriz4);


// ==========================================
// 13. SUMAR TODOS LOS VALORES
// ==========================================

let matriz5 = [
    [1, 2, 3],
    [4, 5, 6]
];

let suma = 0;

for (let i = 0; i < matriz5.length; i++) {

    for (let j = 0; j < matriz5[i].length; j++) {

        suma += matriz5[i][j];

    }
}

console.log("Suma: " + suma);


// ==========================================
// 14. MATRIZ CREADA CON FOR
// ==========================================

let matriz6 = [[], [], []];

let columnas = 4;

for (let i = 0; i < matriz6.length; i++) {

    for (let j = 0; j < columnas; j++) {

        matriz6[i][j] = 0;

    }
}

console.log(matriz6);


// ==========================================
// 15. PONER VALORES DEPENDIENDO DE LA FILA
// ==========================================

let matriz7 = [[], [], []];

for (let i = 0; i < matriz7.length; i++) {

    for (let j = 0; j < 3; j++) {

        if (i % 2 == 0) {
            matriz7[i][j] = 12;
        } else {
            matriz7[i][j] = -1;
        }

    }
}

console.log(matriz7);

/*
Resultado:

12  12  12
-1  -1  -1
12  12  12
*/


// ==========================================
// 16. MATRIZ CON STRINGS
// ==========================================

let nombres = [
    ["Juan", "Ana"],
    ["Luis", "Sara"]
];

console.log(nombres[0][0]); // Juan
console.log(nombres[1][1]); // Sara


// ==========================================
// 17. MATRIZ CON NÚMEROS Y STRINGS
// ==========================================

let datos = [
    ["Juan", 20],
    ["Ana", 22],
    ["Luis", 19]
];

console.log(datos[0][0]); // Juan
console.log(datos[0][1]); // 20


// ==========================================
// 18. RECORRER FILAS Y COLUMNAS
// ==========================================

let matriz8 = [
    [10, 20, 30],
    [40, 50, 60]
];

for (let i = 0; i < matriz8.length; i++) {

    console.log("Fila " + i);

    for (let j = 0; j < matriz8[i].length; j++) {

        console.log("Columna " + j + ": " + matriz8[i][j]);

    }
}


// ==========================================
// 19. CREAR UNA MATRIZ CON new Array()
// ==========================================

let fila1 = new Array(3);
let fila2 = new Array(3);
let fila3 = new Array(3);

let matriz9 = new Array(fila1, fila2, fila3);

console.log(matriz9);


// ==========================================
// IMPORTANTE
// ==========================================

/*
Una matriz:

[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

Tiene:

3 filas
3 columnas

Para acceder:

matriz[0][0] → 1
matriz[0][1] → 2
matriz[1][0] → 4
matriz[2][2] → 9


RECUERDA:

matriz[i][j]

i → fila
j → columna


Para recorrer una matriz normalmente usamos:

for (let i = 0; i < matriz.length; i++) {

    for (let j = 0; j < matriz[i].length; j++) {

        console.log(matriz[i][j]);

    }
}


IMPORTANTE:
Los índices empiezan en 0.

Primera fila    → 0
Segunda fila    → 1
Tercera fila    → 2

Primera columna → 0
Segunda columna → 1
Tercera columna → 2
*/