package Ejercicio1;

import static org.junit.Assert.*;
import org.junit.*;

public class TestCountPositiveCorrect{
	// Probamos de nuevo nuestro programa corregido
	@Test public void zeroFirstElement3(){
	  int x[] =  {1,2,3,4,-1,0,5,0};
      assertEquals("Numero de enteros positivos con codigo corregido", 5, CorrectCountPositive.countPositives(x));
	}
}