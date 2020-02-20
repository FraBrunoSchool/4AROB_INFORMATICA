public class Cubo extends Solido{
    double lato;

    public Cubo(double pesoSpecifco, double lato) {
        super(pesoSpecifco);
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    @Override
    public double volume() {
        return Math.pow(lato, 3);
    }

    @Override
    public double superficie() {
        return lato*lato*6;
    }
}
