
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empID = input.nextInt();
        String department = input.next();

        //BETTER WAY TO WRITE SWITCH CASES WITH THIS ENHANCED SWITCH

        switch (empID) {
            case 1 -> System.out.println("Muhsin Bashir");
            case 2 -> System.out.println("Eagle");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department addded");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }

}
