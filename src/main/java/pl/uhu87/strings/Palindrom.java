package pl.uhu87.strings;

public class Palindrom {



    //DO POWTÓRKI

    public static void main(String[] args) {


        System.out.println(isPalindrome("Test"));
        System.out.println(isPalindrome("ka j ak"));



    }public static boolean isPalindrome(String str){

        String noSpc = str.replaceAll(" ", "").toLowerCase();
        char[]strArr = noSpc.toCharArray();
        Boolean isPalindrome = true;
        for (int i = 0; i < strArr.length; i++) {

            if(strArr[i]==strArr[strArr.length-1-i]);
            else {isPalindrome=false;}
        }

        return isPalindrome;
    }
}
