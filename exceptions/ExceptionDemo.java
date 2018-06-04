package com.cg.corejava.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
	int dosum(int a, int b){
		return a+b;
	}
	int dosub(int a, int b){
		return a-b;
	}
	int doDivision(int a, int b){
		return a/b;
	}

	public static void main(String[] args) {
		int x,y;
		String name;
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			name = br.readLine();
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println(ie);
		}System.out.println("ho jayega");

	}

}
