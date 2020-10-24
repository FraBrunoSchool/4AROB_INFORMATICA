public class Stella{
  private float cordX;
  private float cordY;
  private float dimUno;
  private float dimdue;
  private color colore;
  private color bordo;
   
  public Stella(){
    cordX = width*0.15;
    cordY = height*0.25;
    colore = color(255, 255, 255);
    bordo = color (0, 0, 0);
    dimUno = 50;
    dimdue = 90;
  }
  
  public void show(){
    stroke(bordo);
    fill(colore);
    pushMatrix();
    translate(cordX, cordY);
    rotate(frameCount / 20.0);
    star(0, 0, dimUno, dimdue, 5); 
    popMatrix();
  }
  
  public void setColore(color colore){
    this.colore = color(colore);
  }
  
  public color getColore(){
    return colore;
  }
  
  void star(float x, float y, float radius1, float radius2, int npoints) {
    float angle = TWO_PI / npoints;
    float halfAngle = angle/2.0;
    beginShape();
    for (float a = 0; a < TWO_PI; a += angle) {
      float sx = x + cos(a) * radius2;
      float sy = y + sin(a) * radius2;
      vertex(sx, sy);
      sx = x + cos(a+halfAngle) * radius1;
      sy = y + sin(a+halfAngle) * radius1;
      vertex(sx, sy);
    }
    endShape(CLOSE);
  }
 
 public void setCordX(float cordX){
    this.cordX = cordX;
  }
  
 public void setCordY(float cordY){
   this.cordY = cordY;
 }
 
 public void setDim(int dimUno, int dimdue){
   this.dimUno = dimUno;
   this.dimdue = dimdue;
 }
}
