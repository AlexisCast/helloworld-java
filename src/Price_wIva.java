import java.util.Scanner;

public class Price_wIva {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter the price to calculate with 21% of IVA");

        float price = keyboardInput.nextFloat();

        float iva = 21;

        float ivaOfPrice = (iva * 50) / 100;

        float finalPrice = price - ivaOfPrice;

        System.out.println("Final price: $" + finalPrice);

    }
}
