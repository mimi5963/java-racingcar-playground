package cartest;

import org.junit.jupiter.api.Test;
import racingGame.domain.Car;
import racingGame.domain.MoveStretergy;
import racingGame.domain.Position;

import static org.assertj.core.api.Assertions.*;
public class CarTester {

    @Test
    void 자동차_이동_테스트(){
        Car c1 = new Car("pobi");
        c1.move(3);
        assertThat(c1.getPos().equals(new Position(0))).isTrue();
    }
    @Test
    void 자동차_이동_테스트2(){
        Car c1 = new Car("pobi");
        c1.move(4);
        assertThat(c1.getPos().equals(new Position(1))).isTrue();
    }

    @Test
    void 자동차_이동_테스트3(){
        Car c1 = new Car("pobi");
        c1.move(()->true);
        assertThat(c1.getPos().equals(new Position(1))).isTrue();
    }

    @Test
    void 자동차_이동_테스트4(){
        Car c1 = new Car("pobi");
        c1.move(new MoveStretergy() {
            @Override
            public boolean moveable() {
                return getrandomnum() >=4;
            }

            private int getrandomnum(){
                return 3;
            }
        });
        assertThat(c1.getPos().equals(new Position(1))).isFalse();
    }
}
