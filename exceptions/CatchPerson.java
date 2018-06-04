package com.cg.corejava.exceptions;

public class CatchPerson {
	public static void getPension(int age, double salary) throws InvalidAgeException2{
		if (age >= 60){
			double pension = (salary * 30)/100;
			System.out.println(pension);
		}else {
			throw new InvalidAgeException2("age >= 60");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getPension(90
					
					
					, 12000);
		} catch (InvalidAgeException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
