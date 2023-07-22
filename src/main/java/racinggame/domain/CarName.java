package racinggame.domain;

import racinggame.utils.StringUtils;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
