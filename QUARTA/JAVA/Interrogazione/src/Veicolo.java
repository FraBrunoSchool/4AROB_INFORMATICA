import java.util.Date;

public class Veicolo {
    private String modello;
    private String targa;
    private Date matricolazione;

    public Veicolo(String modello, String targa, Date matricolazione) {
        this.modello = modello;
        this.targa = targa;
        this.matricolazione = matricolazione;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "\nmodello='" + modello + '\'' +
                ",\ntarga='" + targa + '\'' +
                ",\nmatricolazione=" + matricolazione +
                "\n}";
    }
}
