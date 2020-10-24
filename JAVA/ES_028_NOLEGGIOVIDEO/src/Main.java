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

import Keyboard.Keyboard;

/*LocalDate today = LocalDate.now();*/

public class Main {
    public static void main(String[] args) {
        Prodotto p =  new Prodotto("6 UnderGround", "azione", 5f);
        Noleggio n = new Noleggio("fra", p, 2020, 3, 1);

        Prodotto p1 =  new Prodotto("Hobs and Shaw", "azione", 5f);
        Noleggio n1 = new Noleggio("bado", p1, 2020, 3, 1);

        Prodotto p2 =  new Prodotto("american pie", "hot", 5f);
        Noleggio n2 = new Noleggio("best", p2, 2020, 3, 1);

        ListaFilm l = new ListaFilm();
        l.addFilm(p);
        l.addFilm(p1);
        l.addFilm(p2);
        System.out.println(l.visualizzaListaFilm());

        ListaNoleggi nol = new ListaNoleggi();
        nol.addNoleggio(n);
        nol.addNoleggio(n1);
        nol.addNoleggio(n2);
        System.out.println(nol.visualizzaListaNoleggi());
    }
}
