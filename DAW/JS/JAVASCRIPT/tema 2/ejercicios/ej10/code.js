function inicializador() {
    let rojo = document.getElementById("rojo");
    let azul = document.getElementById("azul");
    let verde = document.getElementById("verde");

    rojo.style.width = "100px";
    rojo.style.height = "100px";
    rojo.style.backgroundColor = "red";

    azul.style.width = "100px";
    azul.style.height = "100px";
    azul.style.backgroundColor = "blue";

    verde.style.width = "100px";
    verde.style.height = "100px";
    verde.style.backgroundColor = "green";

    rojo.onmouseover = function() {
        document.body.style.backgroundColor = "red";
    };

    azul.onmouseover = function() {
        document.body.style.backgroundColor = "blue";
    };

    verde.onmouseover = function() {
        document.body.style.backgroundColor = "green";
    };

    rojo.onmouseout = function() {
        document.body.style.backgroundColor = "white";
    };

    azul.onmouseout = function() {
        document.body.style.backgroundColor = "white";
    };

    verde.onmouseout = function() {
        document.body.style.backgroundColor = "white";
    };
}

window.onload = inicializador;