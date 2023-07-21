package racingUI;

import racingGame.Car;
import racingGame.Cars;
import racingGame.NameValidation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RacingUI {
    private Cars cars;

    public void gameStart(){
        Scanner sc = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분");
        String[] input = sc.nextLine().split(",");
        while(!NameValidation.namesCheck(input)){
            System.out.println("다시 입력하세요");
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분");
            input = sc.nextLine().split(",");
        }

        cars = new Cars(input);
        System.out.println("시도할 회수는 몇회인가요?");
        int count = sc.nextInt();

        gameing(count);
        gameSet();
    }

    private void gameSet() {
        List<Car> winnerList =cars.getWinner();
        String result = winnerList.stream().map(Car::getCname).collect(Collectors.joining(", "));
        System.out.println(result+"가 최종 우승했습니다.");
    }




    private void gameing(int count) {
        while(count -- >0){
            cars.racingStart();
            System.out.println("실행결과");
            cars.getCarList().stream().forEach(car -> {
                System.out.print(car.getCname()+" : ");
                printStatus(car.getCps());
                System.out.println();
            });
        }

    }

    private void printStatus(int cps) {
        for(int i=0 ; i<cps;i++)
        System.out.print("-");
    }
}
