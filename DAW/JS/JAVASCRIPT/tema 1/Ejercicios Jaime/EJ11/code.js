function soloUnaVez(a, b) {
    let resultado = [];

    for (let i = 0; i < a.length; i++) {
        let veces = 0;

        for (let j = 0; j < a.length; j++) {
            if (a[i] === a[j]) {
                veces++;
            }
        }

        for (let j = 0; j < b.length; j++) {
            if (a[i] === b[j]) {
                veces++;
            }
        }

        if (veces === 1) {
            resultado.push(a[i]);
        }
    }

    for (let i = 0; i < b.length; i++) {
        let veces = 0;

        for (let j = 0; j < a.length; j++) {
            if (b[i] === a[j]) {
                veces++;
            }
        }

        for (let j = 0; j < b.length; j++) {
            if (b[i] === b[j]) {
                veces++;
            }
        }

        if (veces === 1) {
            resultado.push(b[i]);
        }
    }

    return resultado;
}



console.log(soloUnaVez([1, 2, 3, 3], [3, 2, 1, 4, 5]));
console.log(soloUnaVez(["Ray", "Jose", "Dani"], ["Dani", "Jose", "Ivan"]));
console.log(soloUnaVez([77, "ciao"], [78, 42, "ciao"]));
console.log(soloUnaVez([1, 2, 3, 3], [3, 2, 1, 4, 5, 4]));
