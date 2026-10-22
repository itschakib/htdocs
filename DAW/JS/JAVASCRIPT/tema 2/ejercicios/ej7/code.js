
// EJERCICIO 7 - TABLA DE COLORES

let celdas = document.querySelectorAll("#tabla td");


// APARTADO A
// Cada vez que pulsamos una celda, se pone negra.

/*
celdas.forEach(function (celda) {

    celda.onclick = function () {
        this.style.backgroundColor = "black";
    };

});
*/


// APARTADO B
// Cada vez que pulsamos una celda, cambia entre negro y blanco.

/*
celdas.forEach(function (celda) {

    celda.onclick = function () {

        if (this.style.backgroundColor == "black") {
            this.style.backgroundColor = "white";
        } else {
            this.style.backgroundColor = "black";
        }

    };

});
*/


// APARTADO C
// Cada vez que pulsamos una celda, cambia entre cuatro colores.

let colores = ["black", "red", "blue", "green"];

celdas.forEach(function (celda) {

    celda.dataset.posicion = 0;

    celda.onclick = function () {

        let posicion = Number(this.dataset.posicion);

        this.style.backgroundColor = colores[posicion];

        posicion++;

        if (posicion == colores.length) {
            posicion = 0;
        }

        this.dataset.posicion = posicion;
    };

});
