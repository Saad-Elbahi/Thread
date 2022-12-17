package thread5;

public class CalculCarre extends Thread {
	private Nombre Nombre;

	public CalculCarre(Nombre Nombre) {
		this.Nombre = Nombre;
	}

	public void run() {
		while (!isInterrupted()) {
			this.Nombre.calculerCarre();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				interrupt();
			}
		}
	}

}
