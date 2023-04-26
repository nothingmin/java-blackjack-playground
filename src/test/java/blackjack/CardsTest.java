package blackjack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CardsTest {
    @Test
    public void ACE가_1(){
        Cards cards = new Cards(Arrays.asList(
                new Card(CardValue.ACE, CardSuit.SPADE),
                new Card(CardValue.TEN, CardSuit.SPADE),
                new Card(CardValue.TEN, CardSuit.HEART)));
        Assertions.assertThat(cards.calculate()).isEqualTo(21);
    }
    @Test

    public void ACE가_11(){
        Cards cards = new Cards(Arrays.asList(
                new Card(CardValue.ACE, CardSuit.SPADE),
                new Card(CardValue.TWO, CardSuit.SPADE),
                new Card(CardValue.THREE, CardSuit.HEART)));
        Assertions.assertThat(cards.calculate()).isEqualTo(16);
    }
}
