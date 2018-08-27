class Point<T,U>{
	
	T x;
	T y;
	U z;

	public Point(){
		
	}
	
	public Point(T x, T y, U z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+":"+y+":"+z);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z +"]";
	}
}

public class Generics {

	public static void main(String[] args) {
		
		Point p1 = new Point(); //-> Point<Object> p1 = new Point<Object>();
		Point<Integer,Float> p2 = new Point<Integer,Float>(10,20,2.2f);
		Point<Double,String> p3 = new Point<Double,String>(10.23,20.33,"Hello");
		Point<Character,Character> p4 = new Point<Character,Character>('A','B','C');
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
