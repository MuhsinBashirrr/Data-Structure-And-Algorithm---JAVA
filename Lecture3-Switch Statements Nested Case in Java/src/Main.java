import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println(" Wednesday");
            case 4 -> System.out.println(" Thursday");
            default -> System.out.println("Please enter a valid day");
        }


        }
    }
