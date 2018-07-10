package Cardgame;
public class Card1
{
	 public enum Rank {ACE,King,Queen,Jack,10,9,8,7,6,5,4,3,2};
	 enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};
	    private Rank rank;
	    private Suit suit;
	     
	    public Card1(Rank rank, Suit suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }
	     
	   
	    public Rank getRank() {
	        return rank;
	    }
	 
	  
	    public Suit getSuit() {
	        return suit;
	    }
	 
	    public String toString() {
	        return rank + " of " + suit;
	    }
	    
}
