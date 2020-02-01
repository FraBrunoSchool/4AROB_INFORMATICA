public class Scoiattolo extends Animale {

    public Scoiattolo(String s){
        super(s);
    }

    @Override
    public String attivita() {
        return "Saltare tra i rami";
    }

    @Override
    public String vive() {
        return "nei boschi";
    }

    @Override
    public String mangia() {
        return "ghiande";
    }
}
