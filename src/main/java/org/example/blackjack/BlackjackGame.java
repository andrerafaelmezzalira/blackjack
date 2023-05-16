package org.example.blackjack;

public class BlackjackGame {

    private static final int MAX_VALUE_BLACKJACK = 21;
    private final Deck deck;
    private final Player dealer;
    private final Player player;

    public BlackjackGame() {
        deck = new Deck();
        dealer = new Player("Mesa");
        player = new Player("Você");
    }

    public Player pullCards() {
        playerTurn();
        dealerTurn();
        return determineWinner();
    }

    private void playerTurn() {
        Card card = drawCardFromDeck();
        player.addPoints(card.getPoints());
        System.out.println("Player draws a " + card.name() + ". New score: " + player.getScore());
    }

    private void dealerTurn() {
        Card card = drawCardFromDeck();
        dealer.addPoints(card.getPoints());
        System.out.println("Dealer draws a " + card.name() + ". New score: " + dealer.getScore());
    }

    private Card drawCardFromDeck() {
        return deck.drawCard();
    }

    private Player determineWinner() {
        if (player.getScore() == MAX_VALUE_BLACKJACK || dealer.getScore() > MAX_VALUE_BLACKJACK) {
            System.out.println("Player wins!");
            return  player;
        }
        if (dealer.getScore() == MAX_VALUE_BLACKJACK || player.getScore() > MAX_VALUE_BLACKJACK) {
            System.out.println("Dealer wins!");
            return  dealer;
        }
        return null;
    }
}

