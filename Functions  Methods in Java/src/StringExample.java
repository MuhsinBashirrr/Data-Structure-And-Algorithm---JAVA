public class StringExample {
    public static void main(String[] args) {
       String personalized = myGreet("Muhsin BASHIR");

        System.out.println(personalized);


    }

    static String myGreet(String name) {
        String message = "Hello" + name;
        return  message;
    }

    }

