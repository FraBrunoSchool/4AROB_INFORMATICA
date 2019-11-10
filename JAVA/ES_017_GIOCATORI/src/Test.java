/*
    Scrivere una programma java per rappresentare dei giocatori di baseball. Per ciascun giocatore devono essere
    rappresentati il nome come stringa, un punteggio che rappresenta la bravura del giocatore in battuta e la sua
    età. Si devono quindi realizzare i seguenti metodi:
        - Giocatore(String nome, int eta) costruttore con due argomenti.
        - Giocatore(String nome, int eta, double valore) costruttore con tre argomenti.
        - String getNome() che ritorna il nome del giocatore.
        - double getPunteggio() che ritorna il punteggio del giocatore.
        - void setPunteggio(double nuovoPunteggio) che pone il punteggio del giocatore a nuovoPunteggio.
        - int getEta() che ritorna l'età del giocatore
        - String toString() che visualizza tutti i dati del giocatore
    Fai un menu in cui sia possibile inserire un nuovo giocatore, visualizzare i suoi dati.
*/

public class Test {
    public static void main(String[] args) {
        Giocatore fra = new Giocatore("Francesco", 17);
        Giocatore gianlu = new Giocatore("Gianluca", 17, 10);
        Giocatore bado = new Giocatore("Matteo", 17, 100);
        fra.setPunteggio(1000);
        System.out.println(fra.toString());
        System.out.println(gianlu.toString());
        System.out.println(bado.toString());

    }
}
