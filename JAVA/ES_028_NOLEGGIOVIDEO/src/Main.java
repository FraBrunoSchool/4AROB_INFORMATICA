/*
Creare un applicazione JAVA per gestire un noleggio video. Il noleggio video possiede diversi tipi di prodotti.
Tutti i prodotti possiedono: Titolo, Genere (Horror, Dramma, Avventura, Bambini), Prezzo noleggio al giorno,
noleggiato (si/no). Si gestisca una lista di noleggi: NominativoCliente, Prodotto noleggiato, DataPrestito,
DataReso. Creare un'applicazione (console) che:
    - Al momento della registrazione del reso visualizzi l'importo dovuto in base ai giorni di noleggio
    - Visualizza la lista dei film noleggiati
    - Dato un NominativoCliente visualizza i film noleggiati
    - Dato un NominativoCliente visualizza l'importo speso fino ad oggi
    - Visualizzare tutti i film dato il genere
    - Eliminare un cliente (dato il NominativoCliente)
    - Eliminare un film (dato il titolo)
*/

public class Main {
    public static void main(String[] args) {
        Noleggio n = new Noleggio("fra", "ggg", "horror", "si",
                2020, 3, 1, 5f);
        Noleggio n1 = new Noleggio("fra", "ggg", "horror", "si",
                2020, 3, 1, 5f);
        Noleggio n2 = new Noleggio("fra", "ggg", "horror", "si",
                2020, 3, 1, 5f);
        ListaFilm l = new ListaFilm();
        l.addNoleggio(n);
        l.addNoleggio(n1);
        l.addNoleggio(n2);
        System.out.println(n.reso(2020, 3, 5));
        System.out.println(n1.reso(2020, 3, 5));
        System.out.println(n2.reso(2020, 3, 5));
        System.out.println(l.visualizza());
        System.out.println(l.getFilmNoleggiati("fra"));

    }
}
