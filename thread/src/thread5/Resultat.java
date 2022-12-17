package thread5;

public class Resultat extends Thread{
	  private Nombre Nombre;

	    public Resultat(Nombre Nombre) {
	        this.Nombre = Nombre;
	    }

	    public void run() {
	        while (!isInterrupted()) {
	            this.Nombre.afficher();
	            try {
	                sleep(500);
	            } catch (InterruptedException e) {
	                interrupt();
	            }
	        }
	    }

}
