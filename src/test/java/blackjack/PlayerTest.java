package blackjack;

import blackjack.domain.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    @Test
    public void 베팅(){
        Player player = new Player("BUMGYU");
        player.bet(10000);
        assertThat(player.betting()).isEqualTo(new Money(10000));
    }

    @Test
    public void 카드뽑기(){
        Player player = new Player("BUMGYU");
        player.draw(new Card(CardValue.TWO, CardSuit.HEART));
        assertThat(player.calculate()).isEqualTo(2);
    }
}
