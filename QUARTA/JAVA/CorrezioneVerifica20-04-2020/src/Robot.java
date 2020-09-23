import java.util.Vector;

public class Robot {
    private String nome;
    private float costoSec;
    private Processore processore;
    private Vector<Memoria> ram;
    private int nRam;

    public Robot(String nome, float costoSec, Processore processore, Memoria memoria) throws ValoreNonValido {
        this.nome = nome;
        setCostoSec(costoSec);
        this.processore = processore;
        ram = new Vector<Memoria>();
        ram.add(memoria);
    }

    public String getNome() {
        return nome;
    }


    public float getCostoSec() {
        return costoSec;
    }

    public void setCostoSec(float costoSec) throws ValoreNonValido {
        if (costoSec<=0) throw new ValoreNonValido();
        else this.costoSec = costoSec;
    }

    public Processore getProcessore() {
        return processore;
    }

    public void addMemoria(Memoria mem) {
        if (nRam < 4) {
            ram.add(mem);
            nRam++;
        }
    }

    public void deleteMemoria(Memoria mem) {
        for (Memoria m:ram) {
            if (mem==m){
                ram.remove(m);
            }
        }
    }

    public Vector<Memoria> getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "\n\tnome='" + nome + '\'' +
                ",\n\t costoSec=" + costoSec +
                ",\n\t processore=" + processore.toString() +
                ",\n\t ram=" + ram.toString() +
                ",\n\t nRam=" + nRam +
                "\n}";
    }
}
