import java.io.IOException;
import java.util.Vector;

public class Carburante {
    private Vector <Float> prezzi;

    public Carburante(){
        prezzi=new Vector<Float>();
    }

    public void addPrezzo(float prezzo) throws PrezzoNonValido {
        if (prezzo<=0)throw new PrezzoNonValido(prezzo);
        else prezzi.add(prezzo);
    }

    public float media() throws ArrayEmpty{
        if (prezzi.size()<1) throw new ArrayEmpty();
        else{
            float somma=0;
            for (float prezzo: prezzi) somma+=prezzo;
            return somma/prezzi.size();
        }
    }

    public float max() throws ArrayEmpty{
        if (prezzi.size()<1) throw new ArrayEmpty();
        else{
            float max=prezzi.get(0);
            for (float prezzo: prezzi) max=prezzo>max?prezzo:max;
            return max;
        }
    }

    public float min() throws ArrayEmpty{
        if (prezzi.size()<1) throw new ArrayEmpty();
        else{
            float min=prezzi.get(0);
            for (float prezzo: prezzi) min=prezzo<min?prezzo:min;
            return min;
        }
    }

    @Override
    public String toString() {
        String print="";
        for (float prezzo: prezzi) print+="| " + prezzo + " |\n";
        return print;
    }
}
