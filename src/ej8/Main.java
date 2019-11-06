package ej8;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Saldo sal = new Saldo(10);
		Suma s1 = new Suma(15, "Pepe0", sal);
		Suma s2 = new Suma(20, "Pepe1", sal);
		Suma s3 = new Suma(150, "Pepe2", sal);
		
		s1.start();
		s2.start();
		s3.start();
		
		System.out.println(sal.getSaldo());
	}

}
