public class Focolaio {
    private String nome;
    private int nInfetti;
    private float nGiorni;

    public Focolaio(String nome, int nInfetti, float nGiorni){
        this.nome=nome;
        this.nInfetti=nInfetti;
        this.nGiorni=nGiorni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setnInfetti(int nInfetti) {
        this.nInfetti = nInfetti;
    }

    public void setnGiorni(float nGiorni) {
        this.nGiorni = nGiorni;
    }

    public String getNome() {
        return nome;
    }

    public int getnInfetti() {
        return nInfetti;
    }

    public float getnGiorni() {
        return nGiorni;
    }
}
