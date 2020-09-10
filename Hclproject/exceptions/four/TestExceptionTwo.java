package com.exceptions.four;

public class TestExceptionTwo {
	public void divide(int div,int arr[]) {
		try {
			int i=0;
			while (i >= 0) {
				int res = arr[i] / div;
				System.out.println("Result :" + res);
				i++;
			}
		} catch (ArithmeticException e) {
			System.out.println("Can not divide by Zero");
		}

	}


}
