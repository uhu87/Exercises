package pl.uhu87.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class addTwoNumbersFromReveredLinkedListsBETA {
    public static void main(String[] args) {
        

            List<Integer>list1 = new LinkedList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
        
            List<Integer>list2 = new LinkedList<>();
            list1.add(1);
            list2.add(2);
            list2.add(3);

            LinkedList <Integer> myList = addTwoNumbersFromTwoLists(list1, list2);

        System.out.println(myList);
           

    }

        public static LinkedList addTwoNumbersFromTwoLists(List<Integer> l1, List<Integer> l2) {
        

                
                StringBuilder sB = new StringBuilder();
                for (int i = l1.size()-1; i >= 0; i--) {
                    sB.append(String.valueOf(l1.get(i)));
                }
                String numberOne = sB.toString();




                StringBuilder sB2 = new StringBuilder();
                for (int i = l2.size()-1; i >= 0; i--) {
                    sB2.append(String.valueOf(l2.get(i)));
                }

                String numberTwo = sB2.toString();


                int result = Integer.parseInt(numberOne)+Integer.parseInt(numberTwo);
                String textResult = String.valueOf(result);

                LinkedList<Integer>myList = new LinkedList<>();

                char[]charArr = textResult.toCharArray();
                for (int i = charArr.length-1; i >= 0; i--) {
                    myList.add(Integer.parseInt(String.valueOf(charArr[i])));
                };

               return myList;

        }


    }

