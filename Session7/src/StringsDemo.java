
public class StringsDemo {

	public static void main(String[] args) {
		
		// String is Textual Data Type and is Reference Type
		
		// Interned Way
		String str1 = "Hello World"; 
		String str2 = "Hello World";
		
		// Non Interned or Object Way
		String str3 = new String("Hello World");
		String str4 = new String("Hello World");
		
		// Strings are Reference Variables
		System.out.println("str1 without toString call is: "+str1);
		System.out.println("str1 with toString call is: "+str1.toString());
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);

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
		
	}

}
