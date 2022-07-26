package pl.uhu87.OOP.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        calculator.add(2,3);
        calculator.divide(1,3);
        calculator.subtract(1,2);
        calculator.multiply(5, 5);
        advancedCalculator.pow(2,4);
        advancedCalculator.add(2,4);
        calculator.printResults();

    }
}
