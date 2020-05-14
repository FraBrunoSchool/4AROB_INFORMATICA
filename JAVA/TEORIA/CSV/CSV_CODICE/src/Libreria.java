import java.io.*;
import java.util.Vector;

public class Libreria {
    private Vector<Libro> libri;

    /*
    * La classe BufferedReader è un wrapper per altre classi di Reader
    * Un BufferedReader fornisce funzionalità per leggere il testo una riga alla volta.
    * */
    private BufferedReader reader = null;

    /*
    * La classe File fornisce una rappresentazione astratta per nomi di path che si riferiscono a file e directory
    * */
    private File file = null;

    /*
    * La classe FileWriter che per comodità è usata per la scrittura di file di caratteri
    * */
    private FileWriter fileWriter = null;

    /*
    * La classe BufferedWriter viene utilizzata per fornire il buffering per le istanze di Writer.
    * Rende veloci le prestazioni. Eredita la classe Writer.
    * I caratteri di buffering vengono utilizzati per fornire la scrittura efficiente di
    * matrici, caratteri e stringhe singole.
    * */

    /*
    * Buffering -> Un buffer è una parte della memoria utilizzata per archiviare un flusso di dati
    *              dai dispositivi periferici. Quindi da questo buffer questo flusso di dati viene
    *              raccolto e archiviato in variabili. Un flusso può essere definito come un flusso
    *              continuo di dati. Il buffer è abbastanza utile poiché Java gestisce tutto come una stringa.
    * */
    private BufferedWriter writer = null;

    // carattere separatore
    private char carattereSplit = ',';

    // intestazioni
    private String lista_attributi = "Titolo,Nome,Cognome,NumeroPagine";
    private String lista_attributi_statici = "CostoPaginaFisso";

    public void caricaLibreria(String nomeFile){
        int cont=0;
        try {
            // prova apertura file
            String strCurrentLine;
            reader = new BufferedReader(new FileReader(nomeFile));
            // ciclo per ogni riga finchè non finisco il file
            // .readLine() -> scorre il file linea per linea
            while ((strCurrentLine = reader.readLine()) != null) { //leggo la riga e verifico che ci sia qualcosa
                //salto la riga 0 e la riga 2 poichè sono intestazioni
                if (cont!=0 && cont!=2) {
                    // split della riga per togliere la virgola
                    String[] riga = strCurrentLine.split(String.valueOf(carattereSplit));
                    // set parametro statico
                    if (cont==1) Libro.setCostoPagina(Double.parseDouble(strCurrentLine));
                    // aggiungo nuovo libro all libreria
                    else addVolume(new Libro(riga[0], new Autore(riga[1], riga[2]), Integer.parseInt(riga[3])));
                }
                cont++;
            }
            System.out.println("Operazione di salvataggio eseguita con successo.");
        } catch (IOException e){ // IOException -> classe madre della classe FileNotFoundException
            System.out.println("File non trovato\n");
            /*
            * printStackTrace() aiuta il programmatore a capire dove si è verificato il problema.
            * printStacktrace() è un metodo della classe Throwable del pacchetto Java.lang.
            * Stampa diverse righe nella console di output. La prima riga è composta da più stringhe.
            * Contiene il nome della sottoclasse Throwable e le informazioni sul pacchetto.
            * Dalla seconda riga in poi, descrive la posizione dell'errore/numero di riga che inizia con at.
            * */
            e.printStackTrace();
        } finally {
            // se tutto va a buon fine chiudo il file
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                /*
                 * printStackTrace() aiuta il programmatore a capire dove si è verificato il problema.
                 * printStacktrace() è un metodo della classe Throwable del pacchetto Java.lang.
                 * Stampa diverse righe nella console di output. La prima riga è composta da più stringhe.
                 * Contiene il nome della sottoclasse Throwable e le informazioni sul pacchetto.
                 * Dalla seconda riga in poi, descrive la posizione dell'errore/numero di riga che inizia con at.
                 * */
                ex.printStackTrace();
            }
        }
    }

    public void salvaLibreria(String nomeFile){
        try {
            // crea oggetto di tipo file
            file = new File(nomeFile);
            // inizializzazione FileWriter
            fileWriter = new FileWriter(file);
            // crea il file se non esiste
            if (!file.exists()) file.createNewFile();
            // inizializzazione BufferedWriter
            writer = new BufferedWriter(fileWriter);
            // .write -> metodo che serve per scrivere
            // scrittura su file
            // scrivo intestazione attributi statici
            writer.write(lista_attributi_statici+",\n");
            // scrivo attributi statici
            writer.write(Libro.getCostoPagina()+"\n");
            // scrivo intestazione attributi
            writer.write(lista_attributi+"\n");
            // scrivo attributi
            for (Libro libro : getLibri()) {
                writer.write(libro.getTitolo() + ',' + libro.getAutore().getNome()
                        + ',' + libro.getAutore().getCognome() + ',' + libro.getNumeroPagine() + "\n");
            }
            System.out.println("Operazione di caricamento eseguita con successo.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // chiusura buffer writer, se è uguale a null vuol dire che non è successo nulla
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    /*
                     * printStackTrace() aiuta il programmatore a capire dove si è verificato il problema.
                     * printStacktrace() è un metodo della classe Throwable del pacchetto Java.lang.
                     * Stampa diverse righe nella console di output. La prima riga è composta da più stringhe.
                     * Contiene il nome della sottoclasse Throwable e le informazioni sul pacchetto.
                     * Dalla seconda riga in poi, descrive la posizione dell'errore/numero di riga che inizia con at.
                     * */
                    e.printStackTrace();
                }
            }
            // chiusura file
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    /*
                     * printStackTrace() aiuta il programmatore a capire dove si è verificato il problema.
                     * printStacktrace() è un metodo della classe Throwable del pacchetto Java.lang.
                     * Stampa diverse righe nella console di output. La prima riga è composta da più stringhe.
                     * Contiene il nome della sottoclasse Throwable e le informazioni sul pacchetto.
                     * Dalla seconda riga in poi, descrive la posizione dell'errore/numero di riga che inizia con at.
                     * */
                    e.printStackTrace();
                }
            }
        }
    }

















    public Libreria() {
        libri = new Vector<Libro>();
    }

    public void addVolume(Libro libro) {
        libri.add(libro);
    }

    public Vector<Libro> getLibri() {
        return libri;
    }

    @Override
    public String toString() {
        return "Libreria = " + libri ;
    }
}