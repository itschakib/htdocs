function inicializador() {
  let div1 = document.getElementById("rojo");
  let div2 = document.getElementById("azul");
  let div3 = document.getElementById("verde");

  div1.style.width = "300px";
  div1.style.height = "100px";
  div1.style.backgroundColor = "red";

  div2.style.width = "300px";
  div2.style.height = "100px";
  div2.style.backgroundColor = "blue";

  div3.style.width = "300px";
  div3.style.height = "100px";
  div3.style.backgroundColor = "green";
/*
  div2.style.visibility = "hidden";

  // mostrarlo  el segundo div solo al pasar el raton por el primero
  div1.onmouseover = function () {
    div2.style.visibility = "visible";
  };

  // volver a ocultarlo el segundo div cuando el raton sale del primero
  div1.onmouseout = function () {
    div2.style.visibility = "hidden";
  };
*/


  // ocultar el segundo div
  div2.style.display = "none";

  // mostrarlo cuando pasamos el raton por el primer div
  div1.onmouseover = function () {
    div2.style.display = "block";
  };

  // ocultarlo cuando sacamos el raton del primer div
  div1.onmouseout = function () {
    div2.style.display = "none";
  };
}

window.onload = inicializador;
