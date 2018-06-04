package com.cg.corejava.exceptions;

public class JavaPub {
	public static void validdateCustomerAge(int age) throws InvalidAgeException {
		if (age >= 25){
			System.out.println("welcome you");
		}else{
			throw new InvalidAgeException("age >= 25");
	}
}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
			try {
				validdateCustomerAge(21);
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
}
}
