import java.util.Scanner;

public class IT24102303Lab5Q3 {
    public static void main(String[] args) {
        int ROOM_CHARGE_PER_DAY = 48000;
        int MIN_DAY = 1;
        int MAX_DAY = 31;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Start date and end date must be between 1 and 31
        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            return; // Exit the program
        }

        // Validation 2: Start date should be less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End Date");
            return; // Exit the program
        }

        int daysReserved = endDate - startDate;

        // Determine discount rate based on number of days reserved
        double discountRate;
        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 0.10;
        } else {
            discountRate = 0.20;
        }

        // Calculate total amount
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - discountRate);

        // Output results
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + ".00");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
