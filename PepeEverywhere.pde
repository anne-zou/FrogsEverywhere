PImage img;
String message;
void setup() {
  fullScreen(SPAN);
  img = loadImage("pepe.png");
  message = "omg 3 many pepes pls stop";
  imageMode(CENTER);
  textAlign(CENTER);
  textSize(50);
  frameRate(20);
  
}

void draw() {
  if (millis() >= 10000) {
    text(message, width/2, height/2);
  }
  if (mouseX != 0 && mouseY != 0) {
    image(img, mouseX, mouseY);
  }
}