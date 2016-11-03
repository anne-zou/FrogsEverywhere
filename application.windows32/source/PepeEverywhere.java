import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PepeEverywhere extends PApplet {

PImage img;
String message;
public void setup() {
    
    img = loadImage("pepe.png");
    message = "omg 3 many pepes pls stop";
    imageMode(CENTER);
    textAlign(CENTER);
    textSize(50);
    frameRate(20);
}

public void draw() {
    if (millis() >= 10000) {
        text(message, width/2, height/2);
    }
    if (mouseX != 0 && mouseY != 0) {
        image(img, mouseX, mouseY);
    }
}
  public void settings() {  fullScreen(SPAN); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PepeEverywhere" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
