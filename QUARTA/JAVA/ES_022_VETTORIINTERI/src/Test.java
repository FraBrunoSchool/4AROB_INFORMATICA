/*
22. Creare una classe VettoriInteri che:
-Metodo costruttore con parametro un numero corrispondente alla dimensione desiderata che inizializza
tutti gli elementi a 0
-Metodo costruttore che riceve una stinga con gli elementi separati dalla "|" e carica il vettore con essi
dimensionandolo della lunghezza giusta. Se nella stringa ci sono dei dati non corretti deve generare una
eccezione NumberFormatException
-Abbia un metodo che ritorna l’elemento minimo di un array
-Metodo che cerca un elemento nell’array e ritorna la posizione ( se l’elemento non esiste ritorna -1)
-Metodo che elimina la prima occorrenza nell’array, dato un numero (se non trova nulla deve restituire
false)
-Metodo toString() che restituisce gli elementi separati da "|"
*/

public class Test {
    public static void main(String[] args) {
        VettoriInteri v=null;

        try {
            v = new VettoriInteri("1|2|3|4|5|6");
        }catch (NumberFormatException e){
            System.out.println("Striga non valida");
        }

        System.out.println(v.toString());
    }
}
