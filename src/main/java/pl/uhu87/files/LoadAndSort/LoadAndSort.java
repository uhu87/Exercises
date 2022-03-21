package pl.uhu87.files.LoadAndSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class LoadAndSort {


    public static void main(String[] args) {

        File file = new File("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\files\\LoadAndSort\\sort.txt");
        try {
            Scanner scanner = new Scanner(file);
            String[] list = new String[0];
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] newList = Arrays.copyOf(list, list.length + 1);
                newList[newList.length - 1] = line.toLowerCase(Locale.ROOT);
                list = newList;

            }
            Arrays.sort(list);
            System.out.println(Arrays.toString(list));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("no file");
        }
    }
}
