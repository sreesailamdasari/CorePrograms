package com.core.util;

import java.util.ArrayList;
import java.util.List;

//when we are writing mindless code then only we will get OutOfMemoryError
public class OutOfMemoryError {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		do {
			list.add("a");
		} while (true);
	}
}