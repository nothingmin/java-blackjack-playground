package blackjack;

import java.util.List;

public class Cards {
    private final List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public int calculate() {
        int sumWithoutAce = cards.stream().map(Card::getValue).reduce(0, Integer::sum);
        return sumWithAce(sumWithoutAce);
    }

    private int sumWithAce(int sumWithoutAce) {
        int sum = sumWithoutAce;
        for (Card card : cards) {
            if (!card.isAce()) continue;
            sum = sum + card.aceValue(sum);
        }
        return sum;
    }
}
