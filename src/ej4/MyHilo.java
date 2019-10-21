package ej4;

public class MyHilo extends Thread {

	private SolicitaSuspender suspender = new SolicitaSuspender();
	
	public int contador = 0;
	private boolean stop = false;
	
	public void Suspende() {
		suspender.set(true);
	}
	
	public void Reanuda() {
		suspender.set(false);
	}
	
	public void Finalizar() {
		this.stop = true;
	}
	
	public void run() {
		try {
			while (!stop) {
				contador++;
				suspender.esperandoParaReanudar();
				sleep(600);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("contador: "+contador);
	}
}
