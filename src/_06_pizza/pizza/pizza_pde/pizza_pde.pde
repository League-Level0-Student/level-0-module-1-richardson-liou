import ddf.minim.*;
Minim minim; 
AudioPlayer sound;
void setup(){
minim = new Minim(this);      
sound = minim.loadFile("smush.ogg");      
size(300,300);
fill(#DEC800);
ellipse(150,150,150,150);
}
void draw(){
 if (mousePressed && (mouseButton == RIGHT)) {
  sound.play();
  sound.rewind();
  PImage pepperoni =loadImage("pepporoni.jpg");
  pepperoni.resize(100,100);
  image(pepperoni,100,100);
  }
  
  
}
