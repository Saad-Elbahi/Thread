package thread;

public class Thread2 implements Runnable {
	private String message;
	private int n;
	private int duree;

	public Thread2(String message, int n, int duree) {
		super();
		this.message = message;
		this.n = n;
		this.duree = duree;
	}

	public void run() {
		for (int i = 0; i < n; i++) {
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
		Thread2 thread1 =new Thread2("hello !", 3, 1000);
		Thread2 thread2 =new Thread2("world !", 3, 1000);
		 Thread t1=new Thread(thread1);
		 t1.start();
		 Thread t2=new Thread(thread2);
		 t2.start();
		 Thread2 thread3 =new Thread2("\n",4, 1000);
		 Thread t3=new Thread(thread3);
		 t3.start();
		
	}
	

	
}
