

public class Lavorazione {
    private String nome;
    private int secondi;
    private Robot robotUtilizzato;

    public Lavorazione(String nome, int secondi, Robot robotUtilizzato) throws ValoreNonValido {
        this.nome = nome;
        if (secondi<=0) throw new ValoreNonValido();
        else this.secondi = secondi;
        this.robotUtilizzato = robotUtilizzato;
    }

    public String getNome() {
        return nome;
    }

    public int getSecondi() {
        return secondi;
    }

    public Robot getRobotUtilizzato() {
        return robotUtilizzato;
    }

    @Override
    public String toString() {
        return "\nLavorazione{" +
                "\n\tnome='" + nome + '\'' +
                ",\n\t secondi=" + secondi +
                ",\n\t robotUtilizzato=" + robotUtilizzato.toString() +
                "\n}";
    }
}
