
public class StringAPIs {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE : Strings cannot change or they cannot be modified
		String str1 = "John, Jennie, Jack, Jim, Joe";
		
		// Performing any operation on string will give us a new String
		String str2 = str1.toUpperCase(); //str1.toLowerCase();
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		
		System.out.println("*************");
		
		//String str3 = str1.concat(", Mike, Leo");
		String str3 = str1 + ", Mike, Leo";
		System.out.println("str1 is: "+str1);
		System.out.println("str3 is: "+str3);
		
		// Bad Operation
		str3 = str3.toUpperCase(); // ideal operation -> String str4 = str3.toUpperCase();
		System.out.println("str3 is: "+str3);
		
		String str4 = str1.concat(", George").toUpperCase();
		System.out.println("str4 is: "+str4);
		
		String str5 = "John, Jennie, Jack, Jim, Joe, John, Mike, Leo, Harry";
		if(str5.contains("John")){
			System.out.println("John is thr !!");
		}
		
		int l = str5.length();
		System.out.println("length is: "+l);
		
		int idx = str5.indexOf('a');//str5.indexOf('o');
		
		//idx = str5.lastIndexOf('a');
		
		//idx = str5.indexOf("John");
		
		idx = str5.lastIndexOf("John");
		
		System.out.println("idx is: "+idx);
		
		char[] chArr = str5.toCharArray();
		for(char ch : chArr){
			System.out.print(ch+" ");
		}
		System.out.println();
		
		//String str5 = "John, Jennie, Jack, Jim, Joe, John, Mike, Leo, Harry";
		//String str6 = str5.substring(3);
		String str6 = str5.substring(3,10); // 3 inclusive, 10 not inclusive
		System.out.println("str6 is: "+str6);
		
		String[] strArr = str5.split(",");
		for(String str : strArr){
			System.out.println(str.trim());
		}
		
		String str7 = str5.replace('J', 'K');
		System.out.println("str7 is: "+str7);
		
		String songName = "someSong.mp3";
		if(songName.endsWith(".mp3")){ // startsWith
			System.out.println("Its an audio file !!");
		}
		
	}

}
