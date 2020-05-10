/*
  In un form chiedere il nome e il cognome , il sesso tramite oggetti radio
  reimpostato su maschio, se è una donna far comparire una check box
  con "Sposata". Al submit del form controllare che abbia inserito sia
  il nome che il cognome e quindi in base all'ora corrente dire
  "Buongiorno" o "Buonasera" (dopo le 19) e in base al sesso aggiungere signor,
  signorina, signora (es "Buonasera Signora Roberta Molinari" se sono le 20)
*/

let hh;

const OrologioScorrevole = () => {
  let data = new Date();
  hh = data.getHours();
  let mm = data.getMinutes();
  let ss = data.getSeconds();
  let ora = "ORA: " + hh + ":" + mm + ":" + ss;
  document.getElementById("orologio").innerText = ora;
  window.setTimeout("OrologioScorrevole()", 1000);
};

const AggiungiTogliCampo = () => {
  document.getElementById("chkF").classList.toggle("hide")
  document.getElementById("textCheck").classList.toggle("hide")
};

const Submit = () => {
  let nome, cognome, sesso, sposata;
  with (frm) {
    if (document.getElementById("txtNome").value === "") {
      alert("Inserire nome")
      document.getElementById("txtNome").focus()
    } else {
      nome = document.getElementById("txtNome").value
      if (document.getElementById("txtCognome").value === "") {
        alert("Inserire cognome")
        document.getElementById("txtCognome").focus()
      } else {
        cognome = document.getElementById("txtCognome").value
        if (radSexF.checked){
          sesso = radSexF.value
          console.log(sesso)
          if (chkF.checked) sposata = chkF.value
          console.log(sposata)
        } else {
          if (radSexM.checked) sesso = radSexM.value
          console.log(sesso)
        }
        Display(nome, cognome, sesso, sposata)
      }
    }
  }
};

const Display = (nome, cognome, sesso, sposata) => {
  document.getElementById("form_id").remove()
  let strSaluto = "";
  if (hh>19) strSaluto += "BuonaSera "
  else strSaluto += "Buongiorno "
  let strStamp = "Nome: " + nome + " Cognome: " + cognome + "<br>" + "Sesso: " + sesso + "<br>"
  if (sesso==="Femmina"){
    strStamp += "Sei " + (sposata==="Sposata"?sposata:"Single") + "<br>"
    strSaluto += "Signora " + cognome + " " + nome;
  } else strSaluto += "Signor " + cognome + " " + nome;

  document.getElementById("sub").classList.toggle("hide")
  document.getElementById("saluto").innerHTML = strSaluto + "<br> Ha inserito i seguenti dati: <br>"
  document.getElementById("saluto").style.width = "300px"
  document.getElementById("saluto").style.position = "absolute"
  document.getElementById("saluto").style.left = "50%"
  document.getElementById("saluto").style.transform = "translateX(-50%)"
  document.getElementById("data").innerHTML = strStamp
  document.getElementById("data").style.width = "300px"
  document.getElementById("data").style.position = "absolute"
  document.getElementById("data").style.left = "50%"
  document.getElementById("data").style.transform = "translateX(-50%)"
};
