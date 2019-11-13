package Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindLastIndexCorrect {

	// Si el elemento a buscar es el primer elemento de nuestro array
	// el programa no funcionara correctamente y nos dara un error
	// Tras corregir nuestro codigo volvemos a probar y vemos como pasamos
	// el test correctamente sin ningun error.
	@Test public void TestFindLastIndex3(){
		int z1[] = {1,2,3,4,-1,0};
		int y = 1;
		assertEquals("Posicion del numero introducido(1): 0", 0, FindLastIndexCorrect.findLast(z1, y));
   }

}
