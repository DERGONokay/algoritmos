package main;

import ordenamiento.SelectionSort;
import util.ArrayUtil;

public class Main {
	public static void main(String[] args) {
		int[] arr = {8,3,1,2,4,9,5,7,0};
		
		System.out.println(ArrayUtil.toString(arr));
//		Swap.swap(arr, 0, 9);
		SelectionSort.selectionSort(arr);
		System.out.println(ArrayUtil.toString(arr));
	}
}
