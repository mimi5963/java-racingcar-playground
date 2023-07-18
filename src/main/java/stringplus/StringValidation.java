package stringplus;

import java.util.Arrays;

public class StringValidation {
    public static boolean nullcheck(String s) {
        return s == null || s.equals("");
    }

    public static void numberCheck(String[] stringarr) {
        Arrays.stream(stringarr).map(String::toCharArray).forEach(chars -> {
            for(char ch : chars){
                if(ch <'0' || ch>'9')
                    throw new RuntimeException("nagative and non-number are not acceptable");
            }
        });
    }
}
