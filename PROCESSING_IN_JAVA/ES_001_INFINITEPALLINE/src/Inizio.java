import processing.core.PApplet;

import java.awt.*;

public class Inizio extends PApplet {
    private Cerchio c;
    // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("Inizio");
    }

    // method used only for setting the size of the window

    public void settings(){
        size(640, 360);
    }

    // runs once at the beginning

    public void setup(){
        background(25,55,2);
        c = new Cerchio(this); //gli passa la PApplet
    }

    // runs over and over again as long as the program is still running

    public void draw(){

        c.setCordX(random(640));
        c.setCordY(random(360));
        c.show();
        delay(100);
        //c.setColore(new Color(random(256), random(256), random(256)));
    }
}
