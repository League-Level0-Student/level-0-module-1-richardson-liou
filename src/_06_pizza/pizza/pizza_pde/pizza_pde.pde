import ddf.minim.*;
Minim minim; 
AudioPlayer sound;
void setup(){
minim = new Minim(this);      
sound = minim.loadFile("slap.wav");      
size(300,300);
fill(#DEC800);
ellipse(150,150,150,150);
 
  }

void draw(){

  if (mousePressed && (mouseButton == LEFT)) {
  sound.play();
  sound.rewind();
  PImage pepperoni =loadImage("pepperoni.png");
  pepperoni.resize(150,150);
  image(pepperoni,75,80);
  } 
}
