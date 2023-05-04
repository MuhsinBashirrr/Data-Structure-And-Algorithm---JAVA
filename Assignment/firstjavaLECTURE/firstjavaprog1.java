//Write a program to print whether a number is even or odd, also take input from the user.

package firstjavaLECTURE;

import java.util.Scanner;

public class firstjavaprog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");

        int n = input.nextInt();

        if(n % 2 == 0){
            System.out.println(n + "is even");
        } else {
            System.out.println(n + "is odd");
        }

    }

}
