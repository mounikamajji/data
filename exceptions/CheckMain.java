package com.cg.corejava.exceptions;

public class CheckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c = new Check();
		int result = 0;
		try {
			c.a = 4;
			c.b = 2;
			 result = c.division();
		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}finally {
			System.out.println("result is"+result);
		}

	}

}
