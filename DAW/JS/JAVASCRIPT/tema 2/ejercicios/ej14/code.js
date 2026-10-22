let apartados = document.querySelectorAll(".apartado");
let submenus = document.querySelectorAll(".submenu");

for (let i = 0; i < apartados.length; i++) {

    apartados[i].onmousedown = function () {

        for (let j = 0; j < submenus.length; j++) {
            submenus[j].style.display = "none";
        }

        if (i < submenus.length) {
            if (submenus[i].style.display == "none") {
                submenus[i].style.display = "block";
            }
        }

    };

}