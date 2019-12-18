public class Pino {
  private float cordXA;
  private float cordYA;
  private float cordXB;
  private float cordYB;
  private float cordXC;
  private float cordYC;
  private color colore;
  private color bordo;
   
  public Pino(){
    cordXA = (width/2) - 30;
    cordYA = 100;
    
    cordXB = ((width-100)/2)-100;
    cordYB = height-125;
    
    cordXC = ((width-100)/2)+150;
    cordYC = height-125;
    
    colore = color(255, 255, 255);
    bordo = color (255, 255, 255);
  }
  
  public void show(){
    stroke(bordo);
    fill(colore);
    triangle(cordXA, cordYA, cordXB, cordYB, cordXC, cordYC);
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
