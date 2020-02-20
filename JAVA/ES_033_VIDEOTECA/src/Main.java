public class Main {
    public static void main(String[] args) {
        DVD d = new DVD("bla", 20000);
        d.addLingua(TipoLingua.D);
        d.addLingua(TipoLingua.ITA);
        d.addLingua(TipoLingua.GB);
        System.out.println(d.getLingue());
        DVD d2 = new DVD("bla", 20000);
        d.addLingua(TipoLingua.D);
        d.addLingua(TipoLingua.ITA);
        d.addLingua(TipoLingua.GB);
        System.out.println(d.getLingue());
        CD c = new CD("bla", 20000, 2);
        CD c2 = new CD("bla", 20000, 20);
        Videoteca v = new Videoteca("fra", "boh");
        v.addCassetta(d);
        v.addCassetta(d2);
        v.addCassetta(c);
        v.addCassetta(c2);
        System.out.println(d.getCodice() + " | " + d2.getCodice() + "| " + c.getCodice() + " | " + c2.getCodice());
        System.out.println(d.getnCopie() + " | " + d2.getnCopie() + "| " + c.getnCopie() + " | " + c2.getnCopie());
        System.out.println(d.getCodice());
        v.compro(d.getCodice());
        System.out.println(d.getCodice());
    }
}
