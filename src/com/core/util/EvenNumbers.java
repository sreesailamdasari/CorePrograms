package com.core.util;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// System.out.println(a.length);
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] % 2 == 0) {//even
				list.add(a[i]);
			}
//			else
//				list1.add(a[i]);
		}
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] % 2 == 1) {//odd
				list.add(a[i]);
			}
		}
		int[] b = list.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(b));
//		System.out.println(list+"--"+list1);
	}
}
