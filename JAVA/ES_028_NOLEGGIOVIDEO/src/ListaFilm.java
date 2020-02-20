import java.util.Vector;

public class ListaFilm {
    private static Vector <Prodotto> lista;

    public ListaFilm(){
        lista = new Vector<Prodotto>();
    }

    public static void addFilm(Prodotto n){
        lista.add(n);
    }

    public Prodotto getFilm(String titolo){
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).getTitolo().equals(titolo)) {
                Prodotto p = new Prodotto(lista.get(i).getTitolo(), lista.get(i).getGenere(), lista.get(i).getPrezzo());
                lista.removeElementAt(i);
                return p;
            }
        return null;
    }

    public String visualizzaListaFilm(){
        String print="";
        for (int i = 0; i < lista.size(); i++) print+="\n"+lista.get(i).toString();
        return print;
    }
}
