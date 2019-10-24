public class Voto {

    private Data giorno;
    private float voto;
    private float peso;
    private char tipo;

    public Voto(Data giorno, float voto, float peso, char tipo){

        this.giorno = giorno;
        if (voto>0&&voto<10)
            this.voto=voto;
        else
            this.voto = 1f;

        if (peso>=0)
            this.peso = peso;
        else
            this.peso = 1f;

        if (tipo == 's' || tipo =='o' || tipo == 'p')
            this.tipo = tipo;
        else
            this.tipo = 'o';
    }

    @Override
    public String toString() {
        return this.giorno.toString() +
                String.format(": %.2f (%.2f) %c", this.voto, this.peso, this.tipo);
    }

    public void setGiorno(Data giorno) {
        this.giorno = giorno;
    }

    public void setPeso(float peso) {
        if (peso>=0)
            this.peso = peso;
        else
            this.peso = 1;
    }

    public void setTipo(char tipo) {
        if (tipo == 's' || tipo =='o' || tipo == 'p')
            this.voto = tipo;
        else
            this.tipo = 'o';
    }

    public void setVoto(float voto) {
        if (voto>0&&voto<10)
            this.voto=voto;
        else
            this.voto = 1f;
    }

    public char getTipo() {
        return tipo;
    }

    public Data getGiorno() {
        return giorno;
    }

    public float getPeso() {
        return peso;
    }

    public float getVoto() {
        return voto;
    }
}
