package stringplus;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Strcal {

    public static int getSum(String s) {
        if(StringValidation.nullcheck(s))
        return 0;

        int result = getStringsum(s);
        return result;
    }

    private static int getStringsum(String s) {

        int result;
        List<Integer> intList = getIntList(s);
        result = intList.stream().reduce(0,Integer::sum).intValue();

        return result;
    }

    private static List<Integer> getIntList(String s) {
        List<Integer> tempList;
        String[] stringarr  = splitStringWithregex(s);
        StringValidation.numberCheck(stringarr);
        tempList = Arrays.stream(stringarr)
                 .map(Integer::parseInt).collect(Collectors.toList());
        return tempList;
    }

    private static String[] splitStringWithregex(String s) {
        String[] temp=s.split(",|:");

        if(!s.startsWith("//")) {
            return temp;
        }

        Matcher m = Pattern.compile("//(.*)\n(.*)").matcher(s);
        if(m.find()){
            String customDelimiter = m.group(1);
            temp = m.group(2).split(customDelimiter);
        }

        return temp;
    }


}
