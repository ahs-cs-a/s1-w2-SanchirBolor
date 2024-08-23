public class Card {
    private int suit;
    private int rank;

    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;

    }

    public Card(){
        this(3, 13);

    }

    public int suit(){
        return suit;
    }

    public int rank(){
        return rank;
    }

    public void printState(){
        System.out.println("Suit");
        System.out.println("rank");
    }

    
}
