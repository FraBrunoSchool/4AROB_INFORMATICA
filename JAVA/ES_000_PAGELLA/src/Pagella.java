public class Pagella {
    private int periodo;
    private Materia[] votiMaterie;
    private int NMAXMTERIA = 15;
    int nMaterie;


    public Pagella(int periodo){
        if (periodo >=1 && periodo<=3) {
            this.periodo = periodo;
        }
        else{
            this.periodo = 1;
        }
        nMaterie=0;
        votiMaterie = new Materia[NMAXMTERIA];
    }

    public void aggiungiMateria(Materia m){
        if (nMaterie < NMAXMTERIA) {
            votiMaterie[nMaterie] = m;
            nMaterie++;
        }
    }

    public void aggiungiVotoMateria(String nomeMateria, Voto v){
        int tro = -1;
        int k = 0;

        while (k < nMaterie && tro == -1 ){
            if (nomeMateria == votiMaterie[k].getNome()){
                tro = k;
            }
            k++;
        }
        if (tro == -1){
            System.out.println(">>>Materia inesistente");
        }
        else{
            votiMaterie[tro].aggiungiVoto(v);
        }
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getNMaterie() {
        return nMaterie;
    }

    @Override
    public String toString() {
        String print="";
        for (int i = 0; i < nMaterie; i++) {
            print += "" + votiMaterie[i].toString()+ "";
        }
        return "Pagella\n" + "\tPeriodo: " + periodo + "\n" + print;
    }
}
