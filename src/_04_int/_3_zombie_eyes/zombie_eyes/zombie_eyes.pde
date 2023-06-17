PImage face;
void setup() {
  face = loadImage("smile.png");
  size(300,300);
}
void draw() {
  face.resize(300,300);
  image(face,0,0);
  int r = 200;
  int g = 30;
  int b = 30;
  if(mouseX>=150){
    b = 200;
  }
  if(mouseY>=150){
    g = 200;
  }
  fill(r,g,b);
  ellipse(90,120,40,80);
  ellipse(150,120,40,80);
  fill(0,0,0);
  ellipse(90,120,15,40);
  ellipse(150,120,15,40);
}
