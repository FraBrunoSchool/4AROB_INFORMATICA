public class Prodotto {
    private String titolo;
    private String genere;
    private float prezzo;
    private static final float COSTO_FISSO = 5.5f;

    public Prodotto(String titolo, String genere, float prezzo){
        this.titolo=titolo;
        this.genere=genere;
        this.prezzo=prezzo>=0?prezzo:COSTO_FISSO;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public String getGenere() {
        return genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo=prezzo>=0?prezzo:COSTO_FISSO;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "Prodotto{\n" +
                "\ttitolo='" + titolo + '\'' +
                ",\n\tgenere='" + genere + '\'' +
                ",\n\tprezzo=" + prezzo +
                "\n\t}";
    }

    public String toStringLista() {
        return "Prodotto{\n" +
                "\t\ttitolo='" + titolo + '\'' +
                ",\n\t\tgenere='" + genere + '\'' +
                ",\n\t\tprezzo=" + prezzo +
                "\n\t\t}";
    }
}
