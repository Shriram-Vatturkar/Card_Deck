public class Card {
    private String suit;
    private String value;
    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }
    public String getSuit(){
        return suit;
    }
    public String setValue(){
        return value;
    }
    public String toString(){
        return "\n" + value + " of " + suit;
    }
    public String getValue() {
        return value;
    }
}