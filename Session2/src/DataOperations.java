
public class DataOperations {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println("num3 is: "+num3);

		num3++;
		++num3;
		
		System.out.println("num3 now is : "+num3);
		
		num3 += 11; // num3 = num3 + 11
		
		System.out.println("num3 now is : "+num3);
		
		num3 %= 3; // num3 = num3 % 3 
		System.out.println("num3 now is: "+num3);
		
		boolean result = num1 > num2;
		System.out.println("result is: "+result);
		
		//result = num3>num1 && num1<num2;
		result = num3>num1 || num1<num2;
		System.out.println("result now is: "+result);
		System.out.println("result now is: "+!result);
	}

}
