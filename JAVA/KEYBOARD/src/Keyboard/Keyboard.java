package Keyboard;

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

    public static int readInteger(String msg, int min, int max) throws ValoreNonNelRange {
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

    public static float readFloat(String msg, float min, float max) throws ValoreNonNelRange {
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

    public static double readDouble(){
        double numDou = 0;
        boolean err;

        do {
            err= false;
            System.out.println("Insert Integer: ");
            try {
                numDou =Double.parseDouble(keyboard.readLine());
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numDou;
    }

    public static double readDouble(String msg){
        double numDou = 0;
        boolean err;

        do {
            err= false;
            System.out.println(msg);
            try {
                numDou = Double.parseDouble(keyboard.readLine());
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numDou;
    }

    public static double readDouble(String msg, double min, double max) throws ValoreNonNelRange {
        double numDou = 0;
        boolean err;

        do {
            err= false;
            System.out.println(msg);
            try {
                numDou = Double.parseDouble(keyboard.readLine());
                if (numDou<min||numDou>max) throw new ValoreNonNelRange("tra "+min+" e "+max);
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);

        return numDou;
    }

    public static String readString(){
        String out = "";
        boolean err;
        do{
            err= false;
            System.out.println("Insert a String: ");
            try {
                out = keyboard.readLine();
                err = true;
            } catch (IOException e) {
                System.out.println("IO error");
            } catch (NumberFormatException e) {
                System.out.println("Invalid float");
            }
        }while(!err);
        return out;
    }

    public static String readString(String message){
        String out = "";
        boolean err;
        do{
            err= false;
            System.out.println(message);
            try {
                out = keyboard.readLine();
                err = true;
            } catch (IOException e) {
                System.out.println("IO error");
            } catch (NumberFormatException e) {
                System.out.println("Invalid float");
            }
        }while(!err);
        return out;
    }

    public static char readChar(){
        char ret = ' ';
        boolean err;
        do {
            err = false;
            System.out.println("Insert a char: ");
            try{
                ret = (char) keyboard.read();
                err = true;
            } catch (RuntimeException | IOException e){
                System.out.println("Error");
            }
        }while(!err);

        return ret;
    }

    public static char readChar(String message){
            char ret = ' ';
            boolean err;
            do {
                err = false;
                System.out.println(message);
                try{
                    ret = (char) keyboard.read();
                    err = true;
                } catch (RuntimeException | IOException e){
                    System.out.println("Error");
                }
            }while(!err);

            return ret;
    }
}
