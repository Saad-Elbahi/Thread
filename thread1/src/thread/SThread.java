package thread;

public class SThread extends Thread{

	
		private String message;
		private int n;
		private  int duree;

		public SThread(String message, int n, int duree) {
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
			SThread thread1 =new SThread("hello !", 3, 1000);
			thread1.start();
			SThread thread2 =new SThread("word !", 3, 1000);
			thread2.start();
			try {
				SThread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(thread1.getState());
			System.out.println(thread2.getState());
		}

	}



