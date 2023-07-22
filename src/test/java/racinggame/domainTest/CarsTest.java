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

        Car pobi = new Car("ss",2);

        Car ho = new Car("ho",1);


        List<Car> origin = Arrays.asList(boni,pobi,ho);
        Cars cars = new Cars(origin);

        assertThat(cars.findWinner()).containsExactly(boni,pobi);
    }
}
