package racingGame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> carList;

    public Cars(String[] input){
        carList = carSetUp(input);
    }


    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getWinner() {
        final int MAX_POS = carList.stream().map(Car::getCps).max(Integer::compareTo).get();
        return carList.stream().sorted().filter(car -> MAX_POS == car.getCps()).collect(Collectors.toList());
    }

    private static List<Car> carSetUp(String[] input) {
        return Arrays.stream(input).map(Car::new).collect(Collectors.toList());
    }

    public void racingStart() {
        carList.stream().forEach(car -> {
            car.setCps((int)(Math.random()*9));
        });
    }
}
