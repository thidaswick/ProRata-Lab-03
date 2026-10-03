import java.util.Scanner;

public class Lab3Q2IT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double monthlySalary;
        double otHours;
        double otHourlyRate;
        double otAmount;
        double totalSalary;

        System.out.print("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        otHours = input.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        otHourlyRate = input.nextDouble();

        otAmount = otHours * otHourlyRate;

        totalSalary = monthlySalary + otAmount;

        System.out.println("The total salary including OT is: " + totalSalary);
    }
}
