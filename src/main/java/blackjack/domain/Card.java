package blackjack.domain;

import java.util.Objects;

public class Card {
    public int getValue() {
        if(value == CardValue.ACE){
            return 0;
        }
        if(value == CardValue.TWO){
            return 2;
        }
        if(value == CardValue.THREE){
            return 3;
        }
        if(value == CardValue.FOUR){
            return 4;
        }
        if(value == CardValue.FIVE){
            return 5;
        }
        if(value == CardValue.SIX){
            return 6;
        }
        if(value == CardValue.SEVEN){
            return 7;
        }
        if(value == CardValue.EIGHT){
            return 8;
        }
        if(value == CardValue.NINE){
            return 9;
        }
        if(value == CardValue.TEN){
            return 10;
        }
        if(value == CardValue.JACK){
            return 10;
        }
        if(value == CardValue.QUEEN){
            return 10;
        }
        if(value == CardValue.KING){
            return 10;
        }
        return 0;
    }
    private final CardValue value;
    private final CardSuit suit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suit);
    }

    public Card(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    public boolean isAce() {
        return value == CardValue.ACE;
    }

    public int aceValue(int sum) {
        if (sum > 10){
            return 1;
        }
        return 11;
    }
}
