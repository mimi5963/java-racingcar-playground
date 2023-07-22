package racinggame.domainTest;

import org.junit.jupiter.api.Test;
import racinggame.domain.Position;

import static org.assertj.core.api.Assertions.*;
public class PositionTest {
    @Test
    void create(){
        Position ps = new Position(3);
        assertThat(ps).isEqualTo(new Position(3));
    }
    @Test
    void valid(){
        assertThatThrownBy(()->{
            new Position(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void move(){
        Position ps = new Position(3);
        assertThat(ps.move()).isEqualTo(new Position(4));
    }
}
