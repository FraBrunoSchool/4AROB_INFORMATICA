public class Rettangolo {
    private float base;
    private float altezza;

    public Rettangolo(float base,float altezza){
        this.base=base>=0?base:0;
        this.altezza=altezza>=0?altezza:0;
    }

    public Rettangolo(){
        base=0;
        altezza=0;
    }

    public String isSquare(){
        return base==altezza?"E' un quadraro":"E' un rettangolo";
    }

    public float getAltezza() {
        return altezza;
    }

    public float getBase() {
        return base;
    }

    public void setAltezza(float altezza) {
        this.altezza=altezza>=0?altezza:0;
    }

    public void setBase(float base) {
        this.base=base>=0?base:0;
    }

    public float getArea() {
        return base*altezza;
    }

    public float getPerimetro() {
        return (2*base)+(2*altezza);
    }
}
