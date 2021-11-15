import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tdd.Persona;

/**
 *
 * @author erikj
 */
public class PruebaTdd {   
    public PruebaTdd() {
    }
    Persona integrante = new Persona();
    //Test correctos
   @Test
    public void testSomething() {
        assertEquals("Alumno", integrante.Integrante(2,"al010000"));
}
  @Test
    public void testSomething1() {
        assertEquals("Alumno", integrante.Integrante(2,"al010001"));
}
      @Test
    public void testSomething2() {
        assertEquals("Maestro", integrante.Integrante(1,"1000"));
}
  @Test
    public void testSomething3() {
        assertEquals("Maestro", integrante.Integrante(1,"1001"));
}
//Test Erroneos
      @Test//Maestro
    public void testSomethin4() {
        assertEquals("ERROR01", integrante.Integrante(1,"10000"));
}
      @Test//Maestro
    public void testSomething5() {
         assertEquals("ERROR01", integrante.Integrante(1,"20000"));
}
      @Test//Alumno
    public void testSomething6() {
        assertEquals("ERROR02", integrante.Integrante(2,"010000"));
}
      @Test//Alumno
    public void testSomething7() {
        assertEquals("ERROR02", integrante.Integrante(2,"ax10000"));
}

}



