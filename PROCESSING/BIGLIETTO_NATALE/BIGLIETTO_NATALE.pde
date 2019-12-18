/*
  Autore: Bruno Francesco;
  Data Fine: 18/12/2019;
  Consegna: 
    Il progetto deve contenere:
      - classi e oggetti opportuni
      - 4 forme diverse
      - 2 animazioni di movimento diverse 
      Facoltativo: immagini e suoni
      SI VALUTERA' anche la complessità del progetto
*/

/*
  import processing.sound.*;
  //right above the setup function, add the following code
  SoundFile file;
    //replace the sample.mp3 with your audio file name here
  String audioName = "aNatalePuoi.mp3";
  String path;
*/

private Biglietto biglietto;
private Stella stella;
private Tronco tronco;
private Pino pino;
private Scritta scritta;
private Pallina[] palline;
private Stella stellaAlbero;

private final int N_PALLINE = 8;
private int stato = 0;

public void settings(){
  size(1050, 550);
}

public void setup() {   
    background(255,255,255);
    
    biglietto = new Biglietto();
    stella = new Stella();
    tronco = new Tronco();
    pino = new Pino();
    scritta = new Scritta();
    palline = new Pallina[N_PALLINE];
    stellaAlbero = new Stella();
    
    /*
    path = sketchPath(audioName);
    file = new SoundFile(this, path);
    file.play();
    */
}
  
public void draw(){
    biglietto.setColore(color(220,20,60)); 
    biglietto.show();  
    
    stella.setColore(color(255,255,0)); 
    stella.show(); 
    
    tronco.setColore(color(128,0,0)); 
    tronco.show(); 
    
    pino.setColore(color(0,100,0)); 
    pino.show(); 
    
    scritta.show();
    scritta.setCordY(5);
    
    for(int i=0;i<N_PALLINE;i++){
      
      switch(i) {
        
        case 0:
           palline[i] = new Pallina();
           palline[i].setCordX(((width-100)/2)-70);
           palline[i].setCordY(height-150);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;  
        
        case 1:
           palline[i] = new Pallina();
           palline[i].setCordX(((width-100)/2)+120);
           palline[i].setCordY(height-150);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;
        
        case 2:
           palline[i] = new Pallina();
           palline[i].setCordX(((width-100)/2)+70);
           palline[i].setCordY(height/2+50);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;
        
        case 3:
           palline[i] = new Pallina();
           palline[i].setCordX(((width-100)/2)-20);
           palline[i].setCordY(height/2+50);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;
        
        case 4:
           palline[i] = new Pallina();
           palline[i].setCordX((width/2)-30);
           palline[i].setCordY(270);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;
        
        case 5:
           palline[i] = new Pallina();
           palline[i].setCordX((width/2)-30);
           palline[i].setCordY(220);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;
        
        case 6:
           palline[i] = new Pallina();
           palline[i].setCordX((width/2) - 30);
           palline[i].setCordY(160);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;
        
        case 7:
           palline[i] = new Pallina();
           palline[i].setCordX((width-100)/2+20);
           palline[i].setCordY(height-150);
           palline[i].setColore(color(random(256), random(256), random(256)));
           palline[i].show();
        break;
        }
    }
    
    stellaAlbero.setCordX(width*0.475);
    stellaAlbero.setCordY(height*0.15);
    stellaAlbero.setDim(20, 50);
    if(stato==0){
      stellaAlbero.setColore(color(255,255,0));
      stato=1;
    }else{
      if(stato==1){
        stellaAlbero.setColore(color(255,165,0));
        stato=0;
      }
    }
    stellaAlbero.show();
   
    delay(70);
                      
}
