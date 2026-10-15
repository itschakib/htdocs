let imagen = document.getElementById("imagen");

// Al pasar el  mouse de arriba 
imagen.onmouseover = function () {
    imagen.src = "imagen2.jpg";
};

// Al sacar el raton del imagen
imagen.onmouseout = function () {
    imagen.src = "imagen1.jpg";
};