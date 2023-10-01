import java.util.ArrayList;

public class MinMaxCalculation {
      private static ArrayList<Double> data = new ArrayList<Double>();

      public static double min(double ... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
    
        double minimum = numbers[0];
    
        for (double num : numbers) {
            if (num < minimum) {
                minimum = num;
            }
        }
    
        return minimum;
    }

    public static double max(double ... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
    
        double maximum = numbers[0];
    
        for (double num : numbers) {
            if (num > maximum) {
                maximum = num;
            }
        }
    
        return maximum;
    }

}
