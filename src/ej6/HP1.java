package ej6;

public class HP1 extends Thread {

	private int c = 0;
	private boolean stopHilo = false;
	
	public HP1(String nombre) {
		
	}
	
	public int getContador() {
		return c;
	}
	public void pararHilo() {
		stopHilo = true;
	}
	public void run() {
		while(!stopHilo) {
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				// TODO: handle exception
			}
			c++;
		}
		System.out.println("Fin hilo  "+this.getName());
	}
}
