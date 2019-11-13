package Ejercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountoddOrPos {
	// Este codigo no tiene ningun error ni fallo de programacion
	// Cuenta correctament los numeros impares y enteros positivos
	@Test public void TestCountoddOrPos1(){
		int x[] = {1,2,3,4,-1,3,2,2,0,0,-5};
		assertEquals("Numero de numeros impares o positivos", 7, CountoddOrPos.oddOrPos(x));
   }
}
