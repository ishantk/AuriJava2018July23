class Point{
	
	// Attributes: Non Static : Property of Object
	int x;
	int y;
	// Attributes: Static : Property of Class
	static int z;
}

public class StatDemoAgain {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = p1;
		
		p1.x = 10;
		p1.y = 20;
		p1.z = 30;
		
		p2.x = 100;
		p2.y = 200;
		p2.z = 300;
		
		p3.x = 1000;
		p3.y = 2000;
		p3.z = 3000;
		
		System.out.println("Point p1 is "+p1.x+" : "+p1.y+" : "+p1.z);
		System.out.println("Point p2 is "+p2.x+" : "+p2.y+" : "+p2.z);
		System.out.println("Point p3 is "+p3.x+" : "+p3.y+" : "+p3.z);
		
		System.out.println("Point z is: "+Point.z);
	}

}
