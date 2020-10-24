/*
    Si vogliono gestire le riparazioni che effettuano le varie officine meccaniche.
    Di ogni officina interessano nome, indirizzo, numero dipendenti, e quali dipendenti lavorano in essa.
    Dei dipendenti interessano: nominativo, anni di servizio e numero telefono.
    Quando un veicolo arriva in un officina per una riparazione,
    bisogna memorizzare ora e data di accettazione e quando viene riconsegnato,
    ora e data di riconsegna, costo della riparazione e descrizione dei lavori effettuati.
    Dei veicoli interessa memorizzare: modello, tipo (autoveicolo, motoveicolo, autocarro, …),
    targa, anno di immatricolazione. Ogni officina è diretta da un direttore di cui interessa
    conoscere anche la data di nascita, ma non gli anni di servizio.
*/

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Officina o = new Officina("Da bruno", "Via officina 3");
        o.addDipendente("Fra");
        o.addDipendente("Bruno");
        System.out.println("Ci sono: " + o.getNumeroDipendenti());
        o.accettazione(new Date(2019, 12, 25, 15,50), "Stelvio", "BBB000FF", new Date(2000, 1, 1));
        o.accettazione(new Date(2019, 10, 02, 16, 20), "Stelvio", "BBB000FF", new Date(1990, 1, 1));
        System.out.println(o.toString());
    }
}
