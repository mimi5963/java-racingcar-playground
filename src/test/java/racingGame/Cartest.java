package racingGame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
public class Cartest {

//    @Test
//    void twoCarAndWinner(){
//        List<Car> carlist = new ArrayList<>();
//        carlist.add(new Car("asdf",1));
//        carlist.add(new Car("ssss",2));
//
//        //Cars cg = new Cars(carlist);
//
//        List<Car> winerList = cg.getWinner();
//        assertThat(winerList.get(0).getCname()).isEqualTo("ssss");
//    }
//@Test
//void carsWinerTest(){
//    List<Car> carlist = new ArrayList<>();
//    carlist.add(new Car("asdf",1));
//    carlist.add(new Car("ssss",2));
//    carlist.add(new Car("sss2",2));
//    Cars cg = new Cars(carlist);
//    List<Car> winnerList = cg.getWinner();
//    assertThat(winnerList.size()).isEqualTo(2);
//}
    @Test
    void Carname(){
        Carposition ps =new Carposition(1);
    }

    @Test
    void CarsTest(){
        String[] input ={"s1","s2","s3","s4","s5"};
        Cars cars = new Cars(input);
        assertThat(cars.getCarList().size()).isEqualTo(5);
        assertThat(cars.getCarList().get(0).equals(new Car("s1"))).isTrue();
    }

    @Test
    void gofoward(){
       Carposition cp = new Carposition(0);
       cp.goforward();
       assertThat(cp.getPs()).isEqualTo(1);
    }
}
