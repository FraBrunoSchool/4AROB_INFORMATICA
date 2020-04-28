public class TipoC extends Robot{
    private TipoMateriale materiale;

    public TipoC(String nome, float costoSec, Processore processore, Memoria memoria, TipoMateriale materiale) throws ValoreNonValido {
        super(nome, costoSec, processore, memoria);
        this.materiale = materiale;
    }

    public TipoMateriale getMateriale() {
        return materiale;
    }

    @Override
    public String toString() {
        return "TipoC{" +
                "\n\tRobot" + super.toString() +
                "\n\tmateriale=" + materiale +
                "\n}";
    }
}
