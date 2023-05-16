package org.example.blackjack;

public enum Card {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(11), KING(11);

    private final int points;

    Card(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
