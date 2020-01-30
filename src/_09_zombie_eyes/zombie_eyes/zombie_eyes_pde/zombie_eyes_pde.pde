
    void setup(){
      size(500, 500);
       PImage face = loadImage("zombieFace.png");
       face.resize(500,500);
image(face, 0, 0);

    }

    void draw(){
if(mousePressed){
  println("x ="+mouseX+", y ="+mouseY);
}
ellipse(111, 273, 75, 75);
fill(mouseY,mouseX,mouseX+mouseY);
ellipse(299, 270, 85, 85);
fill(mouseX,mouseY,mouseX-mouseY);

    }
