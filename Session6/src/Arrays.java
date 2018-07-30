
public class Arrays {

	public static void main(String[] args) {
		
		// a is a Single Value Container (Only 1 Value)
		// a can store only integer data
		// Value is stored as data
		int a = 10; 
		
		// Multi Value Container
		// Homogeneous : Same Type of Data
		// Reference Variables : Stores address where data is placed
		
		// Implicit Way
		int[] arr1 = {10,20,30,40,50}; //-> int arr1[] = new int[]{10,20,30,40,50};
		int arr2[] = {10,20,30,40,50};
		
		// Explicit Way
		int arr3[] = new int[]{10,20,30,40,50};
		
		System.out.println("a is: "+a);
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);
		
		int b = a;				// Copying the Value
		int[] arr4 = arr1;		// Copying the Address
		
		System.out.println("b is: "+b);
		System.out.println("arr4 is: "+arr4);
		
		// Reading the Array
		System.out.println(arr1[0]);
		
		// Write into Array or Updating into Array
		arr1[1] = 175;
		
		arr4[3] = 225;
		
		System.out.println(arr1[1]);
		
		// Read All the Elements of Array
		System.out.println("arr1 length is: "+arr1.length);
		System.out.println("==============");
		/*System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);*/
		
		// Basic For Loop
		for(int i=0;i<arr1.length;i++){
			System.out.println("i is: "+i+"  "+arr1[i]);
		}
		
		System.out.println("*****====*****====");
		// Enhanced For Loop
		for(int elm : arr4){
			System.out.println(elm);
		}
		
		System.out.println("==============");

	}

}
