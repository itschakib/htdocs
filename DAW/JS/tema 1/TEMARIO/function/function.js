// ==========================================
// FUNCIONES EN JAVASCRIPT
// ==========================================


// 1. FUNCIÓN NORMAL
// Se define y después la llamamos.

function suma(a, b) {
    return a + b;
}

let resultado = suma(3, 7);
console.log(resultado); // 10


// 2. PARÁMETROS POR DEFECTO
// Si no pasamos un valor, utiliza el valor indicado.

function saludar(nombre = "Juan") {
    console.log("Hola " + nombre);
}

saludar();        // Hola Juan
saludar("Carlos"); // Hola Carlos


// 3. FUNCIÓN ANÓNIMA
// Es una función sin nombre guardada en una variable.

let multiplicar = function(a, b) {
    return a * b;
};

console.log(multiplicar(2, 4)); // 8


// 4. IIFE
// Se ejecuta automáticamente sin llamarla después.

(function() {
    console.log("Hola desde una IIFE");
})();


// 5. ARROW FUNCTION
// Es una forma más corta de escribir una función.

let restar = (a, b) => a - b;

console.log(restar(10, 3)); // 7


// Con { } normalmente necesitamos return.

let dividir = (a, b) => {
    return a / b;
};

console.log(dividir(10, 2)); // 5


// 6. forEach()
// Recorre todos los elementos de una lista.

let lista = [1, 2, 3, 4];

lista.forEach(function(ele) {
    console.log(ele * 2);
});
// 2 4 6 8


// También podemos usar Arrow Function.

lista.forEach((ele) => console.log(ele));


// 7. some()
// Pregunta si AL MENOS UNO cumple la condición.
// Devuelve true o false.

console.log(lista.some((ele) => ele > 3));
// true


// 8. every()
// Pregunta si TODOS cumplen la condición.
// Devuelve true o false.

console.log(lista.every((ele) => ele > 0));
// true


// 9. filter()
// Se queda con los elementos que cumplen la condición.
// Devuelve una NUEVA lista.

let mayores = lista.filter((ele) => ele > 2);

console.log(mayores);
// [3, 4]


// 10. push()
// Añade un elemento al FINAL de la lista.

lista.push(5);

console.log(lista);
// [1, 2, 3, 4, 5]


// 11. map()
// Modifica cada elemento y crea una NUEVA lista.

let dobles = lista.map((ele) => ele * 2);

console.log(dobles);
// [2, 4, 6, 8, 10]


// ==========================================
// PARA RECORDAR
// ==========================================

// forEach() → recorrer
// some()    → ¿hay alguno?
// every()   → ¿son todos?
// filter()  → ¿cuáles cumplen?
// push()    → añadir al final
// map()     → transformar
// IIFE      → se ejecuta automáticamente
// Arrow =>  → forma corta de una función