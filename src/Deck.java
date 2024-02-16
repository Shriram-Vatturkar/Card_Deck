import java.util.*;
public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();


    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "J", "Q", "K"};
    String[] suit = {"Club", "Spade", "Diamonds", "Heart"};
    public Deck(){
        for(int i =0; i <suit.length; i++){
            for(int j =0; j < values.length; j++){
                this.cards.add(new Card(suit[i], values[j]));
            }
        }
    }
    public ArrayList<Card> getDeck(){
        return cards;
    }
    public Object getCard(){
        return cards.get(0);
    }
    public ArrayList<Card> shuffleDeck(){
        Collections.shuffle(cards);
        return cards;
    }
    public ArrayList<Card> dealCards(){
        ArrayList<Card> randomCards = new ArrayList<Card>();
        Collections.shuffle(cards);
        randomCards.addAll(cards.subList(0, 5));
        return randomCards;
    }

    public Card findCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the suit of the card: ");
        String inputSuit = scanner.nextLine();
        System.out.print("Enter the value of the card: ");
        String inputValue = scanner.nextLine();
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(inputSuit) &&
                    card.getValue().equalsIgnoreCase(inputValue)) {
                return card;
            }
        }
        return null; // Card not found
    }


}