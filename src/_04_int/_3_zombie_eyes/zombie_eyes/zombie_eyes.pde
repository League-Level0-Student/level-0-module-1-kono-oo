PImage face;
void setup() {
  face = loadImage("smile.png");
  size(300,300);
}
void draw() {
  face.resize(300,300);
  image(face,0,0);
  fill(200,30,30);
  ellipse(90,120,40,80);
  ellipse(150,120,40,80);
}
