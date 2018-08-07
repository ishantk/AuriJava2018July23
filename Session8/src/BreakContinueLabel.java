
public class BreakContinueLabel {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			
			/*if(i == 5){
				break;
			}*/
			
			if(i<=5){
				continue;
			}
			
			System.out.println("i is: "+i);
		}
		
		System.out.println("*************");
		
		outer:
		for(int i=1;i<=3;i++){
			//for(int j=1;j<=5;j++){
				inner:
				for(int j=1;j<=i;j++){
				System.out.print(j+"  ");
				if(j == 2){
					break outer;
				}
			}
			System.out.println();
		}
		
		System.out.println("*************");

	}

}
