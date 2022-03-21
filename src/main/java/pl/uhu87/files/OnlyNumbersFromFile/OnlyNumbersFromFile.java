package pl.uhu87.files.OnlyNumbersFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class OnlyNumbersFromFile {
   /* napisz program, który będzie wczytywał kolejne linie tekstu z pliku tekstowego
    wypełnionego poniższą zawartością:

            ````
            1.1, 1.2, 1.3, 2.0, 1.8
            1.3, aa, 4.5, 6.7, 2.1
            3.5, 7.7, 9.9, 4.1, 2.1
            ````

    Jeżeli dane są poprawnymi danymi liczbowymi, program policzy ich sumę, jeśli nie – ma je pomijać.
    Następnie sumę ma zostać wypisana na konsoli.*/

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\files\\OnlyNumbersFromFile\\numbers.txt");
        Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNextLine()) {
            String[] next = scanner.nextLine().replaceAll(",", "").split(" ");
            for (String s : next
            ) {
                if (isNumeric(s) == true) {
                    sum += Double.parseDouble(s);
                }
            }
        }

        System.out.println(sum);
    }
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
