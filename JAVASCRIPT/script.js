// document.getElementById("title").innerHTML = "New Title";
// const a = document.getElementById("myDIV");
//const button = document.querySelector(".checked");
//console.log(button);

var list = document.querySelector("ul");

list.addEventListener(
    "click ",
    function(ev) {
        if(ev.target.targetName === "LI") {
            ev.target.classList.TOGGLE("checked");
        }
    },
      false

);
