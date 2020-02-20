import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Noleggio {
    private String nomeCliente;
    private Prodotto prodotto;
    private java.time.LocalDate dataPrestito;
    private java.time.LocalDate dataReso;

    public Noleggio(String nomeCliente, Prodotto p, int annoPrestito, int mesePrestito, int giornoPrestito){
        this.nomeCliente=nomeCliente;
        prodotto = p;
        dataPrestito = LocalDate.of(annoPrestito, mesePrestito, giornoPrestito);
    }

    public float reso(int annoReso, int meseReso, int giornoReso){
        dataReso = LocalDate.of(annoReso, meseReso, giornoReso);
        long giorni= ChronoUnit.DAYS.between(dataPrestito, dataReso);
        int g = (int) giorni;
        return g*prodotto.getPrezzo();
    }

    @Override
    public String toString() {
        return "Noleggio{\n" +
                "\tnomeCliente='" + nomeCliente + '\'' +
                ",\n\t" + prodotto.toStringLista() +
                ",\n\tdataPrestito=" + dataPrestito +
                ", \n\tdataReso=" + dataReso +
                "}\n";
    }

    public LocalDate getDataPrestito() {
        return dataPrestito;
    }

    public LocalDate getDataReso() {
        return dataReso;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
}
