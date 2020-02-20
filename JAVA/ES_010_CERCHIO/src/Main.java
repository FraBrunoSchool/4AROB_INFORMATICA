/*
    La classe Cerchio deve avere due costruttori: uno senza parametri che imposta il raggio a 0 e uno con un
    parametro corrispondente al raggio che si vuole impostare. Deve fornire oltre ai metodi get/set opportuni
    anche i metodi getArea() e getCirconferenza()
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
        System.out.println("Area: " + c.getArea() + " - Circonferenza: " + c.getCirconferenza());
    }
}
