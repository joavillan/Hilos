package ej2;

public class Tic implements Runnable{

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
