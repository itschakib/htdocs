let numero = document.getElementById("numero");

document.getElementById("sumar").onclick = function () {
    numero.textContent = Number(numero.textContent) + 1;
};

document.getElementById("restar").onclick = function () {
    numero.textContent = Number(numero.textContent) - 1;
};