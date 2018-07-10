package Cardgame;
import java.util.Scanner;
public class Card
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String suits[]={"Club","Spade","Diamond","Hearts"};
	String rank[]={"2","3","4","5","6","7","8","9","10","Ace","Queen","King","Jack"};
	int n= suits.length*rank.length;
	String deck[]= new String[n];
	for(int i=0;i<rank.length;i++)
	{
		for(int j=0;j<suits.length;j++)
		{
			deck[suits.length*i+j]=rank[i]+" of "+suits[j];
		}
	}
	System.out.println("Before mixing the cards");
	for(int i=0;i<deck.length;i++)
	{
		System.out.println(deck[i]);
	}
	for(int i=0;i<deck.length;i++)
	{
		int r=i+(int)(Math.random()*n-i);
		String temp=deck[r];
		deck[r]=deck[i];
		deck[i]=temp;
	}
	System.out.println("After mixing the cards");
	for(int i=0;i<deck.length;i++)
	{
		System.out.println(deck[i]);
	}
    System.out.println("Enter the number of players");
    int row=sc.nextInt();
    System.out.println("Enter the number of cards given to each players");
    int col=sc.nextInt();
    String card[][]=new String[row][col];
    if(row*col<=n)
    {
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j<col;j++)
    	{
    		card[i][j]=deck[i+j];
    	}
    }
     Card.display(card);
    card=Card.bubbleString(card);
    System.out.println("-----------------------------------------------------------------------");
    Card.display(card);
    }
    else
    	System.out.println("can't distribute the card");
}
    public static String [][] bubbleString(String card[][])
   	{
   		for(int i=0;i<card.length;i++)
   		{
   			for (int j=0;j<card[i].length-1-i;j++)
   			{
   				if(card[i][j].compareTo( card[i][j+1])>0)
   				{
   					String k=card[i][j];
   					card[i][j]=card[i][j+1];
   					card[i][j+1]=k;
   				}
   			}
   		}
   		return card;
	}
    public static void display(String card [][])
    {
    	for(int i=0;i<card.length;i++)
        {
        	for(int j=0;j<card[i].length;j++)
        	{
        		System.out.print(card[i][j]+"/ ");
        	}
        	System.out.println();
        	System.out.println();
        }
    }
    public rank getRank()
    {
    	
    }
}
    


