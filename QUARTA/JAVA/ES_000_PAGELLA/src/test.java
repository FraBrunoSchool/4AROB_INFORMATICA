import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Data d;
        d = new Data(10, 10, 2019);
        System.out.println(d.toString());

        Voto v1 = new Voto(d, 7f, 0.5f, 's');
        Voto v2 = new Voto(new Data(40,10,2019), 9f, 1f, 'o');
        System.out.println(v1.toString());
        System.out.println(v2);

        Materia m = new Materia("Info");
        m.aggiungiVoto(v1);
        m.aggiungiVoto(v2);
        System.out.println(m.getnVoti());
        System.out.println(m.toString());

        Pagella p= new Pagella(2);
        p.aggiungiMateria(m);
        System.out.println(p.toString());
    }
}