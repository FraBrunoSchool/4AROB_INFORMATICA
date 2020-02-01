import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static int readInteger(){
        int numInt = 0;
        boolean err;

        do {
            err= false;
            System.out.println("Insert Integer: ");
            try {
                numInt = Integer.parseInt(keyboard.readLine());
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numInt;
    }

    public static int readInteger(String msg){
        int numInt = 0;
        boolean err;

        do {
            err= false;
            System.out.println(msg);
            try {
                numInt = Integer.parseInt(keyboard.readLine());
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numInt;
    }

    public static int readInteger(String msg, int min, int max) throws ValoreNonNelRange{
        int numInt = 0;
        boolean err;

        do {
            err= false;
            System.out.println(msg);
            try {
                numInt = Integer.parseInt(keyboard.readLine());
                if (numInt<min||numInt>max) throw new ValoreNonNelRange("tra "+min+" e "+max);
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numInt;
    }

    public static float readFloat(){
        float numFlo = 0;
        boolean err;

        do {
            err= false;
            System.out.println("Insert Integer: ");
            try {
                numFlo =  Float.parseFloat(keyboard.readLine());
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numFlo;
    }

    public static float readFloat(String msg){
        float numFlo = 0;
        boolean err;

        do {
            err= false;
            System.out.println(msg);
            try {
                numFlo = Float.parseFloat(keyboard.readLine());
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numFlo;
    }

    public static float readFloat(String msg, float min, float max) throws ValoreNonNelRange{
        float numFlo = 0;
        boolean err;

        do {
            err= false;
            System.out.println(msg);
            try {
                numFlo =  Float.parseFloat(keyboard.readLine());
                if (numFlo<min||numFlo>max) throw new ValoreNonNelRange("tra "+min+" e "+max);
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numFlo;
    }
}
