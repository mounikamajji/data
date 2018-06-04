package com.cg.corejava.exceptions;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kids k = new Kids();
		Adults ad = new Adults();
		System.out.println("say yes or no");
		Scanner Sc = new Scanner(System.in);
		boolean b = Sc.nextBoolean();
		System.out.println("enter the type kid or adult");
		
		String option = Sc.next();
		
		
		switch(option){
		case "Kids" :
			System.out.println("enter the age");
			k.age = Sc.nextInt();
			k.registerAccount();
			k.booktype = Sc.next();
			System.out.println("enter the bookname");
			String book = Sc.next();
			k.requestBook();
		case "Adults" :
			System.out.println("enter the age");
			ad.age = Sc.nextInt();
			ad.registerAccount();
			System.out.println("enter the bookname");
			ad.booktype = Sc.next();
			ad.requestBook();
		}
		
		
		

	}

}
