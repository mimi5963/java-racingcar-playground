package racinggame.domain;

import racinggame.utils.StringUtils;

public class CarName {
    private final String name;

    public CarName(String name){
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException("공백");
        }
        if(name.length() >5){
            throw  new IllegalArgumentException("길이");
        }
        this.name = name.trim();
    }
}
