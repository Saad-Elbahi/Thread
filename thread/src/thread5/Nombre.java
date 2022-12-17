package thread5;

public class Nombre {
	private int nombre;
	private double nCarre = 1;

	public synchronized void calculerCarre() {
		this.nombre++;
		this.nCarre = Math.pow(this.nombre, 2);
	}

	public synchronized void afficher() {
		System.out.println("carre de : " + nombre + " est : " + this.nCarre);
	}

}
