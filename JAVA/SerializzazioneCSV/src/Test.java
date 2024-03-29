public class Test {
    public static void main (String[] args){
        //nome del file in cui andare a salvare
        String nomefile = "file.csv";

        Autore collodi = new Autore("Carlo", "Collodi");
        Autore perrault = new Autore("Charles","Perrault");
        Libreria libreria = new Libreria();
        Libro l1 = new Libro("Pinocchio", collodi, 150);
        Libro l2 = new Libro("Pollicino", perrault, 80);
        Libro l3 = new Libro("La bella addormentata nel bosco", perrault, 50);
         // inserimento volumi
        libreria.addVolume(l1);
        libreria.addVolume(l2);
        libreria.addVolume(l3);
        //cambio il prezzo a pagina
        Libro.setCostoPagina(0.01);
        System.out.println(libreria);

        // salvataggio libreria su file
        libreria.salvaLibreria(nomefile);

        // caricamento libreria da file
        Libreria l = new Libreria();
        l.caricaLibreria(nomefile);
        System.out.println("Dopo: " + l);

   }
}
