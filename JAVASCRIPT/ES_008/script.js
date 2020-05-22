/*
10.	Creare un oggetto Lezione con le proprietà giorno, ora,
materia, docente, aula. Presentare in una tabella
l'orario della settimana e quando si fa passa il mouse
in una cella compare il nome del docente e l'aula.
*/

var lezione;

function creazione() {
  if (window.FileList && window.File && window.FileReader) {
		document.getElementById('file-selector').addEventListener('change', caricaTesto);
	}
  console.log(lezione);
}

function caricaTesto(event){
		output.src = '';
		status.textContent = '';
		const file = event.target.files[0]; //prende il primo file letto

		if (!file.type) {
			status.textContent = 'Error: The File.type property does not appear to be supported on this browser.';
			return;
		}

		//Crea il FileReader
		const reader = new FileReader();

		//si assegna il gestore dell'evento load: se la lettura va a buon fine esegue la funzione anonima che visualizza il contenuto
		reader.addEventListener('load', event => {
			//frm.style.visibility = "visible"
			output.innerHTML = event.target.result
      lezione = event.target.result;
      console.log(lezione);
		});

		//legge il file come un file di testo
		reader.readAsText(file);
	}
