public abstract class Solido implements FiguraSolida, CorpoSolido {
    private double pesoSpecifco;

    Solido(double pesoSpecifco){
        this.pesoSpecifco=pesoSpecifco;
    }

    public double getPesoSpecifco() {
        return pesoSpecifco;
    }

    @Override
    public double peso() {
        return pesoSpecifco*volume();
    }
}
