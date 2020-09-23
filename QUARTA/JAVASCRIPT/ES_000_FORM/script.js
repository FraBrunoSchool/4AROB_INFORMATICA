const CaricaCombo = () => {
  // inizializzazione menù dropdown
  frm.cboEta.length = 13
  for (k = 1; k < 12; k++) {
    frm.cboEta.options[k].text = 9 + k
    frm.cboEta.options[k].value = 9 + k
  }
  frm.cboEta.options[12].text = "oltre"
  frm.cboEta.options[12].value = 21
  /*
    .text --> valore al pulsante
    .value --> gli assegna il valore
  */
};

const Submit = (s) => {
  document.getElementById("form_id").remove()
  document.getElementById("sub").classList.toggle("hide")
  document.getElementById("data").innerHTML = s
  document.getElementById("data").style.width = "300px"
  document.getElementById("data").style.position = "absolute"
  document.getElementById("data").style.left = "50%"
  document.getElementById("data").style.transform = "translateX(-50%)"
};

const Conferma = () => {
  const REGEX = /^[A-Z][a-z]+$/ //nome con iniziale maiuscola
  var ok = true;

  with (frm) {
    if (document.getElementById("txtNome").value == "" || !REGEX.test(txtNome.value)) {
      alert("Inserire nome")
      document.getElementById("txtNome").focus()
    } else {
      if (Tel.value == "" || isNaN(Tel.value)) { //devono essere in quest'ordine perechè isNaN("")=false
        txtTel.select()
        alert("Inserire un numero di telefono")
      } else {
        if ((!radSexF.checked) && (!radSexM.checked)) alert("seleziona il sesso")
        else {
          if (cboEta.value == 0) alert("inserisci età")
          else {
            if (cboEta.value < 18) var s = "Ciao " + txtNome.value + " hai inserito i seguenti dati:\n"
            else {
              if (radSexF.checked) var s = "Buongiorno Sig.ra " + txtNome.value + " ha inserito i seguenti dati:\n"
              else var s = "Buongiorno Sig. " + txtNome.value + " ha inserito i seguenti dati:\n"
            }
            s += "Numero di telefono: " + Tel.value + "\n"
            if (chkF.checked || chkGB.checked) {
              s += "Lingue parlate: "
              if (chkF.checked) s += " " + chkF.value
              if (chkGB.checked) s += " " + chkGB.value
            }
            if (area1.value != "") s += "\nCommenti: " + area1.value
            alert(s)
            Submit(s)
          }
        }
      }
    }
  }
};

const ConfermaAnnulla = () => {
  //se preme ok restituisce true e verrà anche eseguita la reset(), operazione associata di default al pulsante
  return confirm('Sei sicuro di voler cancellare i dati già inseriti?')
};
