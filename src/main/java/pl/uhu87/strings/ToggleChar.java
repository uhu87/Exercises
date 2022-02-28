package pl.uhu87.strings;

public class ToggleChar {

    public static void main(String[] args) {

        System.out.println(toggleChar("Ko Wal Ski"));

    }  static String toggleChar(String str) {


        char[] arr = str.toCharArray();
        String newWord = "";
        for (char c : arr) {
            if (Character.isUpperCase(c)) {
                newWord += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                newWord += Character.toUpperCase(c);
            } else if (c==' '){newWord+=c;};
        }
        return newWord;
    }
}
