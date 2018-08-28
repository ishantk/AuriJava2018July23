
public class VarArgs {

	void fun1(int[] arr){
		for(int elm : arr){
			System.out.println(elm);
		}
	}
	
	
	void fun2(int...arr){ // Variable Arguments
		for(int elm : arr){
			System.out.println(elm);
		}
		
		System.out.println("arr is "+arr);
	}
	
	// WAP where you shall pass variable arguments as objects eg: Student
	// Sort the Array based on Roll Number of Students
	
	void studentsList(Student...students){
		
	}
	
	
	public static void main(String[] args) {

		VarArgs vRef = new VarArgs();
		
		int[] a1 = {10,20,30,40,50};
		vRef.fun1(a1);

		System.out.println("====");
		
		vRef.fun2(10,20,30,40,50,60,70,80,90,100);
		
	}

}
