//Shriram Vatturkar AIML B2 107
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display the entire deck");
            System.out.println("2. Display a single card");
            System.out.println("3. Shuffle the deck");
            System.out.println("4. Deal cards");
            System.out.println("5. Find a card");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    System.out.println("Entire deck: " +
                            deck.getDeck());
                    break;
                case 2:
                    System.out.println("Single card: " +
                            deck.getCard());
                    break;
                case 3:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 4:
                    System.out.println("Dealt cards: " +
                            deck.dealCards());
                    break;
                case 5:
                    Card foundCard = deck.findCard();
                    if (foundCard != null) {
                        System.out.println("Card found: " +
                                foundCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}