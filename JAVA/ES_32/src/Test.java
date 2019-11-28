/*
Si scriva una classe Lavoratore le cui istanze rappresentano lavoratori. Ogni lavoratore è caratterizzato da un
nome, un livello ed uno stipendio (mensile). La classe deve contenere una variabile di istanza di tipo stringa
nome e due variabili di istanza intere, livello e stipendio, un costruttore che assegna al lavoratore un nome ed
un livello specificati, ed un metodo stampaStipendio() che stampa lo stipendio del lavoratore.
Scrivere quindi una classe LavoratoreConStraordinariPagati che estende la classe Lavoratore. La classe deve
contenere una nuova variabile di istanza, oreStraordinario, un costruttore che assegna al lavoratore con
straordinari pagati un nome, un livello e un numero di ore di straordinario specificati, un metodo
stampaStraordinari() che stampa un messaggio contenente il numero di ore di straordinario. La classe deve
inoltre contenere una variabile statica reale retribuzioneOraria, inizializzata a 10.0, corrispondente alla
retribuzione di un'ora di straordinario (che si suppone uguale per tutti). La classe deve inoltre ridefinire il
metodo stampaStipendio() per tenere conto della retribuzione delle ore di straordinario: alla retribuzione base
(ereditata da Lavoratore) va sommata la retribuzione degli straordinari, ottenuta come retribuzione oraria dello
straordinario per numero di ore di straordinario effettuate. Scrivere infine un programma di prova per
collaudare le classi e i metodi.
*/

public class Test {
    public static void main(String[] args) {

        Lavoratore fra= new Lavoratore("fra", 2, 1500);
        System.out.println(fra.toString());
        System.out.println(fra.stampaStipendio());
        LavoratoreConStraordinariPagati a1 = new LavoratoreConStraordinariPagati("a1", 2, 500);
        a1.setSalary(2300);
        System.out.println(a1.stampaStipendio());
        LavoratoreConStraordinariPagati a2 = new LavoratoreConStraordinariPagati("a2", -2, -5000, -5);
        Azienda b1=new Azienda("Tale");
        System.out.println(a2.toString());
        b1.addLavoratori(a1);
        b1.addLavoratori(a2);
        System.out.println(b1.toString());
    }
}
