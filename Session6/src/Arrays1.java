
public class Arrays1 {

	public static void main(String[] args) {
		
		// Single Dimensional Arrays
		int[] a1 = {10,20,30,40,50};
		
		// a2 is a new array with 5 elements and all the elements as 0.
		int[] a2 = new int[5];
		
		a2[2] = 111;
		a2[4] = 222;
		
		for(int elm : a2){
			System.out.println(elm);
		}
		
		// Multi Dimensional Arrays : Array of Arrays
		int[][] a3 ={
						{10,20},			// 0
						{10,20,30,40},		// 1
						{10,20,30}, 		// 2
						{10},				// 3
						{10,20,30,40,50}	// 4
				  	};
		System.out.println("a3 is: "+a3);
		System.out.println("a3 length is: "+a3.length);
		
		System.out.println("a3[0] is: "+a3[0]);
		System.out.println("a3[0][0] is: "+a3[0][0]);
		System.out.println("a3[4][4] is: "+a3[4][4]);
		System.out.println("a3[0] length is: "+a3[0].length);
		
		//System.out.println(a3[0][2]); Error at Run Time
		
		System.out.println("----------------------------------");
		for(int i=0;i<a3.length;i++){
			System.out.println("a3["+i+"] is: "+a3[i]);
			System.out.println("a3["+i+"] length is: "+a3[i].length);
			System.out.println("----------------------------------");
		}
		
		System.out.println("----------------------------------");
		for(int i=0;i<a3.length;i++){
			for(int j=0;j<a3[i].length;j++){
				System.out.print(a3[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		// HW1: Do it with Enhanced For Loop
		// HW2: Attach Debugger in Loop to study the behavior
		
		// Array of Array of Arrays
		int[][][] a4 = {
							{
								{10,20},			// 0
								{10,20,30,40},		// 1
								{10,20,30}, 		// 2 			// 0
								{10},				// 3
								{10,20,30,40,50}	// 4
						  	},
							{
								{10,20},			// 0
								{10,20,30,40},		// 1			/ /1  
								{10,20,30}, 		// 2
						  	}
					};
		System.out.println("a4 is: "+a4);
		System.out.println("a4 length is: "+a4.length);
		// HW3: Print all the elements of 3-D Array
		
		// Conclusion : N-D Array is a Collection of N-1 D Arrays
		
		int[][] a5 = new int[5][];  // Array of Arrays with 5 Arrays
		a5[0] = new int[5];
		a5[1] = new int[]{10,20};
		//...
		
		int[][] a6 = new int[3][5]; // Array of Arrays with 3 Arrays, each having 5 elements
		
		// int[][] a7 = new int[][5]; error
		
		
		for(int[] a : a3){
			for(int elm : a){
				System.out.print(elm+" ");
			}
			System.out.println();
		}
	}
	

}
