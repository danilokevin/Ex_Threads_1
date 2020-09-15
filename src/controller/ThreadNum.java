package controller;

public class ThreadNum extends Thread {
	
	@Override
	public void run() {
		System.out.println("Id # " + getId());
	}

}
