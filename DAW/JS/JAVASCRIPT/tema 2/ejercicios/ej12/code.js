function inicializador() {
  /*Aportado a*/

  let caja = document.getElementById("caja");
  let derecha = document.getElementById("derecha");
  let izquierda = document.getElementById("izquierda");

  // EXTRA COSAS
  let arriba = document.getElementById("arriba");
  let abajo = document.getElementById("abajo");

  // nota el posicion incial es 100px desde arriba y 200px desde  la izquierda
  caja.style.position = "absolute";
  caja.style.top = "100px";
  caja.style.left = "200px";

  //Derecha
  derecha.onclick = function () {
    caja.style.left = parseInt(caja.style.left) + 5 + "px";
  };

  //Izquierda
  izquierda.onclick = function () {
    caja.style.left = parseInt(caja.style.left) - 5 + "px";
  };

  //   EXTRA COSAS
  arriba.onclick = function () {
    caja.style.top = parseInt(caja.style.top) - 5 + "px";
  };

  abajo.onclick = function () {
    caja.style.top = parseInt(caja.style.top) + 5 + "px";
  };

  //aportado b

  let cajaB = document.getElementById("cajaB");
  let derechaB = document.getElementById("derechaB");
  let izquierdaB = document.getElementById("izquierdaB");

  cajaB.style.position = "absolute";
  cajaB.style.top = "300px";
  cajaB.style.left = "200px";

  console.log("CAJA: " + cajaB.clientWidth);
  console.log("PANTALLA: " + screen.availWidth);
  console.log("PARAR: " + (screen.availWidth - cajaB.clientWidth));

  derechaB.onclick = function () {
    let posicion = parseInt(cajaB.style.left);
    let limite = window.innerWidth - cajaB.offsetWidth;

    if (posicion + 100 < limite) {
      cajaB.style.left = posicion + 100 + "px";
      console.log(cajaB.style.left);
    }
  };

  izquierdaB.onclick = function () {
    let posicion = parseInt(cajaB.style.left);
    let limite = window.innerWidth - cajaB.offsetWidth;

    if (posicion + 50 > 0) {
      cajaB.style.left = posicion - 50 + "px";
    }
  };

  //aportado c
  let cajaC = document.getElementById("cajaC");
  let imagenC = cajaC.querySelector("img");
  let resetear = document.getElementById("resetear");

  cajaC.style.position = "absolute";
  cajaC.style.top = "500px";
  cajaC.style.left = "200px";

  imagenC.onmouseover = function () {
    cajaC.style.left = parseInt(cajaC.style.left) + 25 + "px";
  };

  resetear.onclick = function () {
    cajaC.style.top = "500px";
    cajaC.style.left = "200px";
  };
}
window.onload = inicializador;
