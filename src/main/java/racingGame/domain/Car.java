package racingGame.domain;

import java.util.Objects;
import java.util.Random;

public class Car {
    private static final int MAX_BOUND =10;
    private static final int MOVABLE =4;
    private final CarName name;
    private Position pos;
    public Car(String username){
        this.name = new CarName(username);
        pos = new Position();
    }

    public void move() {
        if(getRandomNum() >= MOVABLE)
           pos = pos.move();
    }
    //해결방식 1
    public void move(int i){
        if(i>=MOVABLE)
            pos =pos.move();
    }
    public void move(MoveStretergy moveStretergy){
        if(moveStretergy.moveable())
            pos =pos.move();
    }

    private int getRandomNum() {
        Random rn = new Random();
        return rn.nextInt(MAX_BOUND);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(pos, car.pos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pos);
    }

    public Position getPos() {
        return pos;
    }
}
