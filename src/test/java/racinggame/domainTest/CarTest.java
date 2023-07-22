package racinggame.domainTest;

import org.junit.jupiter.api.Test;
import racinggame.domain.Car;
import racinggame.domain.MovingStratergy;

import static org.assertj.core.api.Assertions.*;
public class CarTest {
    @Test
    void 이동(){
        Car car = new Car("pobi");
        car.move(() -> true);
        assertThat(car.getPos()).isEqualTo(1);
    }
    @Test
    public void 정지(){
        Car car = new Car("pobi");
        car.move(() -> false);
        assertThat(car.getPos()).isEqualTo(0);
    }

}
