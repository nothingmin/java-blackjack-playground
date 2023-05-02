package blackjack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DealerTest {
    @Test
    public void 딜러의_합_임계치_이하(){
        Dealer dealer = new Dealer();
        dealer.draw(new Card(CardValue.FIVE, CardSuit.HEART));
        dealer.draw(new Card(CardValue.ACE, CardSuit.HEART));
        assertThat(dealer.shouldDraw()).isEqualTo(true);
    }
    @Test
    public void 딜러의_합_임계치_초과(){
        Dealer dealer = new Dealer();
        dealer.draw(new Card(CardValue.SIX, CardSuit.HEART));
        dealer.draw(new Card(CardValue.ACE, CardSuit.HEART));
        assertThat(dealer.shouldDraw()).isEqualTo(false);
    }
}
