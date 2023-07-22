package racinggame.domain;

import racinggame.utils.StringUtils;

import java.util.Objects;
import java.util.Random;

public class Car {
    private static final int FORWARD_NUM =4;
    private static final int MAX_BOUND = 10;

    private final CarName name;

    private Position pos;
    public Car(final String name){

       this(name,0);
    }

    public Car(String name, int pos) {
        this.name = new CarName(name);
        this.pos = new Position(pos);
    }

    public int getPos() {
        return pos.getPos();
    }
    public Position getPos2() {
        return pos;
    }

    public CarName getName() {
        return name;
    }

    public void move(MovingStratergy movingStratergy){
//        if(movingStratergy.movable())
//            this.pos++;
    }
    public void move(){
//        if(getRandomNo() >= FORWARD_NUM)
//            this.pos++;
    }
    public void move(int rand){
        if(rand >= FORWARD_NUM){
          pos = pos.move();
        }

    }
    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
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

    public boolean isWinner(Position maxPos) {
        return pos.equals(maxPos);
    }

    public Position getMaxPos(Position maxPos) {
        if(this.pos.lessThan(maxPos))
            return maxPos;

        return this.pos;
    }
}
