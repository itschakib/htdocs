let medidor = document.getElementById("medidor");
let botonMeter = document.getElementById("botonMeter");

let progreso = document.getElementById("progreso");
let botonProgress = document.getElementById("botonProgress");

let mensaje = document.getElementById("mensaje");
let mensaje2 = document.getElementById("mensaje2");

// metemos
botonMeter.onclick = function () {
  if (medidor.value >= 100) {
    medidor.value = 0;
  }
  this.disabled = true; //bloqueo el boton
  mensaje.style.display = "none";
  let intervalo1 = setInterval(function () {
    medidor.value += 10;

    if (medidor.value >= 100) {
      clearInterval(intervalo1);
      mensaje.style.display = "block";
      this.disabled = false; //bloqueo el boton
    }
  }, 500);
};

// progress
botonProgress.onclick = function () {
  if (progreso.value >= 100) {
    progreso.value = 0;
  }
  mensaje2.style.display = "none";
  let intervalo2 = setInterval(function () {
    progreso.value += 10;
    if (progreso.value >= 100) {
      clearInterval(intervalo2);
      mensaje2.style.display = "block";
    }
  }, 500);
};
