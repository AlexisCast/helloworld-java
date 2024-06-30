import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Type something in the keyboard: ");

        Scanner keyboardInput = new Scanner(System.in);
        String variable = keyboardInput.nextLine();

        System.out.println("Your variable: " + variable);
    }
}
