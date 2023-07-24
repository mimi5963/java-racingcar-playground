package racinggame.domain;

import java.util.Objects;

public class Position {

    private int posInt;

    public Position(){
        this(0);
    }
    public Position(int pos) {
        if(pos <0) throw new IllegalArgumentException("음수가 될 수 없슈");
        this.posInt = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return posInt == position.posInt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posInt);
    }


    public Position move() {
        posInt = posInt +1;
        return this;
    }

    public int getPos() {
        return posInt;
    }

    public boolean isSame(int maxPos) {
        return posInt == maxPos;
    }

    public boolean lessThan(Position maxPos) { //이거 쫌 팁이넹..ㅋㅎ

        return  maxPos.posInt > this.posInt;
    }
}
