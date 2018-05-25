/**
 * 
 */
package com.core.ds.sorting;

/**
 * @author sreesdas
 *
 *         The selection sort algorithm sorts an array by repeatedly finding the
 *         minimum element (considering ascending order) from unsorted part and
 *         putting it at the beginning. The algorithm maintains two subarrays in
 *         a given array.
 * 
 *         1) The subarray which is already sorted. 2) Remaining subarray which
 *         is unsorted.
 * 
 *         In every iteration of selection sort, the minimum element
 *         (considering ascending order) from the unsorted subarray is picked
 *         and moved to the sorted subarray.
 */
public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		ss.sort(arr);
		ss.print(arr);
	}

	private void print(int[] arr) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// find minimum element in unsorted array
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min_index])
					min_index = j;
			// swap the min element in first place
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
}
