import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cardsPerPlayer = deck.length / players;

        for (int i = 0; i < players; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < cardsPerPlayer; j++)
                System.out.print(deck[i * cardsPerPlayer + j] + ", ");
            System.out.println();
        }
    }
}
