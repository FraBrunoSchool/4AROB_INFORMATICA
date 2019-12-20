public class Tronco {
  private float alt;   
  private float lung;
  private final static int DIM_DEFAULT_L = 50;
  private final static int DIM_DEFAULT_H = 100;
  private float cordX;
  private float cordY;
  private color colore;
  private color bordo;
   
  public Tronco(){
    cordX = (width-100)/2;
    cordY = height-125;
    colore = color(255, 255, 255);
    bordo = color (255, 255, 255);
    alt = DIM_DEFAULT_H;
    lung = DIM_DEFAULT_L;
  }
  
  public void show(){
    stroke(bordo);
    fill(colore);
    rect(cordX,cordY,lung,alt);
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
    bordo = colore;
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

  public void setAlt(float alt){
    this.alt=alt;
  }
  
  public float getAlt(){
    return alt;
  }
  
  public void setLung(float lung){
    this.lung=lung;
  }
  
  public float getLung(){
    return lung;
  }
}
