package util;

public class ArrayUtil {
	
	/**
	 * Crea un String con los elementos de un arreglo en formato [1,2,..,n]
	 * @param arr El arreglo a convertir en string
	 * @return String con todos los elementos de un arreglo 
	 */
	public static String toString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < arr.length - 1; i++) {
			sb.append(arr[i] + ",");
		}
		sb.append(arr[arr.length-1] + "]");
		return sb.toString();
	}
}
