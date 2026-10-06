function siglos(){
    let año = parseInt(prompt("Introduce un año: "));
    let siglo = 1;

    while(año>100){
        año=año-100;
        siglo++;
    }
    alert("El siglo es: "+ siglo)
}