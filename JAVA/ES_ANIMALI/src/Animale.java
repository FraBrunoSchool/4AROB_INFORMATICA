public abstract class Animale {
    public String nome;

    public Animale(String nome){
        this.nome=nome;
    }

    public abstract String attivita();
    public abstract String vive();
    public abstract String mangia();

    public void presentati(){
        System.out.println("Mi chiamo: " + nome +
                " Mi piace: " + attivita()  +
                " Vivo: " + vive() +
                " e Mangio: " + mangia());
    }
}
