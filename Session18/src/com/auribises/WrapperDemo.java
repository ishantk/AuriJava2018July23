package com.auribises;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Single Value Container : Primitive Type (which will hold value)
		int i = 10;
		
		// Convert Primitive type into reference type
		// Boxing
		Integer iRef = new Integer(i);
		
		// UnBoxing
		int j = iRef.intValue();
		
		char ch = 'A';
		// Boxing
		Character cRef = new Character(ch);
		// UnBoxing
		char ch1 = cRef.charValue();
		
		float f = 2.2f;
		Float fRef = new Float(f);
		float g = fRef.floatValue();
		
		// AutoBoxing
		Integer iRef1 = i; // -> Integer iRef1 = new Integer(i);
		
		// AutoUnBoxing
		int k = iRef1;     // -> int k = iRef1.intValue();
		
		// Usage of Wrapper
		String str = "10";
		int value = Integer.parseInt(str);
		System.out.println("value is: "+value);
	}

}
