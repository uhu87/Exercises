package pl.uhu87.arrays;

import java.util.Arrays;


/*

1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy,
        której rozmiar ma być 2-krotnie większy od tablicy podanej.
        2. Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
        3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
        Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};
*/


public class ex6 {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};


        System.out.println(Arrays.toString(append(arr)));

    }

    public static int[] append (int[] arr) {


        int[]tempArr = new int[arr.length*2];
        for (int i = 0; i < tempArr.length; i++) {

            if(i<arr.length){tempArr[i]=arr[i];}
            else {tempArr[i]=arr[tempArr.length-i-1];}

        }
        return tempArr;
    }
}
