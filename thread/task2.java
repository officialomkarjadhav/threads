package thread;

public class task2 {
public static void main(String[] args) {
	System.out.println("main thread started ");
	Thread thread1=new Thread(new mytask1());
	Thread thread2=new Thread(new mytask1());
	thread1.start();
	thread2.start();
	System.out.println("main thread ended");
}
}

class mytask1 implements Runnable{
	
	public mytask1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
     for(int i=0;i<10;i++) {		
    	 System.out.println("["+Thread.currentThread().getName()+"]"+i);
    	 try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
     }
	}
}