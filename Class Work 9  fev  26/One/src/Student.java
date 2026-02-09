import java.sql.Struct;

public class Student {
        String name;
        String id;
        String enrolledCourse;

        public Student(){

        }
        public Student(String name,String id){
            this.name = name;
            this.id = id;
        }

        public void enrolledCourse(String enrolledCourse){
            this.enrolledCourse = enrolledCourse;
        }

        public void displayInfo(){
            System.out.println("Your name is " +name);
            System.out.println("Your Enrolled course " +enrolledCourse);
            System.out.println("your id " +id);

        }

}
