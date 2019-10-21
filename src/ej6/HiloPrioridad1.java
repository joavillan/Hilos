package ej6;

public class HiloPrioridad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HP1 h1 = new HP1("Hilo 1");
		HP1 h2 = new HP1("Hilo 2");
		HP1 h3 = new HP1("Hilo 3");
		
		h1.setPriority(Thread.MAX_PRIORITY);
		h2.setPriority(Thread.NORM_PRIORITY);
		h3.setPriority(Thread.MIN_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		h1.pararHilo();
		h2.pararHilo();
		h3.pararHilo();
		
		System.out.println("h2 (Prioridad Normal) : "+h2.getContador());
		System.out.println("h1 (Prioridad Maxima) : "+h1.getContador());
		System.out.println("h3 (Prioridad Minima) : "+h3.getContador());
	}

}
