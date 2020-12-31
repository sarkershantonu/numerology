package org.numerology;

public class NumberUtils {
    public static int convertIntoSingleDigit(int input_bing_number){
        int result =input_bing_number%9;
        if(result==0)
            return 9;
        else
            return result;
    }
}
