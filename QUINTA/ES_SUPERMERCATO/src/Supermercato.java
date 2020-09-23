import java.util.Vector;

public class Supermercato {
    private Vector <Prodotto> prodotti;
    private String nome;
    private String nomeArchivio;

    public Supermercato(String nome, String nomeArchivio){
        this.nome=nome;
        this.nomeArchivio=nomeArchivio;
        prodotti= new Vector<Prodotto>();
    }

    public void addProdotto(Prodotto prodotto){
        if(ricercaProdotto(prodotto.getCodiceProdotto())==null && ricercaProdotto(prodotto.getNomeProdotto())==null){
            prodotti.add(prodotto);
        }
    }

    public Prodotto ricercaProdotto(long codice){
        int cont = 0;
        while(cont<prodotti.size()){
            if(prodotti.get(cont).getCodiceProdotto()==codice){
                return prodotti.get(cont);
            }
            cont++;
        }
        return null; // se non esiste
    }

    public Prodotto ricercaProdotto(String nome){
        int cont = 0;
        while(cont<prodotti.size()){
            if(prodotti.get(cont).getNomeProdotto().equals(nome)){
                return prodotti.get(cont);
            }
            cont++;
        }
        return null; // se non esiste
    }

    public void delateProdotto(Prodotto prodotto){
        if(ricercaProdotto(prodotto.getCodiceProdotto())!=null && ricercaProdotto(prodotto.getNomeProdotto())!=null){
            prodotti.removeElement(prodotto);
        }
    }

    public void updateProdotto(Prodotto prodotto){
        if(ricercaProdotto(prodotto.getCodiceProdotto())!=null && ricercaProdotto(prodotto.getNomeProdotto())!=null){
            prodotti.removeElement(prodotto);
        }
    }

    public Vector<Prodotto> ricercaValoreReparto(String reparto){
        Vector <Prodotto> prodottiRep = new Vector<Prodotto>();
        int cont = 0;
        while(cont<prodotti.size()){
            if(String.valueOf(prodotti.get(cont).getReparto()).equals(reparto)){
                prodottiRep.add(prodotti.get(cont));
            }
            cont++;
        }
        return prodottiRep;
    }

    public String telefonoResponsabile(String reparto){
        int cont = 0;
        while(cont<prodotti.size()){
            if(String.valueOf(prodotti.get(cont).getReparto()).equals(reparto)){
                return "Responsabile: " + prodotti.get(cont).getResponsabile() + " Numero: " + prodotti.get(cont).getTelefono();
            }
            cont++;
        }
        return "Nessun Responsabile Trovato";
    }


    /*
    public String toStringSave() {
        char carattere = ' ';
        return  produttore + carattere +
                reparto + carattere +
                categoria + carattere +
                scaffale + carattere +
                nomeProdotto + carattere +
                quantita + carattere +
                codiceProdotto + carattere +
                unitaMisura + carattere +
                prezzo + carattere +
                taglia + carattere +
                sconto + carattere +
                responsabile + carattere +
                telefono + carattere +
                scadenza + carattere;
    }
    */


    public Vector<String> salvaSupermercatoCSV(){
        Vector <String> save = new Vector<String>();
        for (Prodotto p: prodotti) {
            save.add(p.toStringSave());
        }
        return save;
    }
}