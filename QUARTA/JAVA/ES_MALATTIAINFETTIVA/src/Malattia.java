import java.util.Vector;

public class Malattia {
    private String nome;
    private float giorniRaddoppio;
    private static final float GIORNI_DEFAULT = 1f;
    private Vector<Focolaio> focolai;

    public Malattia(String nome, float giorniRaddoppio){
        this.nome=nome;
        this.giorniRaddoppio=giorniRaddoppio>0?giorniRaddoppio:GIORNI_DEFAULT;
        focolai=new Vector<Focolaio>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGiorniRaddoppio(float giorniRaddoppio) {
        this.giorniRaddoppio=giorniRaddoppio>0?giorniRaddoppio:GIORNI_DEFAULT;
    }

    public String getNome() {
        return nome;
    }

    public float getGiorniRaddoppio() {
        return giorniRaddoppio;
    }

    public void addFocolaio(Focolaio f){
        focolai.add(f);
    }
}
