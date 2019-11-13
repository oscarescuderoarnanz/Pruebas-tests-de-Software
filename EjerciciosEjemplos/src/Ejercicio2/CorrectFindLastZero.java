package Ejercicio2;
//Corregimos el codigo tras haber detectado un error en la implementacion
public class CorrectFindLastZero {
	 /**
	 * Find LAST index of zero
	 *
	 * @param x array to search
	 * @return index of last 0 in x; -1 if absent
	 * @throws NullPointerException if x is null
	 */
	 public static int lastZero (int[] x){
		 int a = -1;
		 
		 for (int i = 0; i < x.length; i++){
			 if (x[i] == 0){
				 a = i;
			 }
		 }
		 return a;
	 }
}
