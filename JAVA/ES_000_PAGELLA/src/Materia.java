public class Materia {
    private  String nome;
    private int nVoti;
    private final int NMAXVOTI = 10;
    private Voto[] voti;

    public Materia (String nome){
        this.nome = nome;
        nVoti = 0;
        voti = new Voto[NMAXVOTI];
    }

    public void aggiungiVoto(Voto v){
        if (nVoti < NMAXVOTI) {
            voti[nVoti] = v;
            nVoti++;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getnVoti() {
        return nVoti;
    }

    @Override
    public String toString() {
        String votString=" | ";
        for (int i = 0; i < nVoti; i++) {
            votString += "" + voti[i].toString()+ " | ";
        }
        return "\tMateria: " + nome + "\n\tVoti: " + votString;
    }
}
