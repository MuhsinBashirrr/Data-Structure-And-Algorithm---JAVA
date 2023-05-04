//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class firstprogram4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number:");
        double num2 = input.nextDouble();

        System.out.println("Enter operator (+,-,*,/):");
        char operator = input.next().charAt(0);

        double result = 0.0;

        if(operator == '+') {
            result = num1 + num2;
        } else if(operator == '-') {
            result = num1 - num2;
        } else if(operator == '*') {
            result = num1 * num2;
        } else if(operator == '/') {
            if(num2 == 0) {
                System.out.println("Error: Cannot divide by zero");
                return;
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("Error: Invalid operator");
            return;
        }
        
        System.out.println(result);
    }
}
