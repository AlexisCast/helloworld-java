import java.util.Scanner;

public class Over18 {
    public static void main(String[] args){

        System.out.println("Enter your age:");

        Scanner keyboardInput=new Scanner(System.in);

        int age=keyboardInput.nextInt();

        if(age>=18){
            System.out.println("You are old enough");
        }else{
            System.out.println("You are Not old enough");
        }
    }
}
