let fotos = [
    "1.png",
    "2.png",
    "3.png",
    "4.png",
];

let posicion = 0;
let foto = document.getElementById("foto");
let anterior = document.getElementById("anterior");
let siguiente = document.getElementById("siguiente");

siguiente.onclick = function () {
    if (posicion < fotos.length - 1) {
        posicion++;
        foto.src = fotos[posicion];
    }

    comprobarBotones();
};

anterior.onclick = function () {
    if (posicion > 0) {
        posicion--;
        foto.src = fotos[posicion];
    }

    comprobarBotones();
};

function comprobarBotones() {
    anterior.disabled = posicion == 0;
    siguiente.disabled = posicion == fotos.length - 1;
}