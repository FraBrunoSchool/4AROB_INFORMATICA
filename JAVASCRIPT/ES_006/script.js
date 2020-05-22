//viene eseguito durante il caricamento della pagina
var myTable = document.getElementById("tabella");
var myRow = document.getElementById("riga");
var myCell1 = document.getElementById("cella1");
var myCell2 = document.getElementById("cella2");

var listener = function() {
  alert("listener>>My target.id: "+ event.target.id)
  };

//cella1 e 2 avranno due gestori del click
myCell1.addEventListener("click", listener)
myCell2.addEventListener("click", ()=> {
        alert("anonymus>>My target.id: "+event.target.id)});

function cambiaTesto(element){
element.innerHTML = "2";
}

function pos(e){
let s = "pos>>My currentTarget.id=" + e.currentTarget.id + "\n";

switch(e.type){
  case "keypress":
      s += "pos>>codice:" + e.charCode; //Stampa del codice ASCII del tasto premuto
    window.location.reload()
      break;
  case "click":
    e.currentTarget.style="background-color:red";
    //appaiono le coordinate del click
    //interne rispetto al browser
    s += "pos>>x:"+ e.x  + " y:"  +e.y;
    //Stampa coordinate del click relative allo schermo
    s += "\nschermo:("+ e.screenX + "," + e.screenY+ ")\n";
      alert(s);
      break;
}
}
