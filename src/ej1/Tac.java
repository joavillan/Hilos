package ej1;

public class Tac extends Thread{

	public void run() {
		while(true) {
			System.out.println("TAC");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println("Error");
			}
		}
	}
}
