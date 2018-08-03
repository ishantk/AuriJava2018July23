
public class Strings {

	public static void main(String[] args) {
		
		// Interned Way
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Object Way
		String str3 = new String("HEllo");
		String str4 = new String("Hello");
		
		// str1, str2, str3 and str4 are reference variables !!
		// they contain addresses
		// but when we print str1, str2, str3 and str4 we see values and not addresses
		
		System.out.println("str1 is: "+str1); // -> translated to -> System.out.println("str1 is: "+str1.toString());
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		System.out.println("*****************");
		System.out.println("str1 is: "+str1.toString());
		System.out.println("str2 is: "+str2.toString());
		System.out.println("str3 is: "+str3.toString());
		System.out.println("str4 is: "+str4.toString());
		
		// What is the proof that below written sentence is TRUE
		// str1, str2, str3 and str4 are reference variables !!
		// == is not comapring values
		// == is comparing addresses i.e. ref variables
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		int[] a1 = {10,20,30,40,50}; // int[] a1 = new int[]{10,20,30,40,50};
		int[] a2 = {10,20,30,40,50}; // int[] a2 = new int[]{10,20,30,40,50};
		int[] a3 = a1;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		if(a1 == a2){
			System.out.println("a1 == a2");
		}else{
			System.out.println("a1 != a2");
		}
		
		if(a1 == a3){
			System.out.println("a1 == a3");
		}else{
			System.out.println("a1 != a3");
		}
		
		// equals method returns true or false
		if(str1.equals(str2)){
			System.out.println("str1 is equal to str2");
		}else{
			System.out.println("str1 is not equal to str2");
		}
		
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 is equal to str4");
		}else{
			System.out.println("str3 is not equal to str4");
		}
		
		//if(str3.compareTo(str4) == 0){
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 is equal to str4");
		}else{
			System.out.println("str3 is not equal to str4");
		}
	}
	

}
