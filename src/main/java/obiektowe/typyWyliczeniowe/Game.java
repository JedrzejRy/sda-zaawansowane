package obiektowe.typyWyliczeniowe;

public class Game {
    private Card card;
    private Card card1;

    public Game(Card card, Card card1) {
        this.card = card;
        this.card1 = card1;
    }

    public Card compareTwoCards(){
        if (card.getRankStrength()>card1.getRankStrength()){
            return card;
        }else {
            return card1;
        }
    }
}
