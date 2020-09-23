public class ErroreTempo extends  Exception {
    private String message;

    public ErroreTempo(String s){
        super(s);
        message=s;
    //s= messaggio di errore
    }
    public ErroreTempo(){
        super("Errore...Riprova e sarai piu fortunato");
        message = "Errore...Riprova e sarai piu fortunato";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
