
public class StringsAgain {

	public static void main(String[] args) {
		
		// IMMUTABLE
		String str = new String("Hello");
		
		// They are MUTABLE
		StringBuffer buffer = new StringBuffer("Hello"); 	// Thread-Safe
		StringBuilder builder = new StringBuilder("Hello"); // Not Thread-Safe
		
		str.concat(" World");
		buffer.append(" World");
		builder.append(" World");
		
		System.out.println("str is: "+str);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);
	}

}
