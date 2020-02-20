import java.io.IOException;
import java.util.Vector;

public class VettoriInteri {
    private int[] vett;
    private Vector <Integer> vector;

    public VettoriInteri(int dim) throws IOException {
        if (dim<0)throw new IOException("Input size too small");
        else vett=new int[dim];
        for (int i = 0; i < dim; i++) vett[i]=0;
    }

    public VettoriInteri(){
        vector = new  Vector <Integer> ();
    }

    public VettoriInteri(String stringa) throws NumberFormatException{
        String[] numero = stringa.split("\\|");
        vett=new int[numero.length];
        for (int i = 0; i < vett.length; i++) vett[i] = Integer.parseInt(numero[i]);
    }

    @Override
    public String toString() {
        String print=" ";
        for (int i = 0; i < vett.length; i++) print+=vett[i] + "|";
        return print;
    }

    public int min() throws ErroreVettoreVuoto {
        if (vett.length<0) throw new ErroreVettoreVuoto();
        else {
            int min = vett[0];
            for (int i = 1; i < vett.length; i++) min = vett[i] < min ? vett[i] : min;
            return min;
        }
    }
    public int find(int key) throws ErroreElementoInesistente {
        for (int i = 0; i < vett.length; i++) if (vett[i] == key) return i;
        throw new ErroreElementoInesistente(key);
    }

    public void remove(int key) throws ErroreElementoInesistente, ErroreVettoreVuoto {
        if (vett.length < 1) throw new ErroreVettoreVuoto();
        int index = find(key);
        int[] nvet = new int[vett.length - 1];
        System.arraycopy(vett, 0, nvet, 0, index);
        System.arraycopy(vett, index + 1, nvet, index, vett.length - index - 1);
        vett = nvet;
    }
}
