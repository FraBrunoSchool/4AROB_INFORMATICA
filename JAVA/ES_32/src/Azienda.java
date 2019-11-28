public class Azienda {
    private String nome;
    private LavoratoreConStraordinariPagati[] lavoratori;
    private final int MAXLAV = 100;
    private int nLavoratori;

    public Azienda(String nome){
        this.nome=nome;
        lavoratori = new LavoratoreConStraordinariPagati[MAXLAV];
        nLavoratori=0;
    }

    public void addLavoratori(LavoratoreConStraordinariPagati lavoratore){
        if (nLavoratori<=MAXLAV){
            lavoratori[nLavoratori]=lavoratore;
            nLavoratori++;
        }
    }

    @Override
    public String toString() {
        String print = "";
        for (int i = 0; i < nLavoratori; i++) {
            print += "" + lavoratori[i].toString() + "";
        }
        return "Nome azienda: " + nome + "\nLavoratori: " + print;
    }
}
