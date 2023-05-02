package blackjack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void 베팅(){
        Player player = new Player("BUMGYU");
        player.bet(10000);
        Assertions.assertThat(player.betting()).isEqualTo(new Money(10000));
    }
}
