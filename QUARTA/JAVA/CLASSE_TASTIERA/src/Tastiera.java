import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tastiera {
    private InputStreamReader input;
    private BufferedReader tastiera;

    public Tastiera(){
        input = new InputStreamReader(System.in);
        tastiera = new BufferedReader(input);
    }

    public String readString(){
        String app = null;

        try {
            app = tastiera.readLine();
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }

        return app;
    }

    public float readFloat(){
        float app = 0.0f;

        try {
            app = Float.parseFloat(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    public int readInt(){
        int app = 0;

        try {
            app = Integer.parseInt(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    public double readDouble(){
        double app = 0.0;

        try {
            app = Double.parseDouble(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    public char readChar(){
        char app = ' ';

        try {
            app = (char) tastiera.read();
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }
}
