package pl.uhu87.algorithms;

public class BinaryTreeLongestBranchLength {


    public static void main(String[] args) {


       int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};

        int branchLength = 0;
        int currentSideLength = 1;
        int power = 0;


        while (numbers.length>=currentSideLength) {

            if(numbers.length<=1)
            {System.out.println(branchLength);break;}

            int lengthCounter = (int)Math.pow(2, power);

            int [] leftSide = new int [currentSideLength+lengthCounter];
            currentSideLength = leftSide.length;
            branchLength++;


            if(numbers.length>currentSideLength)
            {
            } else {System.out.println(branchLength);break;
            }

            int [] rightSide = new int[leftSide.length+lengthCounter];
            currentSideLength = rightSide.length;
            branchLength++;


            if(numbers.length>currentSideLength)
            {
            } else {System.out.println(branchLength);break;
                }
            power++;

        }
    }
}
