package ej6;

public class HiloPrioridad2 extends Thread {

	public HiloPrioridad2(String nom) {
		this.setName(nom);
	}
	
	public void run() {
		System.out.println("Ejecutando [" +getName() + "]");
		for (int i = 0; i < 5; i++) {
			System.out.println("\t("+getName()+": "+i+")");
		}
	}
}
