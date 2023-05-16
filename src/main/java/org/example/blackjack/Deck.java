package org.example.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards;
    private transient final Random random;

    public Deck() {
        cards = new ArrayList<>();
        random = new Random();
        for (Card card : Card.values()) {
            for (int i = 0; i < 4; i++) {
                cards.add(card);
            }
        }
    }

    public Card drawCard() {
        int index = random.nextInt(cards.size());
        return cards.remove(index);
    }
}
