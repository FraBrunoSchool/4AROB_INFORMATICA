/*
    Scrivere una classe java Squadra che ha come attributo un nome e un array di Giocatore dell'esercizio
    precedente ma con in più l'attributo ruolo che assume i valori di una enumerazione (BATTITORE, PRIMA BASE,
    …). Il costruttore crea una classe con un array di N_MAX_GIOCATORI vuoto e possiede i seguenti metodi:
        - +addGiocatore(Giocatore g)
        - +void setPunteggio(String nome, double valore)
        - +double getPunteggioMedio() della squadra
        - +passatoAnno() incrementa tutte le età
        - +String toString()
*/
public class Test {
    public static void main(String[] args) {
        Giocatore fra = new Giocatore("Francesco", 17);
        Giocatore gianlu = new Giocatore("Gianluca", 17, 10);
        Giocatore bado = new Giocatore("Matteo", 17, 100);
        Giocatore jom = new Giocatore("Pietro", 18, 3.14);
        Giocatore simo = new Giocatore("Simone", 17, 50);
        fra.setPunteggio(1000);
        System.out.println(fra.toString());
        System.out.println(gianlu.toString());
        System.out.println(bado.toString());
        System.out.println(jom.toString());
        System.out.println(simo.toString());
        Squadra bestTeam = new Squadra("bestTeam");
        bestTeam.addGiocatore(fra);
        bestTeam.addGiocatore(gianlu);
        bestTeam.addGiocatore(bado);
        bestTeam.addGiocatore(jom);
        bestTeam.addGiocatore(simo);
        System.out.println(bestTeam.toString());
        bestTeam.passatoAnno();
        System.out.println(bestTeam.toString());
    }
}
