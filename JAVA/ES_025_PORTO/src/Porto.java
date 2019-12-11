public class Porto {
    private Posto[] posti;
    private int nPosti;
    private final int MAX_POSTI = 100;
    private float costoAlMetro;

    public Porto(float costoAlMetro){
        posti = new Posto[MAX_POSTI];
        nPosti=0;
        this.costoAlMetro=costoAlMetro>=0?costoAlMetro:0;
    }

    public float getCostoAlMetro() {
        return costoAlMetro;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setCostoAlMetro(float costoAlMetro) {
        this.costoAlMetro=costoAlMetro>=0?costoAlMetro:0;
    }
    public void addPosto(Posto posto){
        if (nPosti<MAX_POSTI){
            this.posti[nPosti]=posto;
            nPosti++;
        }
    }
    public String nomeAffittuario(Posto posto){
        int tro =-1;
        int k = 0;
        while (k<nPosti && tro==-1){
            if (posti[k]==posto){
                return posti[k].getCliente();
            }
            k++;
        }
        if (tro==-1){
            return "Questo posto non c'è";
        }
        return null;
    }

    public float getPrezzo(Posto posto){
        int tro =-1;
        int k = 0;
        while (k<nPosti && tro==-1){
            if (posti[k]==posto){
                return (float) ((posti[k].getFine().getTimeInMillis()-posti[k].getInizio().getTimeInMillis())
                        *(24 * 60 * 60 * 1000) *(posti[k].getBarca().getDimensione()*costoAlMetro));
            }
            k++;
        }
        if (tro==-1){
            return (float)0;
        }
        return 0;
    }

    public String controlla(Posto posto){
        int tro =-1;
        int k = 0;
        while (k<nPosti && tro==-1){
            if (posti[k]==posto){
                return "Occupato";
            }
            k++;
        }
        if (tro==-1){
            return "Libero";
        }
        return null;
    }

    public String affittaPosto(Posto posto){
        int trov =-2;
        int k = 0;
        while (k<nPosti && trov==-2){
            if (posti[k]==posto){
                return "Affittato";
            }
            k++;
        }
        if (trov==-2){

            return "Libero";
        }
        return null;
    }
}
