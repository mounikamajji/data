package com.cg.corejava.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));
		try {
			int a  = Integer.parseInt(br.readLine());
			int b =  Integer.parseInt(br.readLine());
			System.out.println(a/b);
			
		}catch (IOException ie){
			System.out.println(ie);
		}catch (ArithmeticException ae){
			ae.printStackTrace();
		}
		finally {
			
		}

	}

}
