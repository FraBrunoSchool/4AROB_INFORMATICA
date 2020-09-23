public class CD extends Cassetta{
    private static double prezzo;
    private int nBrani;
    private static final int NBRANI_DEF = 1;

    public CD(String titolo, int durata, int nBrani){
        super(titolo, durata);
        this.nBrani=nBrani>0?nBrani:NBRANI_DEF;
    }

    public int getnBrani() {
        return nBrani;
    }

    public static double getPrezzo() {
        return prezzo;
    }

    public static void setPrezzo(double prezzo) {
        CD.prezzo=prezzo>0?prezzo:CD.prezzo;
    }
}
