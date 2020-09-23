import java.util.Vector;

public class ListaNoleggi {
    private Vector<Noleggio> lista;

    public ListaNoleggi(){
        lista = new Vector<Noleggio>();
    }

    public void addNoleggio(Noleggio n){
        lista.add(n);
    }

    public String getResoNoleggio(String nomeCliente, String titolo, int annoReso, int meseReso, int giornoReso){
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).getNomeCliente().equals(nomeCliente)&&lista.get(i).getProdotto().getTitolo().equals(titolo)) {
                float prezzo = lista.get(i).reso(annoReso, meseReso, giornoReso);
                ListaFilm.addFilm(lista.get(i).getProdotto());
                lista.removeElementAt(i);
                return "Reso Eseguito!! Devi pagare: " + prezzo;
            }
        return "Noleggio non trovato";
    }

    public String visualizzaNoleggiUtente(String nomeCliente){
        String print ="";
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).getNomeCliente().equals(nomeCliente)) print+=lista.get(i).toString();
        return print;
    }

    public String visualizzaListaNoleggi() {
        String print ="";
        for (int i = 0; i < lista.size(); i++) print+=lista.get(i).toString();
        return print;
    }
}
