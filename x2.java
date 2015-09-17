//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; 9/16/15?)

//////// Alexander Reid 9/16/15
String author=  "Whoever Whatever";
String title=  " ??? ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;
float sunX, sunY; //Sun variable.
//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
sunX= width*3/4;
sunY= height/8;

}

//// NEXT FRAME:  scene, action, show.
void draw() {
  
  scene();
  background( 170, 236, 255 );                // sky
  fill( 252, 240, 166);
 
  ellipse( sunX, sunY, 55, 55 );    // sun
  
  sunX= (sunX + 1) % (width+100);  //sun speed + position
  sunY =(sunY + .15) % horizon;
  
  fill( 100, 200, 100 );
  rect( 0, horizon, width, height*3/4 );      // grass.

  fill(144, 87, 173); 
  rect(300, 60, 60, 60 ); //house
  fill(165, 115, 53); 
  rect(323, horizon-30, 15, 30); //house door
  fill(165, 115, 53);
  triangle(300, 60, 330, 30, 360, 60 ); //house roof 
  fill(255);
  rect( 305, 69, 15, 15);  //tree trunk
  rect( 339, 69, 15, 15);  //tree trunk2
  fill( 100, 200, 100 );
  triangle( 130,80, 160, horizon-100, 190, 80  ); //tree
  fill( 100, 200, 100 ); 
  triangle( 130,60, 160, horizon-100, 190, 60  ); //tree2
  fill( 150, 50, 0); 
  rect( 153, horizon-40, 13, 40);

  fill(0);
 
  hero();
  
  ellipseMode(CENTER);
  fill(219, 143, 49);
  ellipse( x+12.5, y-12, 25, 25); //Aoi's head
  fill(116, 78, 96); 
  rect( x, y, 25, 40 );   //Aoi's body   
  rect(x-7, y+1, 7, 20); //Aoi's arm left
  rect(x+25, y+1, 7, 20); //Aoi's arm right
  fill(0);
  ellipse(x+6, y-13, 7, 7); //Aoi's glasses L
  ellipse(x+19, y-13, 7, 7); //Aoi's glasses R
  line(x+6, y-13, x+19, y-13); //Aoi's glasses frame
  fill(255);
  arc(x+12.5, y-6, 10, 10, 0, PI); //His mouth
  text( "Bry", x+3, y+24 ); //His name!
  dog();
  messages();
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
  /* INSERT YOUR CODE HERE! */    background( 200,255,255 );
  fill(0);
  /* REPLACE THIS STUB! */  text( "scene", 100, 100 );
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  x=  x + dx;
  y=  y + dy;  text( "[[[[ Bry. ]]]]", 200, 200 );
  

}
void dog() {
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 150,0,0 );
  ellipse (dogX+15, dogY+12,7,20); //dogleg 4 
  ellipse (dogX-12, dogY+12,7,20); //dogleg 2
  fill( 150,0,0 );
  ellipse(dogX,dogY, 50,25 ); //dog body
  ellipse (dogX-22, dogY+12,7,20); //dogleg 1
  ellipse (dogX+5, dogY+12,7,20); //dogleg 3
  ellipse (dogX+20, dogY-5, 25, 20);
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!d!!", 150, 150 );
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
   
   

