function numeros() {
  let a = parseInt(prompt("Introduce el primero"));
  let b = parseInt(prompt("Introduce el segundo"));

  let menor;
  let mayor;

  if (a < b) {
    menor = a;
    mayor = b;
  } else {
    menor = b;
    mayor = a;
  }

  let lista = [];

  for (let i = menor; i <= mayor; i++) {
    lista.push(i);
  }
  alert("Menor es " + menor + " y mayor es " + mayor);
  alert(lista);
}
function positivos() {
  let lista2 = [7, -20, -3, 15, 10, 22];
  let suma = 0;
  for (let i = 0; i <= lista2.length; i++) {
    if (lista2[i] > 0) {
      suma += lista2[i];
    }
  }
  alert(suma);
}
