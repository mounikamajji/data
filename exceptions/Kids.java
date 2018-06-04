package com.cg.corejava.exceptions;

public class Kids implements Library {
	int age;
	String booktype;
	public void registerAccount(){
		if(age>0 && age<12){
			System.out.println("you have successfully registered under kids account");
		}else{
			System.out.println("sorry age must be less than 12 years to register as a kid");
		}
	
	}
	public void requestBook(){
		if (booktype.equals("kids")){
			System.out.println("a message displaying “Book Issued successfully, please return the book within 10 days”");
		}
		else{
			System.out.println("“Oops, you are allowed to take only kids books”");
		}
	}
	

}
