package blackjack.domain;

public class Dealer extends Player{

    public static final int DRAW_THRESHOLD = 16;

    public Dealer() {
        super("딜러");
    }

    public boolean shouldDraw() {
        return super.calculate() <= DRAW_THRESHOLD;
    }
}
