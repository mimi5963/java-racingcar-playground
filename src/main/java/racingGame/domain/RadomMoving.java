package racingGame.domain;

import java.util.Random;

public class RadomMoving implements MoveStretergy{
    private static final int MAX_BOUND =10;
    private static final int MOVABLE =4;

    @Override
    public boolean moveable() {
        return getRadomNum() >= MOVABLE;
    }

    private int getRadomNum() {
        return new Random().nextInt(MAX_BOUND);
    }
}
