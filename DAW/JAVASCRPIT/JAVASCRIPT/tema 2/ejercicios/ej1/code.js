let enlace = document.getElementById("enlace");

document.getElementById("mostrar").onclick = function () {
    alert("URL: " + enlace.href + "\nTexto: " + enlace.textContent);
};

document.getElementById("cambiar").onclick = function () {
    enlace.href = "https://www.wikipedia.org";
    enlace.textContent = "he cambiado";
};