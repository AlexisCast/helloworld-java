import java.util.Scanner;

public class Rule50_30_20 {
    public static void main(String[] args) {

        //  50: Needs
        //  30: Things we want
        //  20: savings

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter your salary:");

        float salary = keyboardInput.nextFloat();

        float needs = salary * .5f;

        float otherThings = salary * .3f;

        float savings = salary * .2f;

        System.out.println("Structure your salary in the following way from $" + salary + ":");
        System.out.println("Needs: " + needs);
        System.out.println("Things we want: " + otherThings);
        System.out.println("Savings: " + savings);

    }
}
