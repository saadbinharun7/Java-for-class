package uap;

public abstract class Employee {
    private String name;
    private String id;
    private String designation;

    public Employee(String name,String id,String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
    @Override
    public String toString(){
        return "Name: " +name+ "; Id: " +id+ "; Designation: " +designation;
    }
    public abstract double getSalary();
    public abstract void increaseSalary(double amt);
    public abstract String toString(boolean details);
}
