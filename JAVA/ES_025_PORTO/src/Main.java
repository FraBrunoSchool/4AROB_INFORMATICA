import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Posto uno = new Posto("BRNIO134KGPV", "Degio",
                new GregorianCalendar(2018, 6, 27),
                new GregorianCalendar(2018, 6, 29),
                new Barca("abc34", 64, 2018));
        Porto venezia = new Porto(10.0f);
        System.out.printf(venezia.affittaPosto(10, uno));
        System.out.printf(venezia.getPrezzo(10));
    }
}
