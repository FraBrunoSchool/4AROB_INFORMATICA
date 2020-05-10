/*
  In un form chiedere il nome e il cognome , il sesso tramite oggetti radio
  reimpostato su maschio, se è una donna far comparire una check box
  con "Sposata". Al submit del form controllare che abbia inserito sia
  il nome che il cognome e quindi in base all'ora corrente dire
  "Buongiorno" o "Buonasera" (dopo le 19) e in base al sesso aggiungere signor,
  signorina, signora (es "Buonasera Signora Roberta Molinari" se sono le 20)
*/

var OrologioScorrevole =() =>{
  var data = new Date();
  var hh = data.getHours();
  var mm = data.getMinutes();
  var ss = data.getSeconds();
  var ora = hh + ":" + mm + ":" + ss;
  document.getElementById("orologio").innerText = ora;
  window.setTimeout("OrologioScorrevole()", 1000);
}

var AggiungiTogliCampo = () => {
  document.getElementById("chkF").classList.toggle("hide")
  document.getElementById("textCheck").classList.toggle("hide")
}

var Submit = () => {
  with(frm) {
    if (document.getElementById("txtNome").value == "" {
      alert("Inserire nome")
      document.getElementById("txtNome").focus()
    }else{
      if (document.getElementById("txtCognome").value == "" {
        alert("Inserire nome")
        document.getElementById("txtCognome").focus()
      }
    }
}
