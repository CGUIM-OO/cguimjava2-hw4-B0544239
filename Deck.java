import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cards;     //ArrayList<Card> usedCard & public int nUsed
	private ArrayList<Card> usedCard;
	private ArrayList<Card> openCard;
	public int nUsed;
	
	
	public void shuffle() {            //replace card in used card
		
		 for(Card a:usedCard)
		 cards.add(a); 
	 int i=cards.size();
	 //System.out.println(i);
	 
	 for(int n=0;n<=100000;n++)   // make a random number to pick a random card to move to the first card,  after all reset nUsed
	 {Random r = new Random();
	 int j = r.nextInt(i);
	 
	 //System.out.println(j);     // set a temp reference put inside then remove first then add it back 
	 Card temp=cards.get(j);
	 cards.remove(j);
	 cards.add(temp);
	  
	 }
	 usedCard.clear();
	 nUsed=0;
	
	 openCard.clear();
}
	public Card getOneCard(boolean isOpened) {                     // when decks is empty, call shuffle
		 boolean exsist = cards.isEmpty();
			
		 if(!exsist)
		 {
			shuffle();
			 
		 }
		
		 Card getC=cards.get(0);
		 cards.remove(0); 
		 nUsed+=1;
		 usedCard.add(getC);
		 return getC;
		
		
		 
	 }
	public ArrayList<Card> getAllCards() {
		return cards;
	}
	// TODO: Please implement the constructor (30 points)
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();
		usedCard= new ArrayList<Card>();
		// 1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		// Hint: Use new Card(x,y) and 3 for loops to add card into deck
		// Sample code start
		// Card card=new Card(1,1); ->means new card as clubs ace
		// cards.add(card);
		// Sample code end
		for (int n = 1; n <= nDeck; n++) { // need to now how many deck first
			for (int x = 1; x <= 4; x++) { // write X as suit
				for (int y = 1; y <= 13; y++) { // write y as rank
					if (x==1)
					{Card card = new Card(Card.Suit.Clubs, y);
					cards.add(card);
					}
					else if (x==2)
					{Card card = new Card(Card.Suit.Diamonds, y);
					cards.add(card);
					}
					else if (x==3)
					{Card card = new Card(Card.Suit.Hearts, y);
					cards.add(card);
					}
					else if (x==4)
					{Card card = new Card(Card.Suit.Spades, y);
					cards.add(card);
					 // add all in to cards
				}
			}
			}}
			
		
}

		public void printDeck() {

			for (Card a : cards)
				a.printCard();
	
		
		
		}
		public ArrayList getOpenedCard() {

			return openCard;
		
		
		}}
