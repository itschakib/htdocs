function inicializador() {
  
    let caja = document.getElementById("caja");
    let derecha = document.getElementById("derecha");
    let izquierda = document.getElementById("izquierda");


    // nota el posicion incial es 100px desde arriba y 200px desde la izquierda
    caja.style.position = "absolute";
    caja.style.top = "100px";
    caja.style.left = "200px";

    // se mueve 5px a la derecha 
    derecha.onclick = function() {
        caja.style.left = (parseInt(caja.style.left) + 5) + "px";
    };

    // se mueve 5px a la derecha 
    izquierda.onclick = function() {
      //aqui podemos cambiar le tambien style.right y ponemos + 5 o podemos 
      //utilizar el mismo left y solo le quitamos 5px
        caja.style.left = (parseInt(caja.style.left) - 5) + "px";
    };
}

window.onload = inicializador;