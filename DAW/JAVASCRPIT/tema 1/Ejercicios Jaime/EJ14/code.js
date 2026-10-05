function sumaMayor(numeros) {
    let mayor =-Infinity;

    for (let i = 1; i < numeros.length - 1; i++) {
        let suma = numeros[i] + numeros[i + 1];

        if (suma > mayor) mayor = suma;
        
        
    }

    return mayor;
}

let numeros = [2, 4, 1, 5, 6, 3];

console.log(sumaMayor(numeros));
