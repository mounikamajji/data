package com.cg.corejava.multithread;

public class MyOwnThread implements Runnable{
	public void run() {
		for (int i =1;i<=10;i++){
			System.out.println(i);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOwnThread mt = new MyOwnThread();
		Thread t = new Thread(mt);
		t.start();

	}

}
