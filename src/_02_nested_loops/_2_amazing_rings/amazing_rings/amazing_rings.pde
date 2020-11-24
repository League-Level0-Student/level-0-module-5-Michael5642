
  /*** Go to the recipe to run the demonstration before starting this program ***/
int xizzle = 600;
       int xizzle2 = 200;
       int xizzle3 = 600;
       int xizzle4 = 200;
        int speed = 5;
        int direction = 1;
        int direction2 = 1;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(800,470);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
  
}

void draw() {
background(200,200,200);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/  
       

 
        for(int i = 0; i < 27; i++){
        ellipse(xizzle,235,300-i*20,300-i*20);
        ellipse(xizzle3,235,300-i*20,300-i*20);
        ellipse(xizzle2,235,300-i*20,300-i*20);
        ellipse(xizzle4,235,300-i*20,300-i*20);
        
        }
       
       xizzle = xizzle - speed*direction;
        xizzle2 = xizzle2 + speed*direction;
       xizzle3 = xizzle3 + speed*direction2;
       xizzle4 = xizzle4 - speed*direction2;
        if(xizzle < 0 || xizzle > width){
          direction = direction*-1;
        }
     if(xizzle3 < 0 || xizzle3 > width){
     direction2 = direction*-1;
     }
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
        
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */

         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
}
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
