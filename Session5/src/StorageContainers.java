public class StorageContainers {

	public static void main(String[] args) {
		
		// Your Code goes here:
		
		// Single Value Container:
		// Primitive
		
		// Writing the data
		int age = 10;
		
		// Initialize Before Use Principle (IBU)
		double pi = 3.14;
		
		// reading the data
		System.out.println("age is: "+age);
		System.out.println("pi is: "+pi);
		
		char ch = 'A';
		
		// Multi Value Container:
		// Homogeneous in Nature : Array
		int[] arr1 = {10,20,30,40,50}; // -> int[] arr1 = new int[]{10,20,30,40,50};
		System.out.println("arr1 is: "+arr1);
		
		// arr1 is a reference variable i.e. it holds the address if Array
		// Array is MVC which is created in Heap
		
		int[] arr2 = new int[]{100,200,300,400,500};
		System.out.println("arr2 is: "+arr2);
		
		int newAge = age; 	// Value Copy
		int[] arr3 = arr1;	// Reference Copy
		
		System.out.println("arr3 is: "+arr3);
		
		int[] arr4 = new int[5];
		
		int[] arr5, arr6;
		arr5 = new int[10];
		arr6 = new int[20];
		
		int arr7[] = new int[5];
		int arr8[] = {10,20,30,40,50};
		
		int arr9[], arr10[];
		arr9 = new int[10];
		arr10 = new int[20];
		
	}

}
