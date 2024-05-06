// import static org.junit.jupiter.api.Assertions.assertEquals;
import doodlepad.*;
import java.awt.Color;
// import org.junit.jupiter.api.Test;

public class MySecondDoodle {
  public static void main(String[] args) {
    Color myField = new Color(4, 167, 49); // Color green
    Color rouge = new Color(238,32,76);
    Color blu = new Color(1,191,255);
    Color infield = new Color(234, 157, 95);
    
    Pad p1 = new Pad("Baseball", 500, 500, myField);    
    //Rectangle r1 = new Rectangle(x, y, w, h);
    //Rectangle r1 = new Rectangle(50, 60, 70, 40);
    RoundRect r2 = new RoundRect(50,20,70,30,20,20);
    r2.setFillColor(rouge);
    Oval inf = new Oval(172, 94, 25, 25);  //infield home plate
    inf.setFillColor(infield);
    RoundRect r3 = new RoundRect(250,20,70,30,20,20);
    r3.setFillColor(blu);

    //Oval o1 = new Oval(x, y, w, h);
    //Oval o1 = new Oval(150, 60, 70, 40);
    //RoundRect rr1 = new RoundRect(x, y, w, h, arcWidth, arcHeight);
    //RoundRect rr1 = new RoundRect(250, 60, 70, 40, 20, 20);
    //Create Arc start at 45 degrees and extending for 90 degrees
    //Arcs are drawn from 0' on the X axis (like 3 o'clock)
    // the arc angle (in degrees) is from x axis then CCW
    //Arc a1 = new Arc(x, y, w, h, startAngle, arcAngleCCW);
    Arc a1 = new Arc(60, -20, 250, 250, 225, 90);
    //default arc is filled (Baseball Diamond in this case)
    Arc a2 = new Arc(60, -17, 250, 250, 225, 90);
    a2.setFilled(false);
    // Do not fill the arc so only the arc is drawn.
    // Create a diagonal Line shape from (100, 100) and (200, 200)
    //Line l1 = new Line(100, 100, 200, 200);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
