package pl.uhu87.OOP.Calculator;

import java.util.Arrays;

public class Calculator {

    private String[] results;
    public static String[] globalResults = new String[0];


    public Calculator() {
        this.results = new String[0];
    }

    public void add (int num1, int num2) {

        double sum = num1 + num2;
        String currentResult = Double.toString(sum);
        addToResults(num1 + " + " + num2 + " = " +  currentResult);

    }
    public void subtract (int num1, int num2) {

        double difference = num1 - num2;
        String currentResult = Double.toString(difference);
        addToResults(num1 + " - " + num2 + " = " +  currentResult);

    }  public void multiply (int num1, int num2) {

        double product = num1 * num2;
        String currentResult = Double.toString(product);
        addToResults(num1 + " * " + num2 + " = " +  currentResult);

    }
    public void divide (double num1, double num2) {

        double quotient = num1 / num2;
        String currentResult = Double.toString(quotient);
        addToResults(num1 + " / " + num2 + " = " +  currentResult);

    }



    public void addToResults (String currentResult) {

        String[]resultsCopy = Arrays.copyOf(globalResults, globalResults.length+1);
        resultsCopy[resultsCopy.length-1]=currentResult;
        globalResults=resultsCopy;


    }

    public void printResults (){

        for (String line: globalResults) {
            System.out.println(line);
        }
    }
}
