package thread;

public class Thread4 extends Thread {
	 private long duree;
	    public Thread4(String nom, long duree) {
	        this.setName(nom);
	        this.duree = duree;
	    }
	    public void run() {
	        while (!isInterrupted()) {
	            System.out.println(this.getName());
	            try {
	                sleep(duree);
	            } catch (InterruptedException e) {
	                System.out.println(this.getName() + " interrupted");
	                interrupt();
	            }
	        }
	    }
}
