public class ErroreElementoInesistente extends Exception {
    public ErroreElementoInesistente(int n) {
        super("Element not found {" + n + "}");
    }
}
