package Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindLastIndex {
	// Si el elemento a buscar no es el primer elemento de nuestro array
	// el programa funcionara correctamente y no detectaremos ningun error
	@Test public void TestFindLastIndex1(){
		int z1[] = {1,2,3,4,-1,0};
		int y = 2;
		assertEquals("Posicion del numero introducido(2): 1", 1, FindLastIndex.findLast(z1, y));
   }

	// Si el elemento a buscar es el primer elemento de nuestro array
	// el programa no funcionara correctamente y nos dara un error
	@Test public void TestFindLastIndex2(){
		int z1[] = {1,2,3,4,-1,0};
		int y = 1;
		assertEquals("Posicion del numero introducido(1): 0", 0, FindLastIndex.findLast(z1, y));
   }
}
		