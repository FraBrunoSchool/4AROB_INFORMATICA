public class Giocatore {
    private String nome;
    private double punteggio;
    private int eta;
    private String ruolo;

    public Giocatore(String nome, int eta){
        this.nome = nome;
        if (eta>0){
            this.eta=eta;
        }
        else{
            this.eta=20;
        }
    }

    public Giocatore(String nome, int eta, double punteggio){
        this.nome = nome;
        if (eta>0){
            this.eta=eta;
        }
        else{
            this.eta=20;
        }
        this.punteggio=punteggio;
    }

    public String getNome(){
        return nome;
    }

    public double getPunteggio(){
        return punteggio;
    }

    public void setPunteggio(double nuovoPunteggio){
        punteggio=nuovoPunteggio;
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta) {
        if (eta>0){
            this.eta=eta;
        }
        else{
            this.eta=20;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n\tEtà: " + eta + "\n\tPunteggio: " + punteggio + "\n\t";
    }
}
