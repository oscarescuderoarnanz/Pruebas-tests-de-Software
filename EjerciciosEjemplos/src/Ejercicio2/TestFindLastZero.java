package Ejercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindLastZero{
	// Como solo tenemos un 0 en nuestro array nos va a dar la posicion del 0 en la posicion 0
	// por tanto no detectamos error.
	@Test public void FindLastZeroTest1(){
		int y1[] =  {0,1,2,3,4,-1};
		assertEquals("Posicion del ultimo cero(0)", 0, FindlastZero.lastZero(y1));
   }
	// Si introducimos mas de un 0 en nuestros datos veremos que tenemos un error en el codigo
	// En este test si apreciamos el fallo pues nos devuelve la posicion del primer cero, 
	// y nos tendria que devolver la posicion del ultimo cero.
	@Test public void FindLastZeroTest2(){
		int y2[] =  {1,2,3,4,-1,0,5,0};
		assertEquals("Posicion del ultimo cero (7) y coge la 5", 0, FindlastZero.lastZero(y2));
   }
}