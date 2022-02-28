package pl.uhu87.strings;


public class ex2 {
    public static void main(String[] args) {

        String str = "Kot";


        System.out.println(reversedString(str));


    }

    public static String reversedString (String str){

        char[]strArr = str.toCharArray();
        String reversedString = "";
        for (int i = strArr.length-1; i >= 0; i--) {
            reversedString=reversedString+strArr[i];
        }

        return reversedString;
    }

}
