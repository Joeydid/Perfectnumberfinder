/*
 * Perfect Number Checker
 *
 * This program first finds all perfect numbers between 1 and 200.
 * Then, it allows the user to enter an upper limit and finds perfect numbers up to that limit.
 *
 * A perfect number is a number where the sum of its proper divisors, excluding itself.
 * equals the number itself. For example, 6 is perfect because 1 + 2 + 3 = 6.
 *
 * The program uses loops and methods to efficiently find and display perfect numbers.
 * It also ensures that large numbers are handled correctly using the long data type.
 */

 import java.util.Scanner;

 public class PerfectNumberChecker {
     public static void main(String[] args) {
         // Find perfect numbers between 1 and 200 automatically
         System.out.println("Finding perfect numbers between 1 and 200...");
         findPerfectNumbers(200);  
 
         // Ask user for a custom upper limit
         try (Scanner inputScanner = new Scanner(System.in)) {
             System.out.print("\nEnter a number to find perfect numbers up to that limit: ");
             long userLimit = inputScanner.nextLong();
 
             // Run the function again for user-defined range
             findPerfectNumbers(userLimit);
         } catch (Exception e) {
             System.out.println("Invalid input. Please enter a valid number.");
         }
     }
 
     // Method that finds and prints perfect numbers up to a given limit
     public static void findPerfectNumbers(long limit) {
         for (long num = 1; num <= limit; num++) {
             long sumOfDivisors = 0;
 
             // Loop to find divisors and calculate their sum
             for (long divisor = 1; divisor < num; divisor++) {
                 if (num % divisor == 0) {
                     sumOfDivisors += divisor;
                 }
             }
 
             // If sum of divisors matches the number, it's a perfect number
             if (sumOfDivisors == num) {
                 System.out.println("Perfect number found: " + num);
             }
         }
     }
 }
 
