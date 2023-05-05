import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println(" Weekdays");
            case 6, 7 -> System.out.println(" Weekends");
            default -> System.out.println("Please enter a valid day");
        }


        }
    }
