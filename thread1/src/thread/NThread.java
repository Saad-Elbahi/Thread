package thread;

public class NThread extends Thread {
	private String message;
	private int n;
	private  int duree;

	public NThread(String message, int n, int duree) {
		super();
		this.message = message;
		this.n = n;
		this.duree = duree;
	}
	
	public void run() {
		for(int i=0;i<n;i++) {
        System.out.println(message);
        try {
			Thread.sleep(duree);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
        
    }
	public static void main(String[] args) {
		NThread thread1 =new NThread("hello !", 3, 1000);
		thread1.start();
	}

}
