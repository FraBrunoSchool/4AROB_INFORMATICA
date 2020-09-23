import java.util.GregorianCalendar;

public class Posto {
    private String codFisc;
    private String cliente;
    private GregorianCalendar inizio;
    private GregorianCalendar fine;
    private Barca barca;

    public Posto(String codFisc, String cliente, GregorianCalendar inizio, GregorianCalendar fine, Barca barca){
        this.codFisc=codFisc;
        this.cliente=cliente;
        this.inizio=inizio;
        this.fine=fine;
        this.barca=barca;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public String getCliente() {
        return cliente;
    }

    public GregorianCalendar getInizio() {
        return inizio;
    }

    public GregorianCalendar getFine() {
        return fine;
    }

    public Barca getBarca() {
        return barca;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setInizio(GregorianCalendar inizio) {
        this.inizio = inizio;
    }

    public void setFine(GregorianCalendar fine) {
        this.fine = fine;
    }

    public void setBarca(Barca barca) {
        this.barca = barca;
    }
}
