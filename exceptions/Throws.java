package com.cg.corejava.exceptions;

import java.util.Scanner;

public class Throws {
	public static void dosomething(int a, int b){
		if (b != 0){
			System.out.println(a/b);
		}else{
			throw new ArithmeticException(" do properly");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dosomething(5 ,0);


		                                                                            

	}

}
