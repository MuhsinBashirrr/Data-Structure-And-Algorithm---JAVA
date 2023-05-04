import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit){

            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Red in color");
                break;
            case "Orange":
                System.out.println(" A round fruit");
                break;
            case "Grapes":
                System.out.println(" A small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }


        }
    }
