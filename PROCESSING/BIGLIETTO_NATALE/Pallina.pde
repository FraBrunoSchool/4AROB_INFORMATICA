public class Pallina {
  private float dim;
  private final static int DIM_DEFAULT = 30;
  private float cordX;
  private float cordY;
  private color colore;
  private color bordo;
   
  public Pallina(){
    cordX = width / 2;
    cordY = height / 2;
    colore = color(255, 255, 255);
    bordo = color (0, 0, 0);
    dim = DIM_DEFAULT;
  }
  
  public void show(){
    stroke(bordo);
    fill(colore);
    circle(cordX, cordY, dim);
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
  
  public void setColore(color colore){
    this.colore = color(colore);
  }
  
  public color getColore(){
    return colore;
  }
  
  public color getBordo(){
    return bordo;
  }
  
  public void setBordo(color colore){
    bordo = colore;
  }
}
