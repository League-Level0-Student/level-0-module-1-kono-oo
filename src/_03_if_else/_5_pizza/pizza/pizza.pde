PImage pepperoni;
PImage mushroom;
void setup() {
    size(500, 500);
    fill(200,180,150);
    ellipse(250, 250, 400, 400);
    fill(170,0,0);
    ellipse(250,250, 350, 350);
    fill(230,220,0);
    ellipse(250, 250, 320, 320);
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
}
void draw() {
  if(mousePressed){
    image(pepperoni, 250,250);
    image(pepperoni, 150,100);
    image(pepperoni, 100,230);
    image(pepperoni, 255,120);
    image(pepperoni, 170,310);
    image(pepperoni, 300,200);
    image(pepperoni, 180,180);
  }
  if(mousePressed && (mouseButton ==RIGHT)){
    image(mushroom, 100,160);
    image(mushroom, 220,220);
    image(mushroom, 160,300);
    image(mushroom, 290,120);
    image(mushroom, 220,220);
    image(mushroom, 180,90);
    image(mushroom, 300,280);
  }
}
