function saludar() {
  
   let edad = parseInt(prompt("Dame tu nombre : "))
   edad +=20;
   alert ("Ahora eres 20 años mas viej@. Tienes " +edad+ "años");
   
  let opcion = confirm("esta usted segur@");

  if (opcion) {
    alert("has aceptado");
  } else {
    alert("has rechazado");
  }
}

function saludar2() {
  
    console.log("Hola, soy el botón 2");
    alert("Hola, soy el botón 2");
    var otra = 90;
    let res = 250;
    if(otra<100){
        res += otra;
    }
    alert(res);
    
}
