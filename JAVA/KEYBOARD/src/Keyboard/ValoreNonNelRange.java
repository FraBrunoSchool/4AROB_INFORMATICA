package Keyboard;

public class ValoreNonNelRange extends Exception{
    public ValoreNonNelRange(String range) {
        super("Valore non nel range " + range);
    }
}
