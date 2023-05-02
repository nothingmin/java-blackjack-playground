package blackjack;

public class Player {
    private final String name;
    private Money betting;

    public Player(String name) {
        this.name = name;

    }

    public void bet(int betting) {
        this.betting = new Money(betting);
    }

    public Money betting() {
        return this.betting;
    }
}
