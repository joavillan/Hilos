package filosofos;

public class Tenedor {

	private boolean ocupado = false;
	
	public Tenedor(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public boolean cogerTenedor() {
		ocupado = true;
		return ocupado;
	}
	
	public boolean soltarTenedor() {
		ocupado = false;
		return ocupado;
	}
	
}
