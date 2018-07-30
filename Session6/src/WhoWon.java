
public class WhoWon {

	public static void main(String[] args) {
		
		int paPunj = 1000;
		int paUp = 1256;
		int paKar = 678;
		
		int pbPunj = 900;
		int pbUp = 1153;
		int pbKar = 711;
		
		int paVoteCount = paPunj + paUp + paKar;
		int pbVoteCount = pbPunj + pbUp + pbKar;
		
		if(paVoteCount > pbVoteCount){
			System.out.println("PartyA won by "+(paVoteCount - pbVoteCount)+" votes");
		}else{
			System.out.println("PartyB won by "+(pbVoteCount - paVoteCount)+" votes");
		}
		
		int[] paVotes = {1000,1256,678};
		int[] pbVotes = {900,1153,711};

		//...
		
		int paVoteCount1 = 0;
		int pbVoteCount1 = 0;
		
		for(int vote : paVotes){
			paVoteCount1 = paVoteCount1 + vote;
		}
		
		for(int vote : pbVotes){
			pbVoteCount1 = pbVoteCount1 + vote;
		}
		
		if(paVoteCount1 > pbVoteCount1){
			System.out.println("PartyA won by "+(paVoteCount1 - pbVoteCount1)+" votes");
		}else{
			System.out.println("PartyB won by "+(pbVoteCount1 - paVoteCount1)+" votes");
		}
		
		int[][] votes = {
							{1000,1256,678}, // 0
							{900,1153,711}   // 1
						};
		//HW4: Calculate Who Won in Above Array 
		
	}
	

}
