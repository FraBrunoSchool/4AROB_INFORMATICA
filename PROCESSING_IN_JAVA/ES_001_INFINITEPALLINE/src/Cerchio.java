import java.awt.*;
import processing.core.PApplet;

public class Cerchio {
    private PApplet processing; //oggetto finestra in cui viene usato
    private float dim;   //diametro cerchio
    private final static int DIM_DEFAULT = 100;
    private float cordX;  //coordinate del centro
    private float cordY;
    private Color colore;  //colore riempimento
    private Color bordo;   //colore bordo

    public Cerchio(PApplet processing){
        this.processing = processing;
        cordX = processing.width / 2;  //piazzato al centro della finestra
        cordY = processing.height / 2;
        //colore di default bianco con bordo nero
        colore = new Color(255, 255, 255);
        bordo = new Color (0, 0, 0);
        dim = DIM_DEFAULT;
    }

    public void show(){
        processing.stroke(bordo.getRGB());  //colore bordo
        processing.fill(colore.getRGB());  //colore di riempimento
        processing.circle(cordX, cordY, dim);  //centro X,Y e diametro dim
    }

    public void setCordX(float x){
        cordX = x;
    }

    public void setCordY(float y){
        cordY = y;
    }

    public float getCordX(){
        return cordX;
    }

    public float getCordY(){
        return cordY;
    }

    public void setColore(Color colore){
        this.colore = colore;
    }

    public Color getColore(){
        return colore;
    }

    public Color getBordo(){
        return bordo;
    }

    public void setBordo(Color colore){
        bordo = colore;
    }
}
