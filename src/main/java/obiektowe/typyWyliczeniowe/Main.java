package obiektowe.typyWyliczeniowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Card card0 = new Card(Rank.KING,Suit.SPADES);
        Card card1 = new Card(Rank.IV,Suit.HEARTS);
        System.out.println(card0.toString());
        System.out.println(card1.toString());
        System.out.println(Arrays.toString(Rank.values()));

        Game game = new Game(card0,card1);
        System.out.println(game.compareTwoCards().toString());

        List<Card> allSpadesCards = new ArrayList<>();
        Rank[] rank = Rank.values();
            for (Rank c : rank) {
                Card card = new Card(c, Suit.SPADES);
                allSpadesCards.add(card);
            }
        System.out.println(allSpadesCards);

        List<Card> deckOfCards = new ArrayList<>();
        Suit[] suits = Suit.values();
        for (Suit d :suits) {
            for (Rank c : rank) {
                Card card = new Card(c, d);
                deckOfCards.add(card);
            }
        }
        System.out.println(deckOfCards);

    }
}
