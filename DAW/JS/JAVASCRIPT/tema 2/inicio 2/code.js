/*========================================================
APUNTES DE DOM EN JAVASCRIPT
========================================================

DOM significa Document Object Model.
El navegador convierte el HTML en un árbol de nodos.
JavaScript puede seleccionar esos elementos, leerlos y modificarlos.

Este archivo contiene ejemplos y pequeñas pruebas.
El HTML carga este archivo con defer, así que el navegador
espera a haber analizado el HTML antes de ejecutar el script.
*/

// ------------------------------------------------------
// 1. SELECCIONAR ELEMENTOS
// ------------------------------------------------------

// Busca el elemento cuyo id sea "titulo".
// El id debe ser único en la página.
let titulo = document.getElementById("titulo");

// Selecciona el primer elemento que coincida con el selector CSS.
// #titulo significa id="titulo".
let primerParrafo = document.querySelector(".texto");

// Selecciona TODOS los elementos que coincidan con el selector.
// .texto significa class="texto".
let parrafos = document.querySelectorAll(".texto");

// Otras formas de selección:
// document.getElementsByTagName("p")       -> todos los <p>
// document.getElementsByClassName("texto")  -> todos los de esa clase
// document.getElementsByName("nombre")      -> elementos con ese atributo name
//
// Diferencia importante:
// querySelector() devuelve el PRIMER elemento que coincide.
// querySelectorAll() devuelve una NodeList con TODOS los que coinciden.
// getElementById() selecciona por id.

// Ejemplo:
// console.log(titulo);
// console.log(primerParrafo);
// console.log(parrafos);

// ------------------------------------------------------
// 2. CONTENIDO: innerHTML, innerText Y textContent
// ------------------------------------------------------

let contenido = document.getElementById("contenido");

// innerText cambia/lee el texto visible.
// contenido.innerText = "Nuevo texto visible";

// textContent cambia/lee el texto sin interpretar etiquetas HTML.
// contenido.textContent = "Nuevo texto";

// innerHTML interpreta el contenido como HTML.
// Ojo: solo usar contenido confiable, porque interpreta etiquetas.
// contenido.innerHTML = "<strong>Texto en negrita</strong>";

// Resumen:
// innerHTML  -> interpreta etiquetas HTML.
// innerText  -> texto visible.
// textContent -> texto del contenido sin interpretar HTML.

// ------------------------------------------------------
// 3. ATRIBUTOS HTML
// ------------------------------------------------------

// getAttribute() lee el valor de un atributo HTML.
// let valor = titulo.getAttribute("id");

// setAttribute() crea o cambia un atributo HTML.
// titulo.setAttribute("title", "Este es el título");

// removeAttribute() elimina un atributo.
// titulo.removeAttribute("title");

// También se pueden usar propiedades directamente cuando existen:
// titulo.id = "titulo";
// Una imagen, por ejemplo, puede usar imagen.src = "foto.jpg".

// ------------------------------------------------------
// 4. MODIFICAR CSS DESDE JAVASCRIPT
// ------------------------------------------------------

let resultadoEstilo = document.getElementById("resultado-estilo");
let botonTamano = document.getElementById("btn-tamano");
let botonColor = document.getElementById("btn-color");
let botonLeerEstilo = document.getElementById("btn-leer-estilo");

// Forma 1: style.propiedad.
// En JavaScript, las propiedades CSS con guion se escriben en camelCase.
// CSS: font-size     JavaScript: fontSize
// CSS: background-color     JavaScript: backgroundColor
botonTamano.addEventListener("click", function () {
  titulo.style.fontSize = "36px";
});

// Forma 2: style.setProperty(nombreCSS, valor).
// Aquí se escribe el nombre de CSS tal cual, con guion si lo tiene.
botonColor.addEventListener("click", function () {
  titulo.style.setProperty("color", "crimson");
});

// Las dos formas anteriores cambian el estilo inline del elemento.
// Ejemplos equivalentes:
// titulo.style.fontSize = "30px";
// titulo.style.setProperty("font-size", "30px");

// setProperty también permite indicar !important como tercer parámetro:
// titulo.style.setProperty("color", "red", "important");

// ------------------------------------------------------
// 5. LEER ESTILOS CON getComputedStyle()
// ------------------------------------------------------

// getComputedStyle(elemento) NO selecciona el elemento.
// Recibe un elemento que ya hemos seleccionado y devuelve
// los estilos calculados que el navegador le está aplicando.
// Puede leer estilos definidos en CSS externo, en <style> o inline.

botonLeerEstilo.addEventListener("click", function () {
  let estilos = window.getComputedStyle(titulo);

  // getPropertyValue usa el nombre CSS normal: "font-size".
  let tamano = estilos.getPropertyValue("font-size");
  let color = estilos.getPropertyValue("color");

  resultadoEstilo.textContent =
    "Tamaño calculado: " + tamano + " | Color calculado: " + color;
});

// Diferencia clave:
// getElementById("titulo") -> obtiene el elemento HTML.
// getComputedStyle(titulo) -> lee los estilos calculados del elemento.
// titulo.style.fontSize = "30px" -> cambia el estilo inline.

// ------------------------------------------------------
// 6. CLASES CSS CON classList
// ------------------------------------------------------

let mensaje = document.getElementById("mensaje");
let botonClase = document.getElementById("btn-clase");

// add() añade una clase.
mensaje.classList.add("destacado");

// remove() elimina una clase.
mensaje.classList.remove("normal");

// contains() comprueba si tiene una clase: devuelve true o false.
// let tieneClase = mensaje.classList.contains("destacado");

// toggle() alterna la clase: si la tiene, la quita; si no, la añade.
botonClase.addEventListener("click", function () {
  mensaje.classList.toggle("destacado");
});

// classList es útil porque cambia clases definidas en CSS
// sin tener que escribir todos los estilos en JavaScript.

// ------------------------------------------------------
// 7. EVENTOS
// ------------------------------------------------------

// Un evento es algo que ocurre, por ejemplo, un clic o un cambio.
// addEventListener("click", funcion) ejecuta la función al hacer clic.
// También existen eventos como "change", "mouseover" y "mouseout".

// Ejemplo con onclick:
// botonClase.onclick = function () {
//     mensaje.classList.toggle("destacado");
// };

// Para una casilla de verificación:
// let casilla = document.getElementById("mi-checkbox");
// if (casilla.checked == true) { ... }
// checked es true cuando está marcada y false cuando no está marcada.

// ------------------------------------------------------
// 8. CAMBIAR TEXTO Y ATRIBUTOS: PRÁCTICA
// ------------------------------------------------------

let botonTexto = document.getElementById("btn-texto");
let botonAtributo = document.getElementById("btn-atributo");

botonTexto.addEventListener("click", function () {
  contenido.textContent = "El texto se ha cambiado desde JavaScript.";
});

botonAtributo.addEventListener("click", function () {
  // Añade el atributo title; al dejar el ratón encima, se muestra el texto.
  contenido.setAttribute("title", "Atributo title añadido con JavaScript");
});

// ------------------------------------------------------
// 9. CREAR Y ELIMINAR NODOS
// ------------------------------------------------------

let entrada = document.getElementById("entrada");
let lista = document.getElementById("lista");
let botonAnadir = document.getElementById("btn-anadir");
let botonEliminar = document.getElementById("btn-eliminar");

botonAnadir.addEventListener("click", function () {
  // trim() elimina espacios al principio y al final.
  let texto = entrada.value.trim();

  // No añadimos un elemento si la entrada está vacía.
  if (texto != "") {
    let nuevoElemento = document.createElement("li");
    nuevoElemento.textContent = texto;
    lista.appendChild(nuevoElemento);
    entrada.value = "";
  }
});

botonEliminar.addEventListener("click", function () {
  // lastElementChild devuelve el último elemento hijo.
  if (lista.lastElementChild != null) {
    lista.removeChild(lista.lastElementChild);
  }
});

// Métodos clave:
// document.createElement("li") -> crea un elemento.
// padre.appendChild(hijo)       -> añade el elemento al final.
// padre.removeChild(hijo)       -> elimina un hijo de ese padre.

// ------------------------------------------------------
// 10. SELECTORES: CONTAR ELEMENTOS
// ------------------------------------------------------

let botonSelectores = document.getElementById("btn-selectores");
let resultadoSelectores = document.getElementById("resultado-selectores");

botonSelectores.addEventListener("click", function () {
  let todosLosParrafos = document.querySelectorAll(".texto");
  resultadoSelectores.textContent =
    "Hay " + todosLosParrafos.length + " párrafos con la clase texto.";
});

// ------------------------------------------------------
// 11. CUÁNDO SE EJECUTA EL JAVASCRIPT
// ------------------------------------------------------

// En este ejemplo, el HTML usa:
// <script src="dom.js" defer></script>
//
// defer hace que el navegador ejecute el archivo después de analizar el HTML.
//
// Otra opción es colocar <script src="dom.js"></script> justo antes de </body>.
//
// También existe:
// document.addEventListener("DOMContentLoaded", function () {
//     // Código que necesita que el HTML esté analizado.
// });
//
// No es necesario usar las tres opciones a la vez. En esta práctica usamos defer.

// ------------------------------------------------------
// RESUMEN PARA EL EXAMEN
// ------------------------------------------------------
//
// Seleccionar:
// document.getElementById("id")
// document.querySelector("selector CSS")
// document.querySelectorAll("selector CSS")
//
// Leer/cambiar contenido:
// elemento.innerHTML
// elemento.innerText
// elemento.textContent
//
// Atributos:
// elemento.getAttribute("title")
// elemento.setAttribute("title", "texto")
// elemento.removeAttribute("title")
//
// CSS:
// elemento.style.fontSize = "30px"
// elemento.style.setProperty("font-size", "30px")
// window.getComputedStyle(elemento).getPropertyValue("font-size")
//
// Clases:
// elemento.classList.add("clase")
// elemento.classList.remove("clase")
// elemento.classList.toggle("clase")
// elemento.classList.contains("clase")
//
// Eventos:
// elemento.addEventListener("click", function () { ... })
//
// Crear/eliminar:
// document.createElement("li")
// padre.appendChild(hijo)
