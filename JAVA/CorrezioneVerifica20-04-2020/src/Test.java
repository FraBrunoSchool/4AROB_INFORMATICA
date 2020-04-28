public class Test {
    public static void main(String[] args) throws ValoreNonValido {
        Azienda a = new Azienda("Da best");
        a.addLavorazione(new Lavorazione("one", 120,
                new TipoA("tipoA", 30f,
                        new Processore("Intel", "i5", 3),
                        new Memoria(4, "crucial"), 1, 1)
        ));
        a.addLavorazione(new Lavorazione("two", 120,
                new TipoB("tipoB", 30f,
                        new Processore("AMD", "r5", 3),
                        new Memoria(4, "crucial"), 1)
        ));
        a.addLavorazione(new Lavorazione("three", 120,
                new TipoC("tipoC", 30f,
                        new Processore("ARM", "boh", 3),
                        new Memoria(4, "crucial"), TipoMateriale.ALLUMINIO)
        ));

        System.out.println(a.toString());
    }
}
