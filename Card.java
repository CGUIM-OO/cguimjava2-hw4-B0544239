
public class Card {

	
	
			private Suit suit; // int suit to Suit suit
								
			private int rank;
			public enum Suit{Clubs,Diamonds,Hearts,Spades;}
			
			public Card(Suit s, int r) {               // (int s, int r) to (Suit s, int r)
				suit = s;
				rank = r;
			}

			
			public void printCard() {                // print(suit,int rank)
				
				if (rank == 1) {
					System.out.print(suit + "," + "A");
					           }
				else if(rank ==11){
					System.out.print(suit + "," + "J");
				}
				else if(rank ==12){
					System.out.print(suit + "," + "Q");
				}
				else if(rank==13)
					System.out.println(suit + "," + "K");
				
	        else System.out.println(suit + "," + rank);
			}
				public Suit getSuit() {
					return suit;
				}
				public int getRank() {
					return rank;}
}
				