package Ejercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindLastZeroCorrect {
	// Arreglamos el codigo de java y realizamos un nuevo test
	// en el que podemos ver que funciona todo correctamente.
	@Test public void FindLastZeroTest3(){
		int y3[] =  {1,2,3,4,-1,0,5,0};
		assertEquals("Posicion del ultimo cero (7) con codigo corregido", 7, CorrectFindLastZero.lastZero(y3));
   }

}
