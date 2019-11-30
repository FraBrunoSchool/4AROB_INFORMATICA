/*
    Date le classi Cerchio e Rettangolo degli esercizi precedenti costruire un main in cui dati un cerchio di raggio r e
    un rettangolo b x h dire se sono equivalenti (hanno la stessa area)
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        boolean err = true;
        float raggio = 0;
        float base = 0;
        float altezza = 0;

        do {
            System.out.println("Inserire Raggio : ");
            try {
                raggio = Float.parseFloat(tastiera.readLine());
                err = false;
            }  catch (IOException e) {
                System.out.println("errore di IO");
            } catch (NumberFormatException e) {
                System.out.println("Non hai inserito un numero corretto");
            }
        }while (err || raggio<0);

        Cerchio c = new Cerchio(raggio);

        err = true;

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
        System.out.println(r.getArea()==c.getArea()?"Equivalenti":"Non equivalenti");
        System.out.println("Area: " + c.getArea() + " - Circonferenza: " + c.getCirconferenza());
        System.out.println("Area: " + r.getArea() + " - Perimetro: " + r.getPerimetro() + " - " + r.isSquare());
    }
}
