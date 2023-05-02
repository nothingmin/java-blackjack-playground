package blackjack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class CardsTest {
    @Test
    public void ACE가_1(){
        Cards cards = new Cards(Arrays.asList(
                new Card(CardValue.ACE, CardSuit.SPADE),
                new Card(CardValue.TEN, CardSuit.SPADE),
                new Card(CardValue.TEN, CardSuit.HEART)));
        assertThat(cards.calculate()).isEqualTo(21);
    }
    @Test

    public void ACE가_11(){
        Cards cards = new Cards(Arrays.asList(
                new Card(CardValue.ACE, CardSuit.SPADE),
                new Card(CardValue.TWO, CardSuit.SPADE),
                new Card(CardValue.THREE, CardSuit.HEART)));
        assertThat(cards.calculate()).isEqualTo(16);
    }

    @Test
    public void 카드뽑기(){
        Cards cards = new Cards(Arrays.asList(
                new Card(CardValue.ACE, CardSuit.SPADE),
                new Card(CardValue.TWO, CardSuit.SPADE),
                new Card(CardValue.THREE, CardSuit.HEART)));
        assertThat(cards.calculate()).isEqualTo(16);
        cards.draw(new Card(CardValue.THREE, CardSuit.HEART));
        assertThat(cards.calculate()).isEqualTo(19);
    }

    @Test
    public void 카드뽑기_ACE가_1(){
        Cards cards = new Cards(Arrays.asList(
                new Card(CardValue.ACE, CardSuit.SPADE),
                new Card(CardValue.TWO, CardSuit.SPADE),
                new Card(CardValue.THREE, CardSuit.HEART)));
        assertThat(cards.calculate()).isEqualTo(16);
        cards.draw(new Card(CardValue.ACE, CardSuit.HEART));
        assertThat(cards.calculate()).isEqualTo(17);
    }

    @Test
    public void 카드뽑기_ACE가_11(){
        Cards cards = new Cards(Arrays.asList(
                new Card(CardValue.TWO, CardSuit.SPADE),
                new Card(CardValue.THREE, CardSuit.HEART)));
        assertThat(cards.calculate()).isEqualTo(5);
        cards.draw(new Card(CardValue.ACE, CardSuit.HEART));
        assertThat(cards.calculate()).isEqualTo(16);
    }
}
