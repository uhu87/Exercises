package pl.uhu87.OOP.Calculator;

public class AdvancedCalculator extends Calculator{


    public void pow (double num1, double num2){

        double powResult = Math.pow(num1, num2);
        String currentResult = Double.toString(powResult);
        addToResults(num1 + " to the power of " + num2 + " = " +  currentResult);
    }
}
