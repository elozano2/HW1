import processing.sound.*;

PFont f;
PImage img, img2, bg;
int btn1X = 87, btn1Y = 170, btn2X = 87, btn2Y = 270, btn3X = 87, btn3Y = 370, btn4X = 87, btn4Y = 470, btn5X = 87, btn5Y = 570;
int btn1RX = 313, btn1RY = 170, btn2RX = 313, btn2RY = 270, btn3RX = 313, btn3RY = 370, btn4RX = 313, btn4RY = 470, btn5RX = 313, btn5RY = 570;
int btnCloseX = 50, btnCloseY = 720, btnOpenX = 150, btnOpenY = 720, btnAlarmX = 250, btnAlarmY = 720, btnCallX = 350, btnCallY = 720;
int btnSize = 80;
int currentFloor = 1;
int nextFloor;
color btn1Neutral, btn2Neutral, btn3Neutral, btn4Neutral, btn5Neutral;
color btn1RNeutral, btn2RNeutral, btn3RNeutral, btn4RNeutral, btn5RNeutral;
color closeNeutral, openNeutral, alarmNeutral, callNeutral;
//color btn1On, btn2On, btn3On, btn4On, btn5On;
//color btn1ROn, btn2ROn, btn3ROn, btn4ROn, btn5ROn;
//color closeOn, openOn, alarmOn, callOn;
color btnHighlight;
color screen, background;
color upArrow, downArrow, line, floor;
char letter = 'R', flr = '1';
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

void setup(){
  size (400, 800);
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

void draw(){
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
  
  triangle(30, 720, 40, 730, 40, 710); 
  line(50, 700, 50, 735);
  triangle(70, 720, 60, 730,  60, 710);
  
  triangle(140, 720, 130, 730, 130, 710);
  line(150, 700, 150, 735);
  triangle(160, 720, 170, 730, 170, 710);
  
  textFont(f, 55);
  fill(#AF1313);
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
  
  fill(#AF1313);
  stroke(#AF1313);
  triangle(155, 75, 185, 55, 185, 95);
  triangle(125, 75, 95, 55, 95, 95);
  line(140, 50, 140, 100);
  
  image(img2, 335, 692);
  image(img, 228, 698);
}

void update(int x, int y){
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

void mousePressed(){
  if(btn1Over){
    nextFloor = 5;
    btn1Neutral = color(#FFF181);
    whichWay();
    thread("fifthFloor");
    thread("arrowsOff");
  }
  if(btn2Over){
    nextFloor = 4;
    btn2Neutral = color(#FFF181);
    whichWay();
    thread("fourthFloor");
    thread("arrowsOff");
  }
  if(btn3Over){
    nextFloor = 3;
    btn3Neutral = color(#FFF181);
    whichWay();
    thread("thirdFloor");
    thread("arrowsOff");
  }
  if(btn4Over){
    nextFloor = 2;
    btn4Neutral = color(#FFF181);
    whichWay();
    thread("secondFloor");
    thread("arrowsOff");
  }
  if(btn5Over){
    nextFloor = 1;
    btn5Neutral = color(#FFF181);
    whichWay();
    thread("firstFloor");
    thread("arrowsOff");
  }
  if(btn1ROver){
    btn1RNeutral = color(#FFF181);
    thread("fifthRFloor");
  }
  if(btn2ROver){
    btn2RNeutral = color(#FFF181);
    thread("fourthRFloor");

  }
  if(btn3ROver){
    btn3RNeutral = color(#FFF181);
    thread("thirdRFloor");
  }
  if(btn4ROver){
    btn4RNeutral = color(#FFF181);
    thread("secondRFloor");
  }
  if(btn5ROver){
    btn5RNeutral = color(#FFF181);
    thread("firstRFloor");
  }
  if(closeOver){
    closeNeutral = color(255, 0 ,0);
  }
  if(openOver){
    openNeutral = color(255, 0 , 0);
  }
  if(alarmOver){
    alarmNeutral = color(255, 0 , 0 );
  }
  if(callOver){
    callNeutral = color(255, 0 , 0); 
  }
}

boolean btn1Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn2Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn3Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn4Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn5Over(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn1ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn2ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn3ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn4ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean btn5ROver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean closeOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean openOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean alarmOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

boolean callOver(int x, int y, int diameter){
  float distX = x - mouseX;
  float distY = y - mouseY;
  if(sqrt(sq(distX) + sq(distY)) < diameter/2){
    return true;
  }
  else{
    return false;
  }
}

void fifthFloor(){
  delay(2000);
  btn1Neutral = color(255);
  file1.play();
  currentFloor = 5;
}

void fourthFloor(){
  delay(2000);
  btn2Neutral = color(255);
  file2.play();
  currentFloor = 4;
}

void  thirdFloor(){
  delay(2000);
  btn3Neutral = color(255);
  file3.play();
  currentFloor = 3;
}

void secondFloor(){
  delay(2000);
  btn4Neutral = color(255);
  file4.play();
  currentFloor = 2;
}

void firstFloor(){
  delay(2000);
  btn5Neutral = color(255);
  file5.play();
  currentFloor = 1;
}

void fifthRFloor(){
  delay(2000);
  btn1RNeutral = color(255);
  file1.play();
}

void fourthRFloor(){
  delay(2000);
  btn2RNeutral = color(255);
  file2.play();
}

void  thirdRFloor(){
  delay(2000);
  btn3RNeutral = color(255);
  file3.play();
}

void secondRFloor(){
  delay(2000);
  btn4RNeutral = color(255);
  file4.play();
}

void firstRFloor(){
  delay(2000);
  btn5RNeutral = color(255);
  file5.play();
}

void whichWay(){
  if (currentFloor < nextFloor){
    upArrow = color(#AF1313);
    line = color(#AF1313);
  }
  else if (currentFloor > nextFloor){
    downArrow = color(#AF1313);
    line = color(#AF1313);
  }
  else {
    line = color(0);
    downArrow = color(0);
    upArrow = color(0);
  }
}

void arrowsOff(){
  delay(2000);
  downArrow = color(0);
  upArrow = color(0);
  line = color(0);
}
