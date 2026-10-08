// ======================================================
// 1. VARIABLES
// ======================================================

// let -> variable que podemos cambiar
let num = 10;
num = 20;

// var -> también podemos cambiarla y redeclararla
var otra = 90;

otra = 100;

// let no se puede redeclarar:
// let num = 30; // ERROR

// ======================================================
// 2. TIPOS DE DATOS
// ======================================================

// Number -> números
let edad = 20;

// String -> texto
let nombre = "Salva";

// Boolean -> true / false
let mayor = true;

// undefined -> no tiene valor
let dato;

// null -> valor vacío
let vacio = null;

// typeof -> saber el tipo
console.log(typeof edad); // number
console.log(typeof nombre); // string
console.log(typeof mayor); // boolean

// ======================================================
// 3. TEMPLATE STRING
// ======================================================

// Se utilizan ` ` y ${}

let titulo = "Mendigo";
let edad2 = 70;

let texto = `Salva es un ${titulo} de ${edad2} años`;

console.log(texto);

// ======================================================
//cadenas
// ======================================================

let frase = "sigues al conejo blanco , NEO";

let resultado = frase.toLowerCase();
console.log(resultado);

let resultado2 = frase.charAt();
console.log(resultado2);

let resultado3 = frase.lastIndexOf(1);
console.log(resultado3);

let resultado4 = frase.split(",");
console.log(resultado4);

// ======================================================
// 4. OPERADORES
// ======================================================

// Matemáticos:
// +  -  *  /  %

let a = 10;
let b = 3;

console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);
console.log(a % b);

// Incrementar / disminuir
a++;
a--;

// Asignación
a += 5; // a = a + 5
a -= 2; // a = a - 2

// ======================================================
// 5. STRING Y +
// ======================================================

// + también sirve para concatenar

let nombre2 = "Salva";
let apellido = "Garcia";

console.log(nombre2 + " " + apellido);

// Si hay String, normalmente concatena

console.log(10 + "5");
// "105"

// ======================================================
// 6. PROMPT Y CONVERSIÓN
// ======================================================

// prompt() devuelve SIEMPRE String

// let numero = prompt("Introduce un número");

// Para convertir:

let numero = parseInt("25"); // entero

let numero2 = Number("25"); // número

let texto2 = String(25); // String

let booleano = Boolean(0); // false

// ======================================================
// 7. COERCIÓN
// ======================================================

// JavaScript puede convertir tipos automáticamente.

// Implícita -> JavaScript lo hace solo

console.log(10 + "5");
// "105"

console.log(10 - "5");
// 5

console.log("3" * 2);
// 6

// Explícita -> nosotros hacemos la conversión

Number("10");
String(10);
Boolean(0);

// ======================================================
// 8. == VS ===
// ======================================================

// == -> permite coerción

console.log("1" == 1);
// true

// === -> compara valor Y tipo

console.log("1" === 1);
// false

// MEMORIZAR:
//
// ==  -> con coerción
// === -> sin coerción

// ======================================================
// 9. OPERADORES LÓGICOS
// ======================================================

// && -> AND
// || -> OR
// !  -> NOT

console.log(true && false);
// false

console.log(true || false);
// true

console.log(!true);
// false

// ======================================================
// 10. CONDICIONALES
// ======================================================

let numero3 = 10;

if (numero3 > 10) {
  console.log("Mayor");
} else if (numero3 == 10) {
  console.log("Igual");
} else {
  console.log("Menor");
}

// ======================================================
// 11. SWITCH
// ======================================================

let opcion = 2;

switch (opcion) {
  case 1:
    console.log("Uno");
    break;

  case 2:
    console.log("Dos");
    break;

  default:
    console.log("Otro");
}

// break -> salir del switch

// ======================================================
// 12. BUCLES
// ======================================================

// FOR -> repetir un número determinado de veces

for (let i = 0; i < 5; i++) {
  console.log(i);
}

// WHILE -> mientras se cumpla la condición

let i = 0;

while (i < 5) {
  console.log(i);

  i++;
}

// DO WHILE -> se ejecuta mínimo una vez

do {
  console.log("Hola");
} while (false);

// break -> salir del bucle
// continue -> saltar a la siguiente vuelta

// ======================================================
// 13. BUCLES ANIDADOS
// ======================================================

for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 2; j++) {
    console.log(i, j);
  }
}

// ======================================================
// ⭐ PARA MEMORIZAR
// ======================================================

/*
let       -> variable
var       -> variable

Number    -> número
String    -> texto
Boolean   -> true / false

typeof    -> saber el tipo

prompt()  -> devuelve String
parseInt() -> convierte a entero
Number()  -> convierte a número

==        -> comparación con coerción
===       -> comparación valor + tipo

&&        -> AND
||        -> OR
!         -> NOT

if        -> condición
switch    -> varias opciones

for       -> repetir
while     -> mientras
do while  -> mínimo una vez

break     -> salir
continue  -> siguiente vuelta

Array     -> posiciones empiezan en 0
length    -> tamaño del Array

+         -> suma o concatenación
*/
