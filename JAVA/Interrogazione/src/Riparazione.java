import java.util.Date;

public class Riparazione {
    private Date dataArrivo;
    private Date dataConsegna;
    private float costo;
    private String descrizione;
    private Veicolo veicolo;

    public Riparazione(Date dataArrivo, Veicolo veicolo) {
        this.dataArrivo = dataArrivo;
        this.veicolo=veicolo;
    }

    public Date getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(Date dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public Date getDataConsegna() {
        return dataConsegna;
    }

    public void setDataConsegna(Date dataConsegna) {
        this.dataConsegna = dataConsegna;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    @Override
    public String toString() {
        return "Riparazione{" +
                "\n\tdataArrivo=" + dataArrivo +
                ",\n\tdataConsegna=" + dataConsegna +
                ",\n\tcosto=" + costo +
                ",\n\tdescrizione='" + descrizione + '\'' +
                ",\n\tveicolo=" + veicolo.toString() +
                "\n}";
    }
}
