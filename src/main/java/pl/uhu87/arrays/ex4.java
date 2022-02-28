package pl.uhu87.arrays;

/*
1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
        2. posortuj rosnąco tablicę wykorzystując metody klasy `Arrays`,
        3. wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy `Arrays`.*/


import java.util.Arrays;
import java.util.Random;

public class ex4 {

    public static void main(String[] args) {


        Random random = new Random();

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=random.nextInt(20);
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
