public class ValoreNonValido extends Exception{
    public ValoreNonValido() {
        super("Error");
    }

    public ValoreNonValido(String message) {
        super(message);
    }
}
