
public class Iterations {

	public static void main(String[] args) {
		
		/*int num = 5;
		int i = 1;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		
		// Loop
		for(int num=5,i=1; i<=10; i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		
		System.out.println("********************");
		
		int num = 7;
		int j = 1;
		
		for(;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
		System.out.println("********************");
		// Nested Loop
		for(int x=1;x<=5;x++){
			System.out.println("x is: "+x);
			for(int y=1;y<=3;y++){
				System.out.print(y+"  ");
			}
			System.out.println();
		}

		System.out.println("********************");
		
		for(int p=1; p<=100; p++){
			
			System.out.println("=========Table of "+p+"============");
			
			for(int q=1;q<=10;q++){
				System.out.println(p+" "+q+"'s are "+(p*q));
			}
			
			System.out.println();
			System.out.println("=====================");
		}
		
		
	}

}
