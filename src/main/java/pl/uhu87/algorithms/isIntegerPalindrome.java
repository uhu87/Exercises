package pl.uhu87.algorithms;

public class isIntegerPalindrome {
    public static void main(String[] args) {
        

            System.out.println(isPalindrome(1000021));



    } public static boolean isPalindrome(int x) {

        String intToString = String.valueOf(x);
        char [] arr = intToString.toCharArray();
        boolean isPalindrom = false;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[arr.length-i-1]){
                isPalindrom=true;}
            else {isPalindrom = false; break;}
        }
        return isPalindrom;
    }
}
