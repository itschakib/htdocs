function mostrarSpoiler() {
    let spoiler = document.getElementById("spoiler");
    let mensaje = document.getElementById("mensaje");

    if (spoiler.style.display === "none") {
        spoiler.style.display = "block";
        mensaje.textContent = "Ocultar";
    } else {
        spoiler.style.display = "none";
        mensaje.textContent = "Mostrar";
    }
}