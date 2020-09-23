/*
    Si scriva una classe Libro le cui istanze rappresentano libri. Ogni libro è caratterizzato dal numero di pagine. La
    classe deve contenere una variabile di istanza intera, numPagine, un costruttore che assegna al libro un numero
    specificato di pagine, ed un metodo pageMessage() che stampa il numero di pagine del libro.
    Scrivere quindi una classe Vocabolario che estende la classe Libro. La classe deve contenere una nuova variabile
    di istanza, numDefinizioni, un costruttore che assegna al vocabolario un numero di pagine e un numero di
    definizioni specificati, ed un metodo definitionMessage() che stampa un messaggio contenente il numero di
    pagine, il numero di definizioni ed il numero medio di definizioni per pagina del vocabolario.
    Scrivere infine un programma di prova per collaudare le classi e i metodi.
*/

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Libro a = new Libro("Capolavori", 200);
        Vocabolario b = new Vocabolario("Italiano", 100, 7000000);

        System.out.println(a.pageMessage());
        System.out.println();
        System.out.println(b.definitionMessage());

    }
}
