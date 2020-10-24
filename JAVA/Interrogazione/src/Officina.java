import java.util.Date;
import java.util.Vector;

public class Officina {
    private String nome;
    private String indirizzo;
    private Vector<Dipendente> dipendenti;
    private Vector<Riparazione> riparazioni;

    public Officina(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        dipendenti=new Vector<Dipendente>();
        riparazioni=new Vector<Riparazione>();
    }

    public int getNumeroDipendenti(){
        return dipendenti.size();
    }

    public void addDipendente(String nome){
        dipendenti.add(new Dipendente(nome));
    }

    public class Dipendente {
        private String nome;

        public Dipendente(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Dipendente{" +
                    "\n\tnome='" + nome + '\'' +
                    "\n}";
        }
    }

    public void accettazione(Date dataArrivo, Veicolo veicolo){
        riparazioni.add(new Riparazione(dataArrivo, veicolo));
    }

    public void accettazione(Date dataArrivo, String modello, String targa, Date matricolazione){
        riparazioni.add(new Riparazione(dataArrivo, new Veicolo(modello, targa, matricolazione)));
    }

    public String getDescrizione() {
        return nome;
    }

    public void setDescrizione(String descrizione) {
        this.nome = descrizione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Vector<Dipendente> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(Vector<Dipendente> dipendenti) {
        this.dipendenti = dipendenti;
    }

    public Vector<Riparazione> getRiparazioni() {
        return riparazioni;
    }

    public void setRiparazioni(Vector<Riparazione> riparazioni) {
        this.riparazioni = riparazioni;
    }

    @Override
    public String toString() {
        return "Officina{" +
                "\n\tnome='" + nome + '\'' +
                ",\n\tindirizzo='" + indirizzo + '\'' +
                ",\n\tdipendenti=\n" + dipendenti.toString() +
                ",\n\triparazioni=\n" + riparazioni +
                "\n}";
    }
}
