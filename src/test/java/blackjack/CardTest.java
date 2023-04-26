package blackjack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    public void new_card(){
        Card card = new Card(CardValue.ACE, CardSuit.SPADE);
        Assertions.assertThat(card.equals(new Card(CardValue.ACE, CardSuit.SPADE))).isEqualTo(true);
    }
}
