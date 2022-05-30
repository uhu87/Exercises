package pl.uhu87.algorithms;

public class BinaryTreeLongestBranchLength {


    public static void main(String[] args) {


       int [] numbers = {1,2,3,4,5, 6};

        int branchLength = 0;
        int currentSideArrayLength = 1;
        int power = 0;


        while (numbers.length>=currentSideArrayLength) {

            //____________________________________for 0 and 1
            if(numbers.length<=1)
            {System.out.println(branchLength);break;}




            int lengthCounter = (int)Math.pow(2, power);

            //____________________________________leftSide

            int leftSideLength = currentSideArrayLength+lengthCounter;
            currentSideArrayLength = leftSideLength;
            branchLength++;

            if(numbers.length>currentSideArrayLength)
            {
            } else {System.out.println(branchLength);break;
            }


            //___________________________________rightSide


            int rightSideLength = leftSideLength+lengthCounter;
            currentSideArrayLength = rightSideLength;
            branchLength++;


            if(numbers.length>currentSideArrayLength)
            {
            } else {System.out.println(branchLength);break;
                }
            power++;

        }
    }
}
