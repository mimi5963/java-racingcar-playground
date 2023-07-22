package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }


    public List<Car> findWinner() {
        return getWinnerList(this.cars,getMaxPos());
    }
    public static List<Car> getWinnerList(List<Car> cars,Position maxPos) {
        List<Car> winners= new ArrayList<>();
        for(Car car : cars){
            if(car.isWinner(maxPos)) { //getter없애기 위해 메시지 보내는 형식으로 바꾸기
                winners.add(car);
            }
//            if(car.getPos() == maxPos)
//                winners.add(car);
        }
        return winners;
    }
    private List<Car> getWinnerList(Position maxPos) {
        List<Car> winners= new ArrayList<>();
        for(Car car : cars){
            if(car.isWinner(maxPos)) { //getter없애기 위해 메시지 보내는 형식으로 바꾸기
                winners.add(car);
            }
//            if(car.getPos() == maxPos)
//                winners.add(car);
        }
        return winners;
    }

    private Position getMaxPos() {
        Position maxPos = new Position();
        for(Car car : cars){
           maxPos = car.getMaxPos(maxPos);
        }
        return maxPos;
    }
}
