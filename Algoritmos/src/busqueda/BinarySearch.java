package busqueda;

public class BinarySearch {
	/**
	 * Devuelve la posicion de un elemento dentro de un arreglo utilizando el algoritmo de busqueda binaria
	 * 
	 * @param arr Arreglo donde buscar el elemento
	 * @param n Elemento a buscar
	 * @return Integer la posicion del elemento dentro del array
	 * @return Null si el elemento no fue encontrado dentro del array
	 */
	public static Integer binarySearch(int[] arr, int n) {
		boolean encontrado = false;
		int pivot, min, max, element;
		Integer ret = null;
		min = 0;
		max = arr.length;
		pivot = arr.length / 2;
		
		while(!encontrado) {
			element = arr[pivot];
			if(element == n) {
				encontrado = true;
				ret = pivot;
				break;
			}
			
			if(pivot <= 0 || pivot >= arr.length - 1) {
				break;
			}
			
			if(n < pivot) {
				max = pivot;
				pivot = pivot /2;
			} else {
				min = pivot;
				pivot = pivot + ((max - min) /2);
			}
		}
		
		return ret;
	}
}
