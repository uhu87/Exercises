package pl.uhu87.arrays;


/*1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
        2. stwórz zmienną tablicową `reverse` i umieść w niej elementy tablicy `numbers` w odwrotnej kolejności,
        3. wypisz na konsoli elementy z tablicy `reverse`.*/


import java.util.Arrays;
import java.util.Random;

public class ex3 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=random.nextInt(20);
        }


        int[]reversedNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            reversedNumbers[i]=numbers[numbers.length-i-1];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reversedNumbers));

    }
}
