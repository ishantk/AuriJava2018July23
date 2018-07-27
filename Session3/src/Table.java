import java.util.Scanner;

/*
A train of length X mtr is running at a speed of Y KMPH. 
In what time it will pass a man who is running at Z KMPH in 
the direction opposite to that in which the train is going ??

Test Case : X = 110
			Y = 60 KMPH
			Z = 6 KMPH
			
			Ouput is 6 Secs
			
			Find Logic and Write Program
*/

public class Table {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num = scanner.nextInt();
		int i = 1;

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
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		

	}

}
