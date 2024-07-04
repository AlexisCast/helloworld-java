public class WhilePasswordGenerator {
    public static void main(String[] args) {
        String characters = "0123456789abcdefjhijk!@#$%^&*()";
        String password = "";

        int amountOfCharacters = 10;
        int counter = 0;

        while (counter < amountOfCharacters) {
            counter++;
            double random = Math.random();
            random = Math.floor(random * characters.length());
            int number = (int) random;
            password += characters.charAt(number);
            //password += number;
        }
        System.out.println(password);
    }
}
