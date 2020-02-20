public class Barca {
    private String matricola;
    private float dimensione;
    private int annoFabbricazione;
    private final float DIM_MIN = 2.5f;
    private final int ANNO_MIN = 1970;
    private final int ANNO_DEF = 2000;

    public Barca(String matricola, float dimensione, int annoFabbricazione){
        this.matricola=matricola;
        this.dimensione=dimensione>=DIM_MIN?dimensione:DIM_MIN;
        this.annoFabbricazione=annoFabbricazione>=ANNO_MIN?annoFabbricazione:ANNO_DEF;
    }

    public float getDimensione() {
        return dimensione;
    }

    public String getMatricola() {
        return matricola;
    }

    public int getAnnoFabbricazione() {
        return annoFabbricazione;
    }

    public void setAnnoFabbricazione(int annoFabbricazione) {
        this.annoFabbricazione=annoFabbricazione>=ANNO_MIN?annoFabbricazione:ANNO_DEF;
    }

    public void setDimensione(float dimensione) {
        this.dimensione=dimensione>=DIM_MIN?dimensione:DIM_MIN;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}
