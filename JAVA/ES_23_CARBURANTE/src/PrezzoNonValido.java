public class PrezzoNonValido extends Exception {
    public PrezzoNonValido(float n) {
        super("prezzo {" + n + "} non valido");
    }
}