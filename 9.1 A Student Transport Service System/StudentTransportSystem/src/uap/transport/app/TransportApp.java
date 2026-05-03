package uap.transport.app;

import uap.transport.*;
import java.util.Scanner;

public class TransportApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransportService service = new TransportService("UAP Transport");

        while (true) {
            System.out.println("\n\n======= UAP Transport Service =======");
            System.out.println("\n1. Add User");
            System.out.println("2. Increase Fee");
            System.out.println("3. View Cost");
            System.out.println("4. View Specific User");
            System.out.println("5. View All Users");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Monthly  2. Per Trip");
                    int type = sc.nextInt();
                    sc.next();

                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("ID: ");
                    String id = sc.next();
                    System.out.print("Route: ");
                    String route = sc.next();

                    if (type == 1) {
                        System.out.print("Monthly Fee: ");
                        double fee = sc.nextDouble();
                        service.addUser(new MonthlyPassUser(name, id, route, fee));
                    } else {
                        System.out.print("Trip Rate: ");
                        double rate = sc.nextDouble();
                        System.out.print("Trip Count: ");
                        int count = sc.nextInt();
                        service.addUser(new PerTripUser(name, id, route, rate, count));
                    }
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String id2 = sc.next();
                    System.out.print("Increase Amount: ");
                    double amt = sc.nextDouble();
                    service.increaseCost(id2, amt);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String id3 = sc.next();
                    System.out.println("Cost: " + service.getCost(id3));
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    String id4 = sc.next();
                    TransportUser u = service.findUser(id4);
                    if (u != null)
                        System.out.println(u.toString(true));
                    else
                        System.out.println("User not found");
                    break;

                case 5:
                    for (TransportUser user : service.getAllUsers()) {
                        System.out.println(user.toString(true));
                    }
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}