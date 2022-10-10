package pl.uhu87.colletions.lists;

//W pliku Main02.java napisz metodę public static void removeDivider
// (List<Integer> list, int divider), która usunie z listy wszystkie elementy podzielne przez divider.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex1 {

    public static void main(String[] args) {


        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(i);
        }

        removeDivider(testList, 3);

        for (Integer i : testList)
        {System.out.println(i);}


    }

    public static void removeDivider(List<Integer> list, int divider) {

//_______________________________ver1
          //list.removeIf(i -> i%divider==0);
//_______________________________ver2

       /* Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next()%divider==0){
                it.remove();
            }
        }*/

//_______________________________ver3

        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            if(it.next()%divider==0){
                it.remove();
            }
        }

//_______________________________ConcurrentModificationException_!!!!__not allowed
          /*  for(Integer integer : list){
                if(integer%divider==0){
                    list.remove(integer);
                }

            }*/

    }
}
