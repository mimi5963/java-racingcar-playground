package racingGame;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private Carname cname;
    private Carposition cps;

    public Car(String name){
        this.cname = new Carname(name);
        this.cps = new Carposition(0);
    }

    public String getCname() {
        return cname.getName();
    }

    public int getCps() {
        return cps.getPs();
    }

    public void setCps(int new_cps) {
        if(new_cps >=4)
        this.cps.goforward();
    }

    @Override
    public int compareTo(Car o) {
        return this.getCps() - o.getCps();
    }

    @Override
    public boolean equals(Object o){
        if(this ==o)return true;
        if(o ==null || this.getClass() != o.getClass())return false;
        Car o1 =(Car)o;
        return cname.getName() == o1.cname.getName() && cps.getPs() == o1.getCps();
    }


    @Override
    public int hashCode(){
        return Objects.hash(cname.getName(),cps.getPs());
    }
}
