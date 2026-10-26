let tabla = document.getElementById("tabla");

// Botón 1: anchura y altura
document.getElementById("medidas").onclick = function () {
    alert("Anchura: " + tabla.width + "\nAltura: " + tabla.height);

    let anchura = prompt("Introduce la nueva anchura:");
    let altura = prompt("Introduce la nueva altura:");

    tabla.width = anchura;
    tabla.height = altura;
};

// Botón 2: borde
document.getElementById("borde").onclick = function () {
    alert("Borde actual: " + tabla.border);

    let nuevoBorde = prompt("Introduce el nuevo borde:");
    tabla.border = nuevoBorde;
};

// Botón 3: alineación
document.getElementById("alineacion").onclick = function () {
    if (tabla.align == "center") {
        tabla.align = "right";
    } else if (tabla.align == "right") {
        tabla.align = "left";
    } else {
        tabla.align = "center";
    }
};