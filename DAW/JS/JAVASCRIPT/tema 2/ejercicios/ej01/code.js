//accedemos a los elementos del dom
let volumen = document.getElementById("btn-volumen");
let ecualizador = document.getElementById("btn-ecualizador");
let mudo = document.getElementById("chk-mute");

// APARTADO A
volumen.classList.add("active", "highlighted");

ecualizador.classList.remove("active", "highlighted");
ecualizador.classList.add("inactive");

// APARTADO B
//boton volume
volumen.onclick = function () {
  volumen.classList.toggle("active");
  volumen.classList.toggle("highlighted");
};

// boton ecualizador
ecualizador.onclick = function () {
  if (!volumen.classList.contains("active")) {
    ecualizador.classList.add("active");
    ecualizador.classList.remove("inactive");
  } else {
    alert("No puedes activar el ecualizador mientras suena la pista.");
  }
};

// APARTADO C
// compartamiento de checkBox

mudo.onchange = function () {
  if (mudo.checked == false) {
    volumen.classList.add("disabled");
    ecualizador.classList.add("disabled");
  } else {
    volumen.classList.remove("disabled");
    ecualizador.classList.remove("disabled");
  }
};