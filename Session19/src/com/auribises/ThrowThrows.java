package com.auribises;

import java.io.IOException;

// User Defined Unchecked Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//User Defined Checked Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int balance = 10000;
	int minBalance = 3000;
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance < minBalance){
			balance = balance + amt;
			System.out.println("Withdrawl Failure !! Balance is LOW: \u20b9"+balance);
			attempts++;
		}else{
			System.out.println("Withdrawl Done !! New Balance is: \u20b9"+balance);
		}
		
		// Throwing an UNCHECKED EXCEPTION
		if(attempts == 3){
			ArithmeticException aRef = new ArithmeticException("Illegal Attempts: "+attempts);
			throw aRef;		// Crashing the program explicitly
		}
	}
	
	void withdrawAgain(int amt) throws IOException, YourBankingException{
		
		balance = balance - amt;
		
		if(balance < minBalance){
			balance = balance + amt;
			System.out.println("Withdrawl Failure !! Balance is LOW: \u20b9"+balance);
			attempts++;
		}else{
			System.out.println("Withdrawl Done !! New Balance is: \u20b9"+balance);
		}
		
		// Throwing a CHECKED EXCEPTION
		if(attempts == 3){
			//IOException io = new IOException("Illegal Attempts: "+attempts);
			//throw io;		// Crashing the program explicitly
			
			YourBankingException yb = new YourBankingException("Illegal Attempts: "+attempts);
			throw yb;
		}
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println("==Banking Started==");
		
		Banking bRef = new Banking();
		
		/*for(int i=1;i<=100;i++){
			bRef.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=100;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			System.out.println("Some error: "+e);
		}
		
		System.out.println("==Banking Finished==");
	}

}
