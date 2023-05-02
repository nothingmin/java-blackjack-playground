package blackjack.domain;

import java.util.ArrayList;

public class Player {
    private final String name;
    private Money betting;
    private final Cards cards= new Cards(new ArrayList<>());

    public Player(String name) {
        this.name = name;

    }

    public void bet(int betting) {
        this.betting = new Money(betting);
    }

    public Money betting() {
        return this.betting;
    }

    public void draw(Card card) {
        this.cards.draw(card);
    }

    public int calculate() {
        return this.cards.calculate();
    }
}
