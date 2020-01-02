import processing.core.PApplet;
import java.awt.*;
import java.util.Random;

public class Inizio extends PApplet {
    private Cerchio c;
    /*
        2160p: 3840 x 2160
        1440p: 2560 x 1440
        1080p: 1920 x 1080
        720p: 1280 x 720
        480p: 854 x 480
        360p: 640 x 360
        240p: 426 x 240
    */
    private int DIM_X = 854;
    private int DIM_Y = 480;
    // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("Inizio");
    }

    // method used only for setting the size of the window
    public void settings(){
        size(DIM_X, DIM_Y);
    }

    // runs once at the beginning
    public void setup(){
        background(255,255,255);
        c = new Cerchio(this); //gli passa la PApplet
    }

    // runs over and over again as long as the program is still running
    public void draw(){

        Random rand = new Random();
        c.setCordX(random(DIM_X));
        c.setCordY(random(DIM_Y));
        c.show();
        c.setColore(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
        c.setBordo(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
        delay(100);
    }
}
