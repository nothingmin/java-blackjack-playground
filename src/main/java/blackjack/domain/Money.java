package blackjack.domain;

import java.util.Objects;

public class Money {
    private final int money;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return money == money1.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }

    public Money(int money) {
        if(money <= 0 ) {
            throw new IllegalArgumentException("베팅 금액은 0보다 커야함");
        }
        this.money = money;
    }
}
