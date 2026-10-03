import java.util.Scanner;

public class Lab3QBIT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price;
        double kilograms;
        double total;
        double discount;
        double finalAmount;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = input.nextDouble();

        total = price * kilograms;

        discount = total * 0.10;

        finalAmount = total - discount;

        System.out.println("The total amount with 10% discount is: " + finalAmount);
    }
}