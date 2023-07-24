package racingGame.domain;

import racingGame.util.RacingUtil;

public class CarName {
    private final String name;
    public CarName(String name){
        if(RacingUtil.nameIsEmpty(name) || !RacingUtil.vaildLength(name)){
            throw new IllegalArgumentException("차의 이름이 공백이거나, 길이 초과 입니다.");
        }
            this.name=name;
    }
}
