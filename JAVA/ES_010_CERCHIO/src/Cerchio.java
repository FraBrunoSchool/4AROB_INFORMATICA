public class Cerchio {
    private float raggio;

    public Cerchio(float raggio){
        this.raggio=raggio>=0?raggio:0;
    }

    public Cerchio(){
        raggio=0;
    }

    public void setRaggio(float raggio) {
        this.raggio=raggio>=0?raggio:0;
    }

    public float getRaggio() {
        return raggio;
    }

    public float getArea(){
        return (float) (Math.PI*Math.pow(raggio, 2.0));
    }

    public float getCirconferenza(){
        return (float) (2*Math.PI*raggio);
    }
}
