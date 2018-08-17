package com.auribises;

class Application{
	
	private static Application app = new Application();
	
	private Application(){
		System.out.println("Application Object Constructed");
	}
	
	public static Application getApplication(){
		return app;
	}
}


public class Singleton {

	public static void main(String[] args) {
		
		/*Application app1 = new Application();
		Application app2 = new Application();
		
		System.out.println("app1 is: "+app1);
		System.out.println("app1 is: "+app2);*/
		
		Application app1 = Application.getApplication();
		Application app2 = Application.getApplication();
		
		System.out.println("app1 is: "+app1);
		System.out.println("app1 is: "+app2);

	}

}
