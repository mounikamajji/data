package com.cg.corejava.multithread;

public class Thread1 implements Runnable {
	 

	public void run() {
		String name = "Humanity" ;
		System.out.println(Thread.currentThread().getName());
		for (int i=1; i<=4 ; i++){
			
			System.out.println(name);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.setName("beautiful");
		System.out.println(Thread.currentThread().getName());
		t.start();
	}

	
	}

	


