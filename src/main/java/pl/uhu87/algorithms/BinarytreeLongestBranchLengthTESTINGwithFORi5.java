package pl.uhu87.algorithms;

public class BinarytreeLongestBranchLengthTESTINGwithFORi5 {


    public static void main(String[] args) {


       int [] numbers = {1,2};

        int branchLength = 0;
        int currentSideLenght = 1;



        for (int i = 0; i < 5; i++) {

            if(numbers.length<=1)
            {System.out.println(branchLength);break;}

            int lengthCounter = (int)Math.pow(2, i);

            int [] leftSide = new int [currentSideLenght+lengthCounter];
            currentSideLenght = leftSide.length;
            branchLength++;
            System.out.println(leftSide.length + ", branch lenght:" + branchLength);

            if(numbers.length>currentSideLenght)
            {

            } else {System.out.println(branchLength);break;
            }

            int [] rightSide = new int[leftSide.length+lengthCounter];
            currentSideLenght = rightSide.length;
            branchLength++;

            System.out.println(rightSide.length + ", branch lenght:" + branchLength);
            System.out.println("____________");

            if(numbers.length>currentSideLenght)
            {

            } else {System.out.println(branchLength);break;
                }


        }
    }
}
