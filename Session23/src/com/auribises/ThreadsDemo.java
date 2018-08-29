package com.auribises;

class MyThread extends Thread{
	
	public void run() {
		for (int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000); // 1000 milli secs -> 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("**MyThread**"+i);
		}
	}

}

class YourThread implements Runnable{
	public void run() {
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(1500); // 1500 milli secs -> 1.5 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("@@YourThread@@"+i);
		}
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		MyThread mRef = new MyThread();
		
		Runnable r = new YourThread();
		Thread yRef = new Thread(r);
		
		mRef.setName("Rocky");
		yRef.setName("Charlie");
		Thread.currentThread().setName("John");
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		yRef.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); //5
		
		
		
		mRef.start();
		// Immediately after start method:
		
		try {
			mRef.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		yRef.start();
		/*try {
			yRef.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		mRef.yield();
		
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(2000); // 2000 milli secs -> 2 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("==Main Thread=="+i);
		}
		
		// Priority
		System.out.println("MyThread Priority: "+mRef.getPriority());
		System.out.println("YourThread Priority: "+yRef.getPriority());
		System.out.println("MainThread Priority: "+Thread.currentThread().getPriority());
		
		// Names
		System.out.println("MyThread Name: "+mRef.getName());
		System.out.println("YourThread Name: "+yRef.getName());
		System.out.println("MainThread Name: "+Thread.currentThread().getName());
		
		System.out.println("==App Finished==");
		
	}

}
