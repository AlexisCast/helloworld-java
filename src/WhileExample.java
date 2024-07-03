import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args){
        System.out.println("You will exit when you type 0...");

        Scanner keyboardInput = new Scanner(System.in);
        int number=1;
        while(number!=0){
            number=keyboardInput.nextInt();
            if(number!=0){
                System.out.println(number+" is not '0");
            }else{
                System.out.println("Exiting the while loop...");
            }
        }
    }
}
