
public class Loops {

	public static void main(String[] args) {
		
		int num = 5, i = 111;
		
		System.out.println("===while loop===");
		while(i<=10){ // Entry Control
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;  // i = i + 1
			//i+=2; // i = i + 2;
			//i--;
		}
		
		
		System.out.println("===do while loop===");
		num = 7;
		i = 111;
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);  // Exit Control
		

		System.out.println("===for loop===");
		int n = 9;
		//int j = 1;
		
		//for(int n=9,j=1;j<=10;j++){
		//for(;j<=10;j++){
		for(int j=1;j<=10;j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		
		System.out.println("===nested loop===");
		
		for(int x=1;x<=3;x++){
			System.out.println("for x "+x);
			for(int y=1;y<=5;y++){
				System.out.print(y+"  ");
			}
			System.out.println();
		}
		
		System.out.println("===Enhanced for loop===");
		int[] arr = {10,20,30,40,50};
		/*for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		
		for(int elm : arr){
			System.out.println(elm);
		}
	}

}
