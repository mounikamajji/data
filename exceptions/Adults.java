package com.cg.corejava.exceptions;

public class Adults implements Library {
	int age;
	String booktype;
	boolean b = TRUE;
	public void registerAccount(){
		if(age>12){
			System.out.println("You have successfully registered under an Adult Account");
		}else{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	
	}
	public void requestBook(){
		if (booktype.equals("Fiction")){
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else{
			System.out.println("Oops, you are allowed to take only adult fiction books");
		}

}}
