public class ErroreTempoControllato extends RuntimeException {
    private String message;

    public ErroreTempoControllato(String s){
        super(s);
        message=s;
        //s= messaggio di errore
    }
    public ErroreTempoControllato(){
        super("Errore...Riprova e sarai piu fortunato");
        message = "Errore...Riprova e sarai piu fortunato";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
