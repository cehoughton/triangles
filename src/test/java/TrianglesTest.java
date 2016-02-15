import org.junit.*;
import static org.junit.Assert.*;

public class TrianglesTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangles testTriangles = new Triangles ( 1, 1, 1 );
    assertEquals(true, testTriangles instanceof Triangles);
  }

  @Test
  public void newTriangles_getSideOne() {
    Triangles testTriangles = new Triangles( 1, 1, 1 );
    assertEquals(1, testTriangles.getSideOne());
  }

  @Test
  public void newTriangles_getSideTwo() {
    Triangles testTriangles = new Triangles( 1, 1, 1);
    assertEquals(1, testTriangles.getSideOne());
  }

  @Test
  public void newTriangles_getSideThree() {
   Triangles testTriangles = new Triangles( 1, 1, 1);
   assertEquals(1, testTriangles.getSideThree());
 }

 @Test
 public void newTriangles_isEqualateral() {
   Triangles testTriangles = new Triangles ( 1, 1, 1 );
   assertEquals(true, testTriangles.isEqualateral());
 }

 @Test
 public void newTriangle_isIsosceles() {
   Triangles testTriangles = new Triangles ( 1, 2, 2 );
   assertEquals(true, testTriangles.isIsoceles());
 }

 @Test
 public void newTriangles_isScalene() {
   Triangles testTriangles = new Triangles(1, 2, 3);
   assertEquals(true, testTriangles.isScalene());
 }

 @Test
 public void newTriangles_isNotTriangle() {
   Triangles testTriangles = new Triangles( 2, 2, 8);
   assertEquals(true, testTriangles.isNotTriangle());
 }
}
