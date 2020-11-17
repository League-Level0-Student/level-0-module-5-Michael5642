
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(800,470);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {

        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/  
       int xizzle = 400;
       int yizzle = 235;
       int wizzle = 10;
       int lizzle = 10;
       int xizzle2 = 200;
       int yizzle2 = 235;
       int wizzle2 = 10;
       int lizzle2 = 10;
       
        int speed = 10;
for(int i = 0; i < 10; i = i + 1) {
  for(int i2 = 0; i2 < 27; i2++){
        ellipse(xizzle,yizzle,wizzle,lizzle);
        wizzle = wizzle + 15;
        lizzle = lizzle + 15;
        }
        for(int i3 = 0; i3 < 27; i3++){
        ellipse(xizzle2,yizzle2,wizzle2,lizzle2);
        wizzle2 = wizzle2 + 15;
        lizzle2 = lizzle2 + 15;
        }
        xizzle = xizzle + speed;
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
        
}
