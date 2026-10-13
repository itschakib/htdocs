//Accedemos a los elemntos del DOM
let tabla = document.getElementById("tabla");
console.log(tabla);

//Boton a cambiamos anchura y altura  y actulizamos esos valores
let botonA = (document.getElementById("botonA").onclick = function () {
  let nuevaAnchura = parseInt(prompt("Introduce la nueva archura"));
  let nuevaAltura = parseInt(prompt("Introduce la nueva altura"));

  //actulazo valores
  // tabla.width=nuevaAnchura+"px";
  tabla.setAttribute("width", nuevaAnchura + "px");
  tabla.setAttribute("height", nuevaAltura + "px");
});

//boton B sumar al borde
let botonB = (document.getElementById("botonB").onclick = function () {
  let valor = Number(prompt("INTRODUCE UN VALOR"));
  let borde = Number(tabla.getAttribute("border"));
  tabla.setAttribute("border", borde + valor);
});

//boton C cambiamos de alineacion
let botonC = (document.getElementById("botonC").onclick = function () {
  let posicion = prompt("centre,left o right");
  tabla.setAttribute("align", posicion);
});
