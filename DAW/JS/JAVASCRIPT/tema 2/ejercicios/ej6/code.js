let botones = document.getElementsByTagName("button");

for (let i = 0; i < botones.length; i++) {
    botones[i].onclick = function () {
        document.body.style.backgroundColor = this.value;
    };
}