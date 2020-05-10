/*
  Verificare che da un prompt l'utente abbia inserito qualcosa
  e non abbia premuto annulla (return null)
*/
var OnPageLoad = () => {
  let testo = prompt("Se vuoi inserisci qualcosa")
  let body = document.getElementsByTagName("body")[0]
  let paragrafo = document.createElement("p")
  body.appendChild(paragrafo)
  if (testo == null || testo=="") paragrafo.innerHTML = "Non hai inserito nulla"
  else paragrafo.innerHTML = "Hai inserito: " + testo

}
