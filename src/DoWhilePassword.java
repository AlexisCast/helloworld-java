import java.util.Scanner;

public class DoWhilePassword {
    public static void main(String[] args) {
        String password = "chocolate";

        System.out.println("Type in the password:");

        Scanner keyboardInput = new Scanner(System.in);


        int numberOfTries = 3;
        do {
            String userPassword = keyboardInput.nextLine();

            numberOfTries--;

            if (password.equals(userPassword)) {
                System.out.println("Welcome...");
                break;
            } else if (numberOfTries != 0) {
                System.out.println("Incorrect password..." + numberOfTries + " left");
            } else {
                System.out.println("You are blocked for maxing out your tries...");
            }
        } while (numberOfTries > 0);
    }
}
