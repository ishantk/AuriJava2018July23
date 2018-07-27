
public class Conditions {

	public static void main(String[] args) {
		
		int attPercentage = 75;
		
		// Normal if/else
		if ( attPercentage >=75 ){
			System.out.println("You can appear for Exams");
		}else{
			System.out.println("You are detained !!");
		}
		

		int physicsMarks = 90;
		int chemistryMarks = 92;
		int mathsMarks = 98;
		
		int avg = ( physicsMarks + chemistryMarks + mathsMarks ) / 3;
		System.out.println("Average is: "+avg);
		
		// Ladder if/else
		if(avg >= 90){
			System.out.println("Opt for Medical");
		}else if(avg>=80 && avg<90){
			System.out.println("Opt for Non Medical");
		}else if(avg>=60 && avg<80){
			System.out.println("Opt for Commerce");
		}else if(avg < 60){
			System.out.println("Opt for Arts");
		}else{
			System.out.println("Join Family Business !!");			
		}
		
		int uberGo = 1;
		int uberX = 2;
		int uberMoto = 3;
		
		int choice = uberMoto;
		
		//....
		
		if(choice == uberGo){
			System.out.println("You Booked UberGo. Its on the Way !!");
		}else if(choice == uberX){
			System.out.println("You Booked UberX. Its on the Way !!");
		}else if(choice == uberMoto){
			System.out.println("You Booked UberMoto. Its on the Way !!");
		}else{
			System.out.println("Not a Valid Choice");
		}
		
		// nested if else
		boolean isInternetConnected = true;
		boolean isGPSConnected = true;
		
		if(isInternetConnected){
			if(isGPSConnected){
				System.out.println("You can browse Google Maps");
			}else{
				System.out.println("Please turn on GPS Location First !!");
			}
		}else{
			System.out.println("Please Connect to Internet and Retry Again !!");
		}
		
		int a = 10;
		int b = 20;
		int c = 20;
		int d = 30;
		int e = 40;
		
		if(a>b){
			if(a>c){
				System.out.println("a is greatest !!");
			}else{
				System.out.println("c is greatest !!");
			}
		}else{
			if(b>c){
				System.out.println("b is greatest !!");
			}else{
				System.out.println("c is greatest !!");
			}
		}
		
		if(isInternetConnected && isGPSConnected){
			System.out.println("You can browse Google Maps");
		}else{
			System.out.println("Please check intenet or gps");
		}
		
	}

}
