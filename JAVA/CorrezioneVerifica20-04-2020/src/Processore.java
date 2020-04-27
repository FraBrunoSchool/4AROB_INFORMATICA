public class Processore {
    private String marca;
    private String modello;
    private int velocitaClock;

    public Processore(String marca, String modello, int velocitaClock) {
        this.marca = marca;
        this.modello = modello;
        this.velocitaClock = velocitaClock;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getVelocitaClock() {
        return velocitaClock;
    }

    @Override
    public String toString() {
        return "\nProcessore{" +
                "\n\tmarca='" + marca + '\'' +
                ",\n\tmodello='" + modello + '\'' +
                ", \n\tvelocitaClock=" + velocitaClock +
                "\n}";
    }
}
