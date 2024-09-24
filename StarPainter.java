import org.code.neighborhood.*;

public class StarPainter extends MuralPainter {


public void drawStar() {
  drawStarOutline();
}

  public void drawStarOutline(){
    
    for(int i=0; i<7; i++)
      {
        move();
      }
    paintLine("black", 2);
turnRight();
move();
paintLine("black", 2);
turnLeft();
move();
turnRight();
paintLine("black", 2);
turnLeft();
turnLeft();
move();
turnRight();
paintLine("black", 6);
turnRight();
move();
paintLine("black", 1);
turnRight();
move();
turnLeft();
paintLine("black", 1);
turnRight();
move();
paintLine("black", 1);
turnLeft();
move();
paintLine("black", 2);
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
paintLine("black", 2);
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
paintLine("black", 3);
turnLeft();
move();
move();
turnLeft();
    
  }
  
  
}