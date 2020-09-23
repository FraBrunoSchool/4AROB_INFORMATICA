public class Cassetta {
    private int codice;
    private String titolo;
    private int durataSec;
    private double sconto;
    private int nCopie;
    private static final int DURATA_DEF = 1;

    public Cassetta(String titolo, int durataSec){
        this.titolo=titolo;
        this.durataSec=durataSec>0?durataSec:DURATA_DEF;
        nCopie = 0;
        codice= (int)(Math.random()*9000)+1000;
        sconto=0.0;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurataSec() {
        return durataSec;
    }

    public double getSconto() {
        return sconto;
    }

    public void setSconto(double sconto) {
        this.sconto=sconto>0?sconto:0;
    }

    public int getCodice() {
        return codice;
    }

    public int getnCopie() {
        return nCopie;
    }

    public void setnCopie(int nCopie) {
        this.nCopie = nCopie;
    }
}
