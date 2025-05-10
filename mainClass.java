package parkingvechicles;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        parkingLot plot = new parkingLot();
        System.out.println("Building the parking lot...");
        
        while (true) {
            System.out.print("Do you want to add a floor? (yes or no): ");
            String ans = input.nextLine();
            if (ans.equalsIgnoreCase("yes")) plot.addfloortoParkingLot();
            else break;
            System.out.println("Floor has been successfully added.");
        }

        plot.displayTotalFloors();

        while (true) {
            System.out.println("Do you want to add slots to a floor? (yes or no): ");
            String ans = input.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Enter the floor number where you want to add slots: ");
                int floorNo = input.nextInt();
                input.nextLine(); // Clear the newline
                floor f1 = plot.isFloorAvailable(floorNo);
                if (f1 == null) {
                    System.out.println("Sorry, the specified floor does not exist.");
                    break;
                }
                System.out.println("Enter the slot type (e.g., car, bike): ");
                String slotType1 = input.nextLine();
                System.out.println("How many slots do you want to allocate for " + slotType1 + "?");
                int slotNo1 = input.nextInt();
                input.nextLine(); // Clear the newline
                f1.addSlot(slotType1, slotNo1);
            } else break;
        }

        System.out.println("All parking lot details:");
        plot.displayAll();
        System.out.println("Parking lot is ready. You may start parking your vehicles.");

        CustomerDetails customerss = new CustomerDetails();

        while (true) {
            System.out.println("Do you want to park a vehicle? (yes or no): ");
            String ans = input.nextLine();
            if (ans.equalsIgnoreCase("no")) break;

            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter the type of vehicle you want to park: ");
            ans = input.nextLine();
            System.out.println("Checking availability, please wait...");
            int avail = plot.isCustomerCanPark(ans);
            if (avail == 0) {
                System.out.println("Sorry, no slots are currently available for your vehicle type.");
                break;
            }
            System.out.println("Slot available! You can park your vehicle on Floor " + avail + ".");

            System.out.println("Enter your phone number: ");
            long phno = input.nextLong();
            input.nextLine();
            System.out.println("Generating your parking ticket...");
            customer customer1 = new customer(name, phno, ans, avail, "parked", customerss);
            System.out.println("Your Token Number: " + customer1.getToken());
            customerss.addDetails(customer1);
            System.out.println("Customer parking details recorded successfully.");
        }

        System.out.println("List of all currently parked customers:");
        customerss.displayAllCustomer();

        System.out.println("Proceeding to vehicle un-parking section...");
        while (true) {
            System.out.println("Do you want to unpark your vehicle? (yes or no): ");
            String ans = input.nextLine();
            if (ans.equalsIgnoreCase("no")) break;
            System.out.println("Please enter your parking token number: ");
            int token = input.nextInt();
            input.nextLine();
            if (customerss.isAvailable(token, plot)) {
                System.out.println("Vehicle successfully unparked. Thank you for using our service!");
            }
        }

        System.out.println("Final list of all customer parking records:");
        customerss.displayAllCustomer();
        System.out.println("Thank you for using our parking system!");
    }
}
