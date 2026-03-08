package uap;

public class Student {
    private String name;
    private String id;
    private String enrolledCourse;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public void EnrolledCourse(String course){
        this.enrolledCourse = course;
    }
    public String getId(){
        return id;
    }
    public String getCourse(){
        return enrolledCourse;
    }
    public void displayInfo(){
        System.out.println("Your information: ");
        System.out.println("Your name is: " +name);
        System.out.println("Your ID no is: " +id);
        //something need to get enrolled course
    }
}
