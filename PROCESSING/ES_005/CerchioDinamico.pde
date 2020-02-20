public class CerchioDinamico extends Cerchio{
  private float speedX;
  private float speedY;
  
  public CerchioDinamico(){
    super();
    speedX=10;
    speedY=0;
  }
  
  public void move(){
    setCordX(getCordX()+speedX);
    setCordY(getCordY()+speedY);
  }
  
  public void setSpeedX(float speedX){
    this.speedX=speedX;
  }
  
  public void setSpeedY(float speedY){
    this.speedY=speedY;
  }
  
  public float getSpeedX(){
    return speedX;
  }
  
  public float getSpeedY(){
    return speedY;
  }
}
