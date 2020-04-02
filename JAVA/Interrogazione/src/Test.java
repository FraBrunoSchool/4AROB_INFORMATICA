import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Officina o = new Officina("Da bruno", "Via officina 3");
        o.addDipendente("Fra");
        o.addDipendente("Bruno");
        System.out.println("Ci sono: " + o.getNumeroDipendenti());
        o.accettazione(new Date(2019, 12, 25, 15,50), "Stelvio", "BBB000FF", new Date(2000, 1, 1));
        o.accettazione(new Date(2019, 10, 02, 16, 20), "Stelvio", "BBB000FF", new Date(1990, 1, 1));
        System.out.println(o.toString());
    }
}
