package pl.uhu87.multiarrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LoadFileTo2DArray {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\multiarrays\\2DArrayContent");
        Scanner scanner  = new Scanner(file);
        String [][] results = new String[1][3];

        while (scanner.hasNextLine()){

            results[results.length-1]=scanner.nextLine().split(",");                // odwroc kolejnosc, zeby najpierw byla kopia
            String[][] temp = Arrays.copyOf(results, results.length+1);
            //System.out.println(Arrays.toString(temp[results.length-1]));
            results=Arrays.copyOf(temp,temp.length);
            //System.out.println(results.length);

        }

        System.out.println(Arrays.toString(results[0]));
        System.out.println(Arrays.toString(results[1]));
        System.out.println(Arrays.toString(results[2]));
        System.out.println(Arrays.toString(results[3]));
        System.out.println(results.length);

    }

}
