package racingGame.domain;

import java.util.Objects;

public class Position {
    private int pos;
    public Position(){
        this(0);
    }
    public  Position(int i){
        this.pos =i;
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
        return new Position(this.pos+1);
    }
}
