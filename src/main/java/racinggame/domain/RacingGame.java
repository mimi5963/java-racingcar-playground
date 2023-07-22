package racinggame.domain;

import racinggame.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private int tryNo;

    public RacingGame(String carNames,int tryNo){
        this.cars = initCars(carNames);
        this.tryNo = tryNo;
    }

    private List<Car> initCars(String carNames) {
        if(StringUtils.isBlank(carNames)){
            throw new IllegalArgumentException("자동차 이름 없어요");
        }
        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for(String name : names){
            cars.add(new Car(name));
        }
    return cars;
    }

    public void race(){
        this.tryNo--;
        moveCars();
    }

    private void moveCars() {
        //이쪽에 랜덤값을 만들어서 전달하는 방식으로
        //오브젝트 그래프 옮기기 가능
        for(Car car: cars){
            car.move();
        }
    }
    private void moveCars2() {

        for(Car car: cars){
            car.move(new RandomMovingStrategy());
        }
    }
    public boolean racing(){return  this.tryNo>0;}

}
