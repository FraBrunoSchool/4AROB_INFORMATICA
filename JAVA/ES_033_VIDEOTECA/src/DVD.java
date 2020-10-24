public class DVD extends Cassetta{
    private static double prezzo;
    private int nLingue;
    private TipoLingua[] lingue;
    private final int MAX_LINGUE = 5;

    public DVD(String titolo, int durata){
        super(titolo, durata);
        nLingue=0;
        lingue=new TipoLingua[MAX_LINGUE];
    }

    public static void setPrezzo(double prezzo) {
        DVD.prezzo=prezzo>0?prezzo:DVD.prezzo;
    }

    public int getnLingue() {
        return nLingue;
    }

    public static double getPrezzo() {
        return prezzo;
    }

    public void addLingua(TipoLingua lingua){
        int tro=-1;
        int k = 0;
        while (k<nLingue && tro==-1){
            if (lingue[k] == lingua){
                tro=k;
            }
            k++;
        }
        if (tro==-1&&nLingue<MAX_LINGUE){
            lingue[nLingue]=lingua;
            nLingue++;
        }
    }

    public String getLingue() {
        String print = "";
        for (int i = 0; i < nLingue; i++) {
            print+=i==nLingue-1?" |" + lingue[i] + "| ":" |" + lingue[i] + "| -";
        }
        return "Lingue: " + print;
    }
}

