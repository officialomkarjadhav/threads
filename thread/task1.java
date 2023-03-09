package thread;

public class task1 {

	
public static void main(String[] args) {
	
	System.out.println("main thread started");
	Thread thread1=new mytask();
	Thread thread2=new mytask();
	thread1.start();
	thread2.start();
	System.out.println("main thread ended");
}	
	
}

 class mytask extends Thread {
	
	 @Override
	public void run() {
      for(int i=0;i<5;i++) {		
    	  System.out.println("["+Thread.currentThread().getName()+"]"+i);
    	  try {
			Thread.sleep(200);
		} catch (Exception e) {
         e.printStackTrace();
		}
      }
	}
		 
	 
}