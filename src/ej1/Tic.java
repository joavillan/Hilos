package ej1;

public class Tic extends Thread{

	public void run() {
		while(true) {
			System.out.println("TIC");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println("Error");
			}
		}
	}
}
