import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.sound.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class HW1 extends PApplet {



PFont f;
PImage img, img2, bg;
int btn1X = 87, btn1Y = 170, btn2X = 87, btn2Y = 270, btn3X = 87, btn3Y = 370, btn4X = 87, btn4Y = 470, btn5X = 87, btn5Y = 570;
int btn1RX = 313, btn1RY = 170, btn2RX = 313, btn2RY = 270, btn3RX = 313, btn3RY = 370, btn4RX = 313, btn4RY = 470, btn5RX = 313, btn5RY = 570;
int btnCloseX = 50, btnCloseY = 720, btnOpenX = 150, btnOpenY = 720, btnAlarmX = 250, btnAlarmY = 720, btnCallX = 350, btnCallY = 720;
int btnSize = 80;
int currentFloor = 1;
int nextFloor;
int btn1Neutral, btn2Neutral, btn3Neutral, btn4Neutral, btn5Neutral;
int btn1RNeutral, btn2RNeutral, btn3RNeutral, btn4RNeutral, btn5RNeutral;
int closeNeutral, openNeutral, alarmNeutral, callNeutral;
//color btn1On, btn2On, btn3On, btn4On, btn5On;
//color btn1ROn, btn2ROn, btn3ROn, btn4ROn, btn5ROn;
//color closeOn, openOn, alarmOn, callOn;
int btnHighlight;
int screen, background;
int upArrow, downArrow, line, floor, closeSign;
char letter = ' ', flr = '1';
boolean btn1Over = false;
boolean btn2Over = false;
boolean btn3Over = false;
boolean btn4Over = false;
boolean btn5Over = false;
boolean btn1ROver = false;
boolean btn2ROver = false;
boolean btn3ROver = false;
boolean btn4ROver = false;
boolean btn5ROver = false;
boolean closeOver = false;
boolean openOver = false;
boolean alarmOver = false;
boolean callOver = false;
SoundFile file1;
SoundFile file2;
SoundFile file3;
SoundFile file4;
SoundFile file5;

public void setup(){
  
  btn1Neutral = color(255);
  btn2Neutral = color(255);
  btn3Neutral = color(255);
  btn4Neutral = color(255);
  btn5Neutral = color(255);
  btn1RNeutral = color(255);
  btn2RNeutral = color(255);
  btn3RNeutral = color(255);
  btn4RNeutral = color(255);
  btn5RNeutral = color(255);
  closeNeutral = color(255);
  openNeutral = color(255);
  alarmNeutral = color(255);
  callNeutral = color(255);
  btnHighlight = color(100);
  background = color(65);
  upArrow = color(0);
  downArrow = color(0);
  line = color(0);
  floor = color(0);
  closeSign = color(0);
  ellipseMode(CENTER);
  f = createFont("Arial", 16, true);
  flr = '1';
  file5 = new SoundFile(this, "first_floor.wav");
  file4 = new SoundFile(this, "second_floor.wav");
  file3 = new SoundFile(this, "third_floor.wav");
  file2 = new SoundFile(this, "fourth_floor.wav");
  file1 = new SoundFile(this, "fifth_floor.wav");
  img = loadImage("bell.png");
  img2 = loadImage("phone.png");
  bg = loadImage("texture.png");

}

public void draw(){
  update(mouseX, mouseY);
  background(65);
  
  stroke(0);
  fill(0);
  rect(70, 40, 250, 70);
  
  strokeWeight(1);
  
  if(btn1Over){
    fill(btnHighlight);
  }
  else{
    fill(btn1Neutral);
  }
  stroke(0);
  ellipse(btn1X, btn1Y, btnSize, btnSize);
  fill(150);
  ellipse(btn1X, btn1Y, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("5", 80, 175);
  
  if(btn2Over){
    fill(btnHighlight);
  }
  else{
    fill(btn2Neutral);
  }
  stroke(0);
  ellipse(btn2X, btn2Y, btnSize, btnSize);
  fill(150);
  ellipse(btn2X, btn2Y, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("4", 80, 275);
  
  if(btn3Over){
    fill(btnHighlight);
  }
  else{
    fill(btn3Neutral);
  }
  stroke(0);
  ellipse(btn3X, btn3Y, btnSize, btnSize);
  fill(150);
  ellipse(btn3X, btn3Y, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("3", 80, 375);
  
  if(btn4Over){
    fill(btnHighlight);
  }
  else{
    fill(btn4Neutral);
  }
  stroke(0);
  ellipse(btn4X, btn4Y, btnSize, btnSize);
  fill(150);
  ellipse(btn4X, btn4Y, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("2", 80, 475);
  
  if(btn5Over){
    fill(btnHighlight);
  }
  else{
    fill(btn5Neutral);
  }
  stroke(0);
  ellipse(btn5X, btn5Y, btnSize, btnSize);
  fill(150);
  ellipse(btn5X, btn5Y, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("1", 80, 575);
  
  if(btn1ROver){
    fill(btnHighlight);
  }
  else{
    fill(btn1RNeutral);
  }
  stroke(0);
  ellipse(btn1RX, btn1RY, btnSize, btnSize);
  fill(150);
  ellipse(btn1RX, btn1RY, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("5R", 297, 175);
  
  if(btn2ROver){
    fill(btnHighlight);
  }
  else{
    fill(btn2RNeutral);
  }
  stroke(0);
  ellipse(btn2RX, btn2RY, btnSize, btnSize);
  fill(150);
  ellipse(btn2RX, btn2RY, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("4R", 297, 275);
  
  if(btn3ROver){
    fill(btnHighlight);
  }
  else{
    fill(btn3RNeutral);
  }
  stroke(0);
  ellipse(btn3RX, btn3RY, btnSize, btnSize);
  fill(150);
  ellipse(btn3RX, btn3RY, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("3R", 297, 375);
  
  if(btn4ROver){
    fill(btnHighlight);
  }
  else{
    fill(btn4RNeutral);
  }
  stroke(0);
  ellipse(btn4RX, btn4RY, btnSize, btnSize);
  fill(150);
  ellipse(btn4RX, btn4RY, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("2R", 297, 475);
  
  if(btn5ROver){
    fill(btnHighlight);
  }
  else{
    fill(btn5RNeutral);
  }
  stroke(0);
  ellipse(btn5RX, btn5RY, btnSize, btnSize);
  fill(150);
  ellipse(btn5RX, btn5RY, 70, 70);
  
  textFont(f, 26);
  fill(0);
  text("1R", 297, 575);
  
  if(closeOver){
    fill(btnHighlight);
  }
  else{
    fill(closeNeutral);
  }
  stroke(255, 0, 0);
  ellipse(btnCloseX, btnCloseY, btnSize, btnSize);
  fill(150);
  ellipse(btnCloseX, btnCloseY, 70, 70);
  
  if(openOver){
    fill(btnHighlight);
  }
  else{
    fill(openNeutral);
  }
  stroke(255, 0, 0);
  ellipse(btnOpenX, btnOpenY, btnSize, btnSize);
  fill(150);
  ellipse(btnOpenX, btnOpenY, 70, 70);
  
  if(alarmOver){
    fill(btnHighlight);
  }
  else{
    fill(alarmNeutral);
  }
  stroke(255, 0, 0);
  ellipse(btnAlarmX, btnAlarmY, btnSize, btnSize);
  fill(150);
  ellipse(btnAlarmX, btnAlarmY, 70, 70);
  
  if(callOver){
    fill(btnHighlight);
  }
  else{
    fill(callNeutral);
  }
  stroke(255, 0, 0);
  ellipse(btnCallX, btnCallY, btnSize, btnSize);
  fill(150);
  ellipse(btnCallX, btnCallY, 70, 70);
  
  
  fill(0);
  stroke(0);
  strokeWeight(5);
  
  triangle(130, 720, 140, 730, 140, 710); 
  line(150, 700, 150, 735);
  triangle(170, 720, 160, 730,  160, 710);
  
  triangle(40, 720, 30, 730, 30, 710);
  line(50, 700, 50, 735);
  triangle(60, 720, 70, 730, 70, 710);
  
  textFont(f, 55);
  fill(0xffAF1313);
  text(flr, 245 , 95);
  text(letter, 270 , 95);
  
  strokeWeight(6);
  fill(line);
  stroke(line);
  line(225, 100, 225, 60);
  
  fill(upArrow);
  stroke(upArrow);
  triangle(225, 50, 215, 60, 235, 60);
  
  fill(downArrow);
  stroke(downArrow);
  triangle(225, 100, 215, 90, 235, 90); 
  
  fill(closeSign);
  stroke(closeSign);
  triangle(155, 75, 185, 55, 185, 95);
  triangle(125, 75, 95, 55, 95, 95);
  line(140, 50, 140, 100);
  
  image(img2, 335, 692);
  image(img, 228, 698);
}

public void update(int x, int y){
  if (btn1Over(btn1X, btn1Y, btnSize)){
    btn1Over = true;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false;
  }
  else if (btn2Over(btn2X, btn2Y, btnSize)){
    btn1Over = false;
    btn2Over = true;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false;
  }
  else if (btn3Over(btn3X, btn3Y,btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = true;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false;
  }
  else if (btn4Over(btn4X, btn4Y, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = true;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false;
  }
  else if (btn5Over(btn5X, btn5Y, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = true;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false;
  }
  else if (btn1ROver(btn1RX, btn1RY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = true;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false; 
  }
  else if (btn2ROver(btn2RX, btn2RY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = true;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false;
  }
  else if (btn3ROver(btn3RX, btn3RY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = true;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false; 
  }
  else if (btn4ROver(btn4RX, btn4RY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = true;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false; 
  }
  else if (btn5ROver(btn5RX, btn5RY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = true;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = false; 
  }
  else if (closeOver(btnCloseX, btnCloseY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = true;
    openOver = false;
    alarmOver = false;
    callOver = false;
  }
  else if (openOver(btnOpenX, btnOpenY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = true;
    alarmOver = false;
    callOver = false;
  }
  else if (alarmOver(btnAlarmX, btnAlarmY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = true;
    callOver = false;
  }
  else if (callOver(btnCallX, btnCallY, btnSize)){
    btn1Over = false;
    btn2Over = false;
    btn3Over = false;
    btn4Over = false;
    btn5Over = false;
    btn1ROver = false;
    btn2ROver = false;
    btn3ROver = false;
    btn4ROver = false;
    btn5ROver = false;
    closeOver = false;
    openOver = false;
    alarmOver = false;
    callOver = true;
  }
  else {
    btn1Over = btn2Over = btn3Over = btn4Over = btn5Over = btn1ROver = btn2ROver = btn3ROver = btn4ROver = btn5ROver = closeOver = openOver = alarmOver = callOver = false;
  }
}

public void mousePressed(){
  if(btn1Over){
    nextFloor = 5;
    btn1Neutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    whichWay();
    thread("doorClosing");
    thread("fifthFloor");
    thread("arrowsOff");
  }
  if(btn2Over){
    nextFloor = 4;
    btn2Neutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    whichWay();
    thread("doorClosing");
    thread("fourthFloor");
    thread("arrowsOff");
  }
  if(btn3Over){
    nextFloor = 3;
    btn3Neutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    whichWay();
    thread("doorClosing");
    thread("thirdFloor");
    thread("arrowsOff");
  }
  if(btn4Over){
    nextFloor = 2;
    btn4Neutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    whichWay();
    thread("doorClosing");
    thread("secondFloor");
    thread("arrowsOff");
  }
  if(btn5Over){
    nextFloor = 1;
    btn5Neutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    whichWay();
    thread("doorClosing");
    thread("firstFloor");
    thread("arrowsOff");
  }
  if(btn1ROver){
    nextFloor = 5;
    whichWay();
    btn1RNeutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    thread("doorClosing");
    thread("fifthRFloor");
    thread("arrowsOff");
  }
  if(btn2ROver){
    nextFloor = 4;
    whichWay();
    btn2RNeutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    thread("doorClosing");
    thread("fourthRFloor");
    thread("arrowsOff");

  }
  if(btn3ROver){
    nextFloor = 3;
    whichWay();
    btn3RNeutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    thread("doorClosing");
    thread("thirdRFloor");
    thread("arrowsOff");
  }
  if(btn4ROver){
    nextFloor = 2;
    whichWay();
    btn4RNeutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    thread("doorClosing");
    thread("secondRFloor");
    thread("arrowsOff");
  }
  if(btn5ROver){
    nextFloor = 1;
    whichWay();
    btn5RNeutral = color(0xffFFF181);
    closeSign = color(0xffAF1313);
    thread("doorClosing");
    thread("firstRFloor");
    thread("arrowsOff");
  }
  if(closeOver){
    closeNeutral = color(0xffAF1313);
    closeSign = color(0xffAF1313);
    thread("closeDoor");
  }
  if(openOver){
    openNeutral = color(255, 0 , 0);
    thread("openDoor");
  }
  if(alarmOver){
    alarmNeutral = color(255, 0 , 0 );
    thread("alarm");
  }
  if(callOver){
    callNeutral = color(255, 0 , 0); 
    thread("call");
  }
}

public boolean btn1Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn2Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn3Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn4Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn5Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn1ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn2ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn3ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn4ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean btn5ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean closeOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean openOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean alarmOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public boolean callOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

public void fifthFloor(){
  delay(2000);
  btn1Neutral = color(255);
  file1.play();
  currentFloor = 5;
  flr = '5';
  letter = ' ';
}

public void fourthFloor(){
  delay(2000);
  btn2Neutral = color(255);
  file2.play();
  currentFloor = 4;
  flr = '4';
  letter = ' ';
}

public void  thirdFloor(){
  delay(2000);
  btn3Neutral = color(255);
  file3.play();
  currentFloor = 3;
  flr = '3';
  letter = ' ';
}

public void secondFloor(){
  delay(2000);
  btn4Neutral = color(255);
  file4.play();
  currentFloor = 2;
  flr = '2';
  letter = ' ';
}

public void firstFloor(){
  delay(2000);
  btn5Neutral = color(255);
  file5.play();
  currentFloor = 1;
  flr = '1';
  letter = ' ';
}

public void fifthRFloor(){
  delay(2000);
  btn1RNeutral = color(255);
  file1.play();
  currentFloor = 5;
  flr =  '5';
  letter = 'R';
}

public void fourthRFloor(){
  delay(2000);
  btn2RNeutral = color(255);
  file2.play();
  currentFloor = 4;
  flr = '4';
  letter = 'R';
}

public void  thirdRFloor(){
  delay(2000);
  btn3RNeutral = color(255);
  file3.play();
  currentFloor = 3;
  flr = '3';
  letter = 'R';
}

public void secondRFloor(){
  delay(2000);
  btn4RNeutral = color(255);
  file4.play();
  currentFloor = 2;
  flr = '2';
  letter = 'R';
}

public void firstRFloor(){
  delay(2000);
  btn5RNeutral = color(255);
  file5.play();
  currentFloor = 1;
  flr = '1';
  letter = 'R';
}

public void openDoor(){
  delay(2000);
  openNeutral = color(255);
}

public void closeDoor(){
  delay(2000);
  closeNeutral = color(255);
  closeSign = color(0);
}

public void alarm(){
  delay(2000);
  alarmNeutral = color(255);
}

public void call(){
  delay(2000);
  callNeutral = color(255);
}

public void whichWay(){
  if (currentFloor < nextFloor){
    upArrow = color(0xffAF1313);
    line = color(0xffAF1313);
  }
  else if (currentFloor > nextFloor){
    downArrow = color(0xffAF1313);
    line = color(0xffAF1313);
  }
  else {
    line = color(0);
    downArrow = color(0);
    upArrow = color(0);
  }
}

public void arrowsOff(){
  delay(2005);
  downArrow = color(0);
  upArrow = color(0);
  line = color(0);
}

public void doorClosing(){
  delay(1000);
  closeSign = color(0);
}
  public void settings() {  size (400, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "HW1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
