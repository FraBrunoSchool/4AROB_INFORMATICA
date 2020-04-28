public class TipoA extends Robot{
    private int spessoreTaglio;
    private int precisione;

    public TipoA(String nome, float costoSec, Processore processore, Memoria memoria, int spessoreTaglio, int precisione) throws ValoreNonValido {
        super(nome, costoSec, processore, memoria);
        if (spessoreTaglio<=0) throw new ValoreNonValido();
        else this.spessoreTaglio = spessoreTaglio;
        if (precisione<=0) throw new ValoreNonValido();
        else this.precisione = precisione;
    }

    public int getSpessoreTaglio() {
        return spessoreTaglio;
    }

    public int getPrecisione() {
        return precisione;
    }

    @Override
    public String toString() {
        return "TipoA{" +
                "\n\tRobot" + super.toString() +
                "\n\tspessoreTaglio=" + spessoreTaglio +
                ",\n\t precisione=" + precisione +
                "\n}";
    }
}