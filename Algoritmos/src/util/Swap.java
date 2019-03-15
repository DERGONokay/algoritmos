package util;

public class Swap <T>{
	
	public static void swap(int[] arr, int pos1, int pos2) {
		int aux = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = aux;
	}
}
