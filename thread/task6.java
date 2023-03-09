package thread;

import java.lang.Thread.UncaughtExceptionHandler;

public class task6 {
public static void main(String[] args) {
	
	System.out.println("Thread main started");
	
	Thread.setDefaultUncaughtExceptionHandler((UncaughtExceptionHandler) new UncaughtExceptionHandler() {
	
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("Handling the Exception occured in thread " + t.getName());
		}
	});
	
	new mytask6().start();
	new mytask6().start();	
	
	System.out.println("Thread main finished");
}
}

class mytask6 extends Thread{
	
	
		public void run() {
			throw new RuntimeException();
		}
	
}