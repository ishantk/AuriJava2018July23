package com.auribises;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("**MyTask**"+i);
		}
	}
}*/

class MyTask extends Thread{ // IS-A Relation
	// Jobs of Child Thread must be written in the run method
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("**MyTask**"+i);
		}
	}
}

class CA{
	
}

class YourTask extends CA implements Runnable{ // IS-A Relation
	// Jobs of Child Thread must be written in the run method
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("##YourTask##"+i);
		}
	}
}

public class App {

	// Instructions written in the main method are executed sequentially
	// i.e. one after the other -> Synchronous Behavior
	public static void main(String[] args) {
		
		// below are the jobs which will be executed in the main thread
		
		System.out.println("== App Started ==");
		
		MyTask mRef = new MyTask();
		//mRef.executeTask();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r);
		
		mRef.start(); // start method will execute run method internally
		yRef.start();
		
		for(int i=1;i<=10;i++){
			System.out.println("==Main=="+i);
		}
		
		System.out.println("== App Finished ==");

	}

}
