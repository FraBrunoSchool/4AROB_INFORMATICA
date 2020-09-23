/*
    La classe rettangolo deve permettere di calcolare Area e Perimetro e di dire se è un quadrato. Possiede due
    costruttori uno senza parametri e uno con base e altezza passati come argomenti.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        boolean err = true;
        float base = 0;
        float altezza = 0;

        do {
            System.out.println("Inserire Base : ");
            try {
                base = Float.parseFloat(tastiera.readLine());
                err = false;
            }  catch (IOException e) {
                System.out.println("errore di IO");
            } catch (NumberFormatException e) {
                System.out.println("Non hai inserito un numero corretto");
            }
        }while (err || base<0);

        err = true;

        do {
            System.out.println("Inserire Altezza : ");
            try {
                altezza = Float.parseFloat(tastiera.readLine());
                err = false;
            }  catch (IOException e) {
                System.out.println("errore di IO");
            } catch (NumberFormatException e) {
                System.out.println("Non hai inserito un numero corretto");
            }
        }while (err || altezza<0);

        Rettangolo r = new Rettangolo(base, altezza);
        System.out.println("Area: " + r.getArea() + " - Perimetro: " + r.getPerimetro());
    }
}
