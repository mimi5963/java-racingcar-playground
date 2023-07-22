package racinggame.domain;

import java.util.Objects;

public class Position {

    private int pos;

    public Position(){
        this(0);
    }
    public Position(int pos) {
        if(pos <0) throw new IllegalArgumentException("음수가 될 수 없슈");
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return pos == position.pos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos);
    }


    public Position move() {
        pos =pos+1;
        return this;
    }

    public int getPos() {
        return pos;
    }

    public boolean isSame(int maxPos) {
        return pos == maxPos;
    }

    public boolean lessThan(Position maxPos) {
        return false;
    }
}
