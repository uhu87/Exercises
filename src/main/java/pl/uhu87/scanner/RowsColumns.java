package pl.uhu87.scanner;


/*
 `public static void rowsColumns()`, która:

        1. wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych `rows` i `columns`,
        2. stworzy tablicę o podanej liczbie wierszy i kolumn,
        3. wypełni tablicę kolejnymi liczbami całkowitymi,
        4. obliczy i wyświetli na konsoli sumę wszystkich elementów,
        5. obliczy i wyświetli na konsoli średnią wszystkich elementów.
        Wywołaj metodę w metodzie `main`.
*/


import java.util.Arrays;
import java.util.Scanner;

public class RowsColumns {

    public static void main(String[] args) {

        rowsColumns();


} public static void rowsColumns () {

    Scanner scanner = new Scanner(System.in);

    int rows = 0;
    int columns = 0;
    rows = scanner.nextInt();
    columns = scanner.nextInt();
    int counter = 0;
    int sum = 0;
    int [][] numbers = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
        for (int i1 = 0; i1 < columns; i1++) {

            numbers[i][i1]=counter;
            counter++;
            sum+=counter;
        }
        System.out.println(Arrays.toString(numbers[i]));

    }

    System.out.println(counter +" "+sum);


        /*Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int [][] intArr = new int[rows][columns];
        int filler = 1;
        int totalSum = 0;
        double avg = 0;

        for (int i = 0; i<rows;i++) {
            int sum = 0;

            for (int y = 0; y<columns; y++) {
                intArr[i][y] = filler;
                sum = sum + filler;
                filler++;

                //System.out.print(intArr[i][y]);
            }
            System.out.println(Arrays.toString(intArr[i]));
            //System.out.println(sum);
            totalSum += sum;
            avg = totalSum/(rows*columns);
        }
        System.out.println("suma wszystkich elementow to: " + totalSum);
        System.out.println("srednia wszystkich elementow to: " + avg);*/

}
}
