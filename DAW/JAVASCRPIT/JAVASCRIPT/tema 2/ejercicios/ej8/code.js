let imagen = document.getElementById("imagen");

// Guardamos la ruta original
let imagenOriginal = imagen.src;

// Cuando el ratón entra
imagen.onmouseover = function () {
    imagen.src = "https://picsum.photos/id/20/400/250";
};

// Cuando el ratón sale
imagen.onmouseout = function () {
    imagen.src = imagenOriginal;
};