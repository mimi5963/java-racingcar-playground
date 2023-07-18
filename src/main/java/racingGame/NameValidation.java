package racingGame;

import java.util.Arrays;

public class NameValidation {
   private final static int MAX_LEN =5;
   private final static int MIN_LEN =1;
    public static boolean lengthcheck(String name) {
        return name.length() >= MIN_LEN && name.length() <= MAX_LEN ;
    }

    public static boolean namesCheck(String[] namearr) {
        return Arrays.stream(namearr).allMatch(NameValidation::lengthcheck);
    }
}
