package pl.uhu87.arrays;

public class ex1 {


    //stwórz 50-elementową tablicę o nazwie mainTab z kolejnymi liczbami całkowitymi od 0 do 49,
    //wypisz na konsoli po kolei elementy tej tablicy, po dziesięć w każdym wierszu,
    //liczby jednocyfrowe uzupełnij dodatkowym zerem na początku (np. 03).

    public static void main(String[] args) {


        int[] maintab = new int[50];
        for (int i = 0; i < maintab.length; i++) {
            maintab[i] = i;
        }
        //System.out.println(Arrays.toString(maintab));

        int counter = 0;
        for (int i = 0; i < maintab.length; i++) {
            if (counter % 10 == 0 && counter != 0) {
                System.out.println();
            }
            if (maintab[i] < 10) {
                System.out.print("0" + maintab[i] + ", ");
            } else {
                System.out.print(maintab[i] + ", ");
            }
            counter++;
        }

        System.out.println(" \n  _____ Solution 2 ______ \n");

        int counter2 = 0;
        for (int i = 0; i < maintab.length; i++) {
            if (maintab[i] < 10) {
                System.out.print("0" + maintab[i] + ", ");
            } else {
                System.out.print(maintab[i] + ", ");
            }
            counter2++;
            if (counter2 == 10) {
                System.out.println();
                counter2 = 0;
            }


        }
    }
}
