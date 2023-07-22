package racinggame.domainTest;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import racinggame.domain.Car;
import racinggame.domain.Cars;

import java.util.Arrays;
import java.util.List;

public class CarsTest {
    @Test
    void winner(){
        Car boni = new Car("boni",2);
        boni.move();
        boni.move();

        Car pobi = new Car("ss",2);
        pobi.move();
        pobi.move();

        Car ho = new Car("ho",1);
        ho.move();

        List<Car> origin = Arrays.asList(boni,pobi,ho);
        Cars cars = new Cars(origin);

        assertThat(cars.findWinner()).containsExactly(pobi,boni);
    }
}
