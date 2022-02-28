package pl.uhu87.arrays;

/*
1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
        2. stwórz drugą tablicę, nazwij ją `secondNumbers`, wypełnij 10 dowolnymi liczbami,
        3. stwórz trzecią tablicę zawierającą sumy elementów, które mają w tablicach pozycję o tym samym indeksie.

*/


import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {

        int[]numbers = {1,2,4,6,7,};
        int[]secindMumbers = {1,2,4,6,7,};
        int[]sums = new int[numbers.length];

        for (int i = 0; i < sums.length; i++) {
            sums[i]=numbers[i]+secindMumbers[i];
        }
        System.out.println(Arrays.toString(sums));



    }
}
