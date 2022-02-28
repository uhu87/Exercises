package pl.uhu87.arrays;

import java.util.Arrays;

/*ARRAY OF UNIQUE ELEMENTS*/

public class ex7 {

    public static void main(String[] args) {

        int[] tab = {1, 3, 10, 7, 1, 10, 10, 6, 8, 8, 3, 1};


        System.out.println(Arrays.toString(returnUnique(tab)));

    }
    public static int[] returnUnique(int[]arr) {

        Arrays.sort(arr);
        int[]uniqueArr = new int [1];
        uniqueArr[0]=arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                int[]tempArr = Arrays.copyOf(uniqueArr,uniqueArr.length+1);
                tempArr[tempArr.length-1]=arr[i+1];
                uniqueArr=tempArr;
            }
        }
        return uniqueArr;
    }

}
