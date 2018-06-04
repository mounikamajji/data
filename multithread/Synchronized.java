package com.cg.corejava.multithread;

public class Synchronized implements Runnable {
	int wanted;
	int available = 1;
	Synchronized(int wanted){
		this.wanted = wanted;
	}
	synchronized public void run() {
		String name = Thread.currentThread().getName();
		if (available >= wanted) {
			System.out.println(wanted+" "+"berths alloted to "+" "+name);
			available-=wanted;
		}else {
			System.out.println("not available");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronized sc = new Synchronized(1);
		Thread t = new Thread(sc);
		t.setName("gorge");
		t.start();
		Thread t1 = new Thread(sc);
		t1.setName("john");
		t1.start();

	}

}
