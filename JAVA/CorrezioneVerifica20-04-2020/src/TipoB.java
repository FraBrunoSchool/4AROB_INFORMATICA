public class TipoB extends Robot{
    private int numPuntiSec;

    public TipoB(String nome, float costoSec, Processore processore, Memoria memoria, int numPuntiSec) throws ValoreNonValido {
        super(nome, costoSec, processore, memoria);
        if (numPuntiSec<=0) throw new ValoreNonValido();
        else this.numPuntiSec = numPuntiSec;

    }

    public int getNumPuntiSec() {
        return numPuntiSec;
    }

    @Override
    public String toString() {
        return "TipoB{" +
                "\n\tRobot" + super.toString() +
                "\n\tnumPuntiSec=" + numPuntiSec +
                "\n}";
    }
}
