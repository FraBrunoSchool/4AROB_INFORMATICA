public class Squadra {
    private String nome;
    private Giocatore[] giocatori;
    private final int N_MAX_GIOCATORI = 10;
    private int nGiocatori;

    public Squadra(String nome){
        this.nome=nome;
        giocatori=new Giocatore[N_MAX_GIOCATORI];
    }

    public void addGiocatore(Giocatore g){
        if (nGiocatori<N_MAX_GIOCATORI){
            giocatori[nGiocatori]=g;
        }
        nGiocatori++;
    }
    public void setPunteggio(String nome, double valore){
        int k = 0;
        int tro = -1;

        while (k<nGiocatori && tro==-1){
            if (nome.equals(giocatori[k].getNome())){
                giocatori[k].setPunteggio(valore);
            }
        }
    }

    public double getPunteggioMedio(){
        double somma=0;
        for (int i = 0; i < nGiocatori; i++){
            somma = somma + giocatori[i].getPunteggio();
        }
        return somma/nGiocatori;
    }

    public void passatoAnno(){
        int appoggio=0;
        for (int i = 0; i < nGiocatori; i++){
            appoggio = giocatori[i].getEta() + 1;
            giocatori[i].setEta(appoggio);
            appoggio=0;
        }
    }

    @Override
    public String toString() {
        String print="";
        for (int i = 0; i < nGiocatori; i++) {
            print += "" + giocatori[i].toString()+ "\n";
        }
        return "Nome Team: " + nome + "\nGiocatori:\n" + print;
    }
}


