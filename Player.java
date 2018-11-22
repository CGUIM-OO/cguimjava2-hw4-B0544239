import java.util.ArrayList;

public class Player {

	
		// TODO Auto-generated method stub
		private String name;
		private int chips;
		private ArrayList<Card> oneRoundCard;
		
		public Player (String name , int chips) {
			this.name= name;
			this.chips=chips;
		}
		public String getName() {
			return name;
		}
		
		public int makeBet() {
			int bet =1;
			return bet;
		}
		
		public void setOneRoundCard(ArrayList cards) {
			oneRoundCard = cards;
		}
		
		public int getTotalValue() {
		int sum = 0;
		for (int i = 0; i < oneRoundCard.size(); i++) {

			Card temp = oneRoundCard.get(i);
			sum += temp.getRank();
		}
		return sum;

	}
		public boolean hitMe() {
			int sum;
			boolean get;
			sum= getTotalValue();
			if(sum>16)
				get = false;
			else
				get = true;
			return get;
		}
		public int getCurrentChips() {

			return chips;
	}
		public void increaseChips(int diff) {

			chips += diff;
}
		public void sayHello() {
			System.out.println("Hello, I am " + name + ".");
			System.out.println("I have " + chips + " chips.");
		}}
			
			
			
			
			
			
			
			
			
			
			
			
			
			