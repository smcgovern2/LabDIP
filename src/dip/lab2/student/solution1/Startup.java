package dip.lab2.student.solution1;

// An useful import if you need it.

// Another useful import if you need it.


import java.text.NumberFormat;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {

 
    public static void main(String[] args) {

        TipCalculator baggage = new BaggageServiceTipCalculator(ServiceQuality.FAIR, 4);
        TipCalculator foodService = new FoodServiceTipCalculator(ServiceQuality.FAIR, 20.00);

        CalculatorApp ca = new CalculatorApp();

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("Baggage tip: " + nf.format(ca.calculateTip(baggage)));
        System.out.println("Food service tip: " + nf.format(ca.calculateTip(foodService)));

    }

}
