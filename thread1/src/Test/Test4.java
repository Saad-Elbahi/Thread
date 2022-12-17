package Test;

import thread.Thread4;

public class Test4 {
	 public static void main(String[] args) {
	        Thread4 thread1 = new Thread4("Thread 1", 300);
	        Thread4 thread2 = new Thread4("Thread 2", 300);
	        Thread4 thread3 = new Thread4("Daemon", 300);
	        thread1.start();
	        thread2.start();
	        thread3.setDaemon(true);
	        thread3.start();
	        try {
	            Thread.currentThread().sleep(1000);
	            thread1.interrupt();
	            thread2.interrupt();
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
//Conclure
//  les thread va etre terminees apres 1000
// Daemon  va etre automatiquement s'arrête apres tous  threads
// sont termines