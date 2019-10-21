package ej4;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Libreria a1 = new Libreria();
		MyHilo mh = new MyHilo();
		
		String a = "a";
		
		mh.start();
		
		do {
			a = a1.excepcionstringcontexto("Introduce Suspender(S), Reanudar(R) o * para finalizar");
			if(a.equalsIgnoreCase("s")) {
				mh.Suspende();
			}else if(a.equalsIgnoreCase("r")) {
				mh.Reanuda();
			}
		} while (!a.equalsIgnoreCase("*"));
		
		mh.Finalizar();
	}

}
