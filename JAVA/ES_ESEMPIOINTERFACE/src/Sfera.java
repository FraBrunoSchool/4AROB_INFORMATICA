public class Sfera extends Solido{
    double raggio;

    public Sfera(double pesoSpecifco, double raggio) {
        super(pesoSpecifco);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public double volume() {
        return (4*Math.PI*Math.pow(raggio, 3))/3;
    }

    @Override
    public double superficie() {
        return 4*Math.PI*Math.pow(raggio, 2);
    }
}