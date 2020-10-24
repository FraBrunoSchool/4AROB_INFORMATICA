public class Videoteca {
    private Cassetta[] cassette;
    private int nCassette;
    private final int MAX_CASSETTE=500;
    private String nome;
    private String indirizzo;

    public Videoteca(String nome, String indirizzo){
        this.nome=nome;
        this.indirizzo=indirizzo;
        cassette=new Cassetta[MAX_CASSETTE];
        nCassette=0;
    }

    public void addCassetta(Cassetta c){
        if (nCassette<MAX_CASSETTE){
            cassette[nCassette]=c;
            nCassette++;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void vendo(int codice){
        for (int i = 0; i < nCassette; i++) {
            if (codice==cassette[i].getCodice() && cassette[i].getnCopie()>0){
                    cassette[i].setnCopie(cassette[i].getnCopie()-1);
                    break;
            }else {
                if (cassette[i].getnCopie() == 0){
                    cassette[i]=null;
                    //shift(i);
                    break;
                }
            }
        }
    }

    private void shift(int i){
        for (int j = i; j < nCassette; j++) {
            cassette[j]=cassette[j+1];
            cassette[j+1]=null;
        }
    }

    public void compro(int codice){
        for (int i = 0; i < nCassette; i++) {
            if (codice==cassette[i].getCodice()){
                cassette[i].setnCopie(cassette[i].getnCopie()+1);
                break;
            }
        }
    }

    public Cassetta[] getCassette() {
        return cassette;
    }
}
