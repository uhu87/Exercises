package pl.uhu87.strings;

import java.util.Arrays;

public class TwoElements {


    public static void main(String[] args) {
        String testStr = "Java-zadania-na-podzial-napisow";
        char sign = '-';
        System.out.println(Arrays.toString(onlyTwoElements(testStr, sign)));


    }public static String[] onlyTwoElements(String str, char separator) {


        String [] arr = new String[2];
        String [] splitArr = str.split(Character.toString(separator));
        arr[0] = splitArr[0];
       /* StringBuilder sb = new StringBuilder();
        for (int i = 1; i < splitArr.length; i++) {
            sb.append(splitArr[i]);
        }
        */


        arr[1]=str.substring(arr[0].length());
        return arr;
    }
}
