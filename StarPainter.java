import org.code.neighborhood.*;

public class StarPainter extends MuralPainter {

// initiate star drawing process
public void drawStar() {
  drawStarOutline();
}
// method to draw star outline
  public void drawStarOutline(){
    // move forward 7 times to start star shape
    for(int i=0; i<7; i++)
      {
        move(); // move forward
      }
    // draw points of the star
    paintLine("black", 2); //first line
    // 2nd line
turnRight();
move();
paintLine("black", 2);
    // 3rd line
turnLeft();
move();
turnRight();
paintLine("black", 2);
    // prepare for next line
turnLeft();
turnLeft();
move();
    // long line
turnRight();
paintLine("black", 6);
    // short line
turnRight();
move();
paintLine("black", 1);
    //next line
turnRight();
move();
turnLeft();
paintLine("black", 1);
    // another line
turnRight();
move();
paintLine("black", 1);
    // longer line
turnLeft();
move();
paintLine("black", 2);

  // continue drawing the star shape
turnLeft();
move();
turnRight();
paintLine("black", 2);
turnLeft();
move();
turnRight();
paintLine("black", 2);
turnLeft();
move();
turnRight();
paintLine("black", 2);
turnRight();
paintLine("black", 3);
turnRight();
move();
turnLeft();
paintLine("black", 2);
turnRight();
move();
turnLeft();
paintLine("black", 2);
turnRight();
move();
turnLeft();
paintLine("black", 2);
    // final adjustments to complete the star
turnLeft();
move();
turnRight();
paintLine("black", 2);
turnLeft();
move();
turnRight();
paintLine("black", 2);
turnLeft();
move();
turnRight();
paintLine("black", 3);
turnRight();
move();
paintLine("black", 1);
turnRight();
move();
turnLeft();
paintLine("black", 2);
turnRight();
move();
turnLeft();
paintLine("black", 2);
turnRight();
move();
turnLeft();
paintLine("black", 2);
turnRight();
move();
// move to finish shape
turnLeft();
turnLeft();
move();
move();
paintLine("black", 1);
turnRight();
move();
paintLine("black", 1);
turnLeft();
move();
paintLine("black", 1);
turnRight();
move();
turnRight();
paintLine("black", 5);
turnRight();
move();
turnRight();
turnRight();
move();
paintLine("black", 2); // complete drawing
turnRight();
move();
turnLeft();
paintLine("black", 2);
turnRight();
turnRight();
move();
move(); 
move();
move();
move();
move();
paintLine("black", 3); // complete star
turnLeft();
move();
move();
turnLeft();
    
  }
  
  
}