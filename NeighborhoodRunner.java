import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
   
// instantiates MuralPainter
MuralPainter Jan = new MuralPainter();
    // painter paints background white
    Jan.paintBackground("white", 16);  
    
// instantiates StarPainter
StarPainter Star = new StarPainter();
    // Painter draws star
  Star.drawStar();
    
  }
}