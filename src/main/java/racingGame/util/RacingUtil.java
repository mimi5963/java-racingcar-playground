package racingGame.util;

public class RacingUtil {
    private static final int MAX_LENGTH = 5;
    private static final int MIN_LENGTH =1;
    public static boolean nameIsEmpty(String s) {
        return s.equals("")||s==null;
    }
    public static boolean vaildLength(String s){
        return s.length() >= MIN_LENGTH && s.length() <=MAX_LENGTH;
    }

    public static String[] splitName(String names) {
        return names.split(",");
    }
}
