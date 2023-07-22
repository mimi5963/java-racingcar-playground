package racinggame.domain;

import racinggame.utils.StringUtils;

import java.util.Random;

public class Car {
    private static final int FORWARD_NUM =4;
    private static final int MAX_BOUND = 10;

    private final CarName name;
    private int pos = 0;
    private Position pos2;
    public Car(final String name){

       this(name,0);
    }

    public Car(String name, int pos) {
        this.name = new CarName(name);
        this.pos2 = new Position(pos);
    }

    public int getPos() {
        return pos;
    }

    public CarName getName() {
        return name;
    }
    public void move(MovingStratergy movingStratergy){
        if(movingStratergy.movable())
            this.pos++;
    }
    public void move(){
        if(getRandomNo() >= FORWARD_NUM)
            this.pos++;
    }
    public void move(int rand){
        if(rand >= FORWARD_NUM){
          pos2 = pos2.move();
        }

    }
    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }


}
