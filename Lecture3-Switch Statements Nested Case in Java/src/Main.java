import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Red in color");
            case "Orange" -> System.out.println(" A round fruit");
            case "Grapes" -> System.out.println(" A small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }


        }
    }
