public class Memoria {
    private int GB;
    private String marca;

    public Memoria(int GB, String marca) throws ValoreNonValido {
        if (GB<=0) throw new ValoreNonValido();
        else this.GB = GB;
        this.marca = marca;
    }

    public int getGB() {
        return GB;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "\n\tGB=" + GB +
                ",\n\tmarca='" + marca + '\'' +
                "\n}";
    }
}
