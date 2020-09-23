import java.util.Vector;

public class Azienda {
    private String nome;
    private Vector<Lavorazione> lavorazioni;

    public Azienda(String nome) {
        this.nome = nome;
        lavorazioni = new Vector<Lavorazione>();
    }

    public void addLavorazione(Lavorazione l){
        lavorazioni.add(l);
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "\n\tnome='" + nome + '\'' +
                ",\n\tlavorazioni=" + lavorazioni.toString() +
                "\n}";
    }
}
