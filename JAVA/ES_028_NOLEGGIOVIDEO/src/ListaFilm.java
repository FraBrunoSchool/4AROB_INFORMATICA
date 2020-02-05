import java.util.Vector;

public class ListaFilm {
    private Vector <Noleggio> lista;

    public ListaFilm(){
        lista = new Vector<Noleggio>();
    }

    public void addNoleggio(Noleggio n){
        lista.add(n);
    }

    public String getFilmNoleggiati(String nome){
        String film ="";
        for (int i = 0; i < lista.size(); i++) if (lista.get(i).getNomeCliente().equals(nome)) film+=" | "+ lista.get(i).getProdotto().getTitolo();
        return film;
    }
    public String visualizza(){
        String print="";
        for (int i = 0; i < lista.size(); i++) print+="\n"+lista.get(i).toString();
        return print;
    }
}
