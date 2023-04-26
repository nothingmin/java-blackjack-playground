package blackjack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    public void new_card(){
        Card card = new Card(CardValue.ACE, CardSuit.SPADE);
        Assertions.assertThat(card.equals(new Card(CardValue.ACE, CardSuit.SPADE))).isEqualTo(true);
    }

    @Test
    public void is_ace(){
        Card card = new Card(CardValue.ACE, CardSuit.SPADE);
        Assertions.assertThat(card.isAce()).isEqualTo(true);
        Card card2 = new Card(CardValue.TWO, CardSuit.SPADE);
        Assertions.assertThat(card2.isAce()).isEqualTo(false);
    }

    @Test
    public void ace_1(){
        Card card = new Card(CardValue.ACE, CardSuit.SPADE);
        Assertions.assertThat(card.aceValue(11)).isEqualTo(1);
    }

    @Test
    public void ace_11(){
        Card card = new Card(CardValue.ACE, CardSuit.SPADE);
        Assertions.assertThat(card.aceValue(10)).isEqualTo(11);
    }
}
