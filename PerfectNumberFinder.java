import java.util.Scanner;

public class PerfectNumberFinder {
    public static void main(String[] args) {
        // Initialize scanner to take user input (needed to read the upper limit)
        Scanner userInputScanner = new Scanner(System.in);
        
        // Ask the user for an upper limit
        // This is the maximum number we'll check for perfect numbers
        System.out.print("Enter the upper limit for checking perfect numbers: ");
        long upperLimit = userInputScanner.nextLong();
        
        // Start checking numbers from 2 upwards (we skip 1 since it's not a perfect number)
        for (long currentNumber = 2; currentNumber <= upperLimit; currentNumber++) {
            long divisorSum = 0;  // Sum of all divisors of the current number
            
            // Find divisors of the current number
            // Every number is divisible by 1, so we start with 1 as the first divisor
            for (long divisor = 1; divisor < currentNumber; divisor++) {
                if (currentNumber % divisor == 0) {
                    divisorSum += divisor; 
                }
            }

            if (divisorSum == currentNumber) {
                System.out.println("Perfect number found: " + currentNumber);  // Print if it's a perfect number
            }
        }
        
        userInputScanner.close();  
    }
}
