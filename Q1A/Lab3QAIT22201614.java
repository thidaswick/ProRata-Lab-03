import java.util.Scanner;
public class Lab3QAIT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price;
        double kilograms;
        double total;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = input.nextDouble();

        total = price * kilograms;

        System.out.println("The total amount is: " + total);
    }
}
