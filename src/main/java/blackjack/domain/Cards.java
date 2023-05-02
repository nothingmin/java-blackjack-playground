package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private final ArrayList<Card> cards = new ArrayList<>();

    public Cards(List<Card> cards) {
        this.cards.addAll(cards);
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

    public void draw(Card card) {
        this.cards.add(card);
    }
}
