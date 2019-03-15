package ordenamiento;

import util.Swap;

public class SelectionSort {
	
	/**
	 * Ordena un arreglo de menor a mayor utilizando el algoritmo de Selection sort
	 * 
	 * @param arr Arreglo a ordenar
	 */
	public static void selectionSort(int[] arr) {
		int menor;
		System.out.println("Comienza sort");
		for(int i = 0; i < arr.length - 1; i++) {
			menor = i;
			for(int k = i + 1; k < arr.length; k++) {
				if(arr[k] < arr[menor]) {
					menor = k;
				}
			}
			Swap.swap(arr, i, menor);
		}
	}
}
