package pl.uhu87.arrays;



/*
1. przy użyciu pętli `for` stwórz tablicę o nazwie `randNumbers`,
 zawierającą 20 losowych liczb z zakresu `0-100` (do otrzymania losowej wartości użyj sposobu opisanego w snippetach),
 2. wypisz w konsoli minimalną wartość z tablicy.
*/


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ex2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[]randNumbers = new int[20];


        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i]=random.nextInt(101);
        }

        Integer min = randNumbers[0];
        for (int i = 0; i < randNumbers.length; i++) {
            if(min>randNumbers[i]){min=randNumbers[i];}
        }

        System.out.println(Arrays.toString(randNumbers));
        System.out.println(min);
    }

}
