package com.exceptions.three;

public class TestException {

	public void divide(int arr[]) {
		try {
			int i = 0, j = 10;
			while (i >= 0) {
				int res = arr[i] / j;
				System.out.println("Result :" + res);
				i++;
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Elements Over");
		}

	}
}
