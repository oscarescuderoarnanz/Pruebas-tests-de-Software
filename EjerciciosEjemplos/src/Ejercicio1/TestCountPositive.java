package Ejercicio1;

import static org.junit.Assert.*;
import org.junit.*;

public class TestCountPositive{
	// Teniendo en cuenta el 0 como numero entero este programa no posee ningun
	// fallo. 
	@Test public void zeroFirstElement(){
	  int x[] =  {1,2,3,4,-1,0,5,0};
      assertEquals("Numero de enteros positivos (7)", 7, countPositive.countPositives(x));
   }
	// Si no tenemos el 0 en cuenta como numero entero entonces tenemos un error
	// el cual nos va a dar como erroneo el test
	@Test public void zeroFirstElement2(){
	  int x[] =  {1,2,3,4,-1,0,5,0};
      assertEquals("Numero de enteros positivos (5)", 5, countPositive.countPositives(x));
	}
	// Para corregir este error bastaria con modificar nuestro codigo de la siguiente manera:
	//  En lugar de -> if (x[i] >= 0), poner if (x[i] > 0)
	// De esta forma nuestro codigo quedaria arreglado
}