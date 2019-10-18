package ej1;

public class UsaHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tic tic = new Tic();
		Tac tac = new Tac();
		
		tic.start();
		tac.start();
	}

}
