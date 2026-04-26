package uap.app;

import uap.Company;
import uap.Employee;

import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Company company = new Company("UAP HR");

        while(true){
            System.out.println("======" +company.getCompanyName() +"=====");
            System.out.println("Enter '1' to Add Employee");
            System.out.println("Enter '2' to increase the salary/rate of an employee");
            System.out.println("Enter '3' to view the monthly salary of any employee");
            System.out.println("Enter '4' to view the info of a specific employee");
            System.out.println("Enter '5' to view the details of all employees (only basic info)");
            System.out.println("Enter '6' to exit");
            System.out.println("\n Choose Option: ");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("What type of Employee?");
                System.out.println("Enter '1' for Salaried Employee");
                System.out.println("Enter '2' for Hourly Employee");
                System.out.println("Enter: ");
                int type = sc.nextInt();
                System.out.println("ID: ");
                String id = sc.next();
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Designation: ");
                String designation = sc.next();

                if(type == 1){
                    System.out.println("Monthly Salary: ");
                    double salary = sc.nextDouble();
                    company.addEmployee(id,name,designation,salary);
                    System.out.println("Employee added");
                } else if (type == 2) {
                    System.out.println("Hourly Rate: ");
                    double rate = sc.nextDouble();
                    System.out.println("Hours per month: ");
                    int hrs = sc.nextInt();
                    company.addEmployee(id,name,designation,rate,hrs);
                    System.out.println("Employee added");
                } else{
                    System.out.println("Invalid type");
                }
            }
            else if(choice == 2){
                System.out.println("Employee ID: ");
                String id = sc.next();
                System.out.println("Increase amount: ");
                double amt = sc.nextDouble();
                System.out.println("Done.");
            }
            else if(choice == 3){
                System.out.print("Employee ID: ");
                String id = sc.next();
                double sal = company.getSalary(id);
                if (sal >= 0){
                    System.out.println("Monthly Salary: " + sal);
                }
            }
            else if (choice == 4){
                System.out.print("Employee ID: ");
                String id = sc.next();
                System.out.print("Show details? (y/n): ");
                String d = sc.next();
                Employee e = company.findEmployee(id);
                if (e != null) {
                    System.out.println(e.toString(d.equalsIgnoreCase("y")));
                }
                else {
                    System.out.println("Not found.");
                }
            }
            else if (choice == 5) {
                System.out.println("-- Salaried --");
                company.getEmployees(true);
                System.out.println("-- Hourly --");
                company.getEmployees(false);
            }
            else if (choice == 6) {
                System.out.println("Thanks for using");
                return;
            }
            else{
                System.out.println("Invalid option");
            }
        }
    }
}
