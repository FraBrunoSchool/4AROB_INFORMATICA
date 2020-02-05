public class Prodotto {
    private String titolo;
    private String genere;
    private String noleggiato;
    private float prezzo;
    private static final float COSTO_FISSO = 5.5f;

    public Prodotto(String titolo, String genere, String noleggiato, float prezzo){
        this.titolo=titolo;
        this.genere=genere;
        this.noleggiato=noleggiato;
        this.prezzo=prezzo>=0?prezzo:COSTO_FISSO;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public String getGenere() {
        return genere;
    }

    public String getNoleggiato() {
        return noleggiato;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setNoleggiato(String noleggiato) {
        this.noleggiato = noleggiato;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo=prezzo>=0?prezzo:COSTO_FISSO;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "titolo='" + titolo + '\'' +
                ", genere='" + genere + '\'' +
                ", noleggiato='" + noleggiato + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
