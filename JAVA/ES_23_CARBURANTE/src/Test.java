import java.util.Random;

/*
Dichiarare una classe di nome carburante che ha come attributo un vettore di tipo float (contenente i vari prezzi
benzina) e 3 metodi di nome media, max e min, che restituiscono il prezzo medio, massimo e minimo.
*/
public class Test {
    public static void main(String[] args) throws PrezzoNonValido {
        Carburante c=new Carburante();
        Random random = new Random();
        for (int i = 0; i < 60; i++) {
            c.addPrezzo(random.nextInt(50)+1);
        }
        System.out.println(c.max());
        System.out.println(c.min());
        System.out.println(c.media());
        System.out.println(c.toString());
    }
}
