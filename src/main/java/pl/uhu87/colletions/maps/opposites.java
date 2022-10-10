package pl.uhu87.colletions.maps;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class opposites {
    public static void main(String[] args) {

     getMap();

        int numberOfCorrectAnswers = 0;
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, String> entry : getMap().entrySet()) {
            String key = entry.getKey();
            System.out.println("what is the opposite of " + key);
            String value = entry.getValue();
            String answer = scanner.nextLine().toLowerCase();
            if(answer.equals(value)) {numberOfCorrectAnswers++;}
        }

        System.out.println("You have " +numberOfCorrectAnswers + " correct answers");

    } public static Map<String, String> getMap(){

        Map<String, String> oppositesMap = new HashMap<>();
        oppositesMap.put("hot", "cold");
        oppositesMap.put("short", "long");
        oppositesMap.put("dry", "wet");
        oppositesMap.put("small", "big");
        oppositesMap.put("happy", "sad");


        return oppositesMap;
    }
}
