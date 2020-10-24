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

    public String addPosto(int x, Posto posto){
        if(posti[x]==null){
            posti[x]=posto;
            return "Assegnato";
        }else {
            return "Occupato";
        }
    }
    
    public String nomeAffittuario(int x){
        if(posti[x]==null){
            return "Non Assegnato";
        }else {
            return "Nome cliente: " + posti[x].getCliente();
        }
    }

    public String getPrezzo(int x){

        if(posti[x]==null){
            return "Non Assegnato";
        }else {
            return "Costo: " + ((posti[x].getFine().getTimeInMillis()-posti[x].getInizio().getTimeInMillis())
                    *(24 * 60 * 60 * 1000) *(posti[x].getBarca().getDimensione()*costoAlMetro));
        }
    }

    public String controlla(int x){
        if(posti[x]==null){
            return "Libero";
        }else {
            return "Non disponibile";
        }
    }

    public String affittaPosto(int x, Posto posto){
        if (controlla(x).equals("Libero")){
            posti[x]=posto;
            return "Registrato";
        }else{
            return "Già occupato";
        }
    }

    public String liberaPosto(int x){
        if (controlla(x).equals("Non disponibile")){
            String prezzo = getPrezzo(x);
            posti[x] = null;
            return prezzo;
        }else{
            return "Libero";
        }
    }
}
