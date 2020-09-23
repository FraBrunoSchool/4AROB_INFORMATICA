public class Scritta {
  private float cordX;
  private float cordY;
  private color colore;
  private String testo;
  private int dim;
   
  public Scritta(){
    cordX = (width/2)+300;
    cordY = height/2-40;
    testo = "Buon Natale\ne\nFelice Anno Nuovo";
    dim = 40;
    colore = color(255,215,0);
  }
  
  public void show(){
    fill(colore);
    textSize(dim);
    textAlign(CENTER);
    text(testo, cordX, cordY);
  }
  
  public void setColore(color colore){
    this.colore = color(colore);
  }
  
  public color getColore(){
    return colore;
  }
  
  public void setCordY(int cordY){
    this.cordY=this.cordY+cordY;
    if(this.cordY>=400){
      this.cordY=55;
    }
  }
}
