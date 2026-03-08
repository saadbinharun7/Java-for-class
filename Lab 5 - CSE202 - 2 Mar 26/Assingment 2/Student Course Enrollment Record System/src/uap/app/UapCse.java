package uap.app;
import uap.Student;
import java.util.Scanner;

public class UapCse {
    public static void main(String[] args){
        System.out.println("\033[32m" + "Welcome to Student Course Enrollment Record System");
        Student[] students = new Student[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while(true){
            System.out.println("\033[33m" + "================================= Menu =============================");
            System.out.println("\033[93m" + "Enter ‘1’ to add a new Student.");
            System.out.println("Enter ‘2’ to enroll in a course for a student.");
            System.out.println("Enter ‘3’ to display info of a specific student.");
            System.out.println("Enter ‘4’ to display the details of all students.");
            System.out.println("Enter ‘5’ to display the details of all students registered for a specific course.");
            System.out.println("Enter ‘0’ to exit the system." + "\033[0m");
            int menu = sc.nextInt();

            if(menu == 1){
                boolean addStudent = false;
                if(count < 10) {
                    System.out.println("\033[35m" + "To add a new student: ");
                    System.out.print("\033[95m" + "Enter your name: ");
                    String name = sc.next();
                    System.out.print("Enter your ID: ");
                    String id = sc.next();
                    students[count] = new Student(name, id);
                    count++;
                    addStudent = true;
                }
                if(addStudent == true){
                    System.out.println("\033[94m" + "Student successfully added");
                }else{
                    System.out.println("\033[94m" + "Maximum Student already exists");
                }
            }
            if(menu == 2){
                System.out.println("\033[35m" + "To enroll a course: ");
                System.out.print("\033[95m" + "Enter Your Id: ");
                String idMatch = sc.next();
                boolean idFound = false;
                for(int i = 0; i < count; i++){
                    if(students[i].getId().equals(idMatch)){
                        System.out.print("Which course You want to enroll: ");
                        String course = sc.next();
                        students[i].EnrolledCourse(course);
                        idFound = true;
                        break;
                    }
                }
                if(idFound == true){
                    System.out.println("\033[94m" + "Course enrolled");
                }else{
                    System.out.println("\033[94m" + "Id mismatch");
                }
            }
            if(menu == 3){
                System.out.println("\033[35m" + "To display your info: ");
                System.out.print("\033[95m" + "Enter Your Id: ");
                String idMatch = sc.next();
                boolean idFound = false;
                for(int i = 0; i < count; i++) {
                    if (students[i].getId().equals(idMatch)) {
                        students[i].displayInfo();
                        idFound = true;
                        break;
                    }
                }
                if(idFound == true){
                    System.out.println("\n");
                }else{
                    System.out.println("\033[94m" + "Id Mismatch");
                }
            }
            if(menu == 4){
                System.out.println("Displaying all information of all students...");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                for(int i = 0; i < count; i++){
                    System.out.println("\033[96m" + "Student " +(i+1) + " Information: " + "\033[0m");
                    students[i].displayInfo();
                }
            }
            if(menu == 5){
                System.out.println("\033[35m" + "Details of all students of similar course: ");
                System.out.print("\033[95m" + "Enter Course name: ");
                String courseMatch = sc.next();
                boolean courseFound = false;
                for(int i = 0; i < count; i++) {
                    if (students[i].getCourse().equals(courseMatch)) {
                        students[i].displayInfo();
                        courseFound = true;
                    }
                }
                if(courseFound == true){
                    System.out.println("\n");
                }else{
                    System.out.println("\033[33m" + "Course unableavle");
                }
            }
            if(menu == 0){
                System.out.println("\033[94m" + "Thanks for using");
                break;
            }
        }
    }
}
