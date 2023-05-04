//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package firstjavaLECTURE;

import java.util.Scanner;

public class firstprogram3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * time * rate) / 100;

        // Display the result
        System.out.println("Simple interest = " + simpleInterest);
    }
}