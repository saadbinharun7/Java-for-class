package uap;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public Company(String companyName){
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String id,String name,String  designation,double monthlySalary){
        employees.add(new SalariedEmployee(id,name,designation,monthlySalary));
    }
    public void addEmployee(String id,String name,String  designation,double hourlyRate, int hourWorked){
        employees.add(new HourlyEmployee(id,name,designation,hourlyRate,hourWorked));
    }

    public Employee findEmployee(String id){
        for(Employee e : employees){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    public void increaseSalary(String id, double amount){
        Employee e = findEmployee(id);
        if(e != null){
            e.increaseSalary(amount);
        }else{
            System.out.println("Employee not found.");
        }
    }

    public double getSalary(String id){
        Employee e = findEmployee(id);
        if(e != null){
            e.getSalary();
        }
        System.out.println("Employee not found.");
        return -1;
    }

    public void getEmployees(boolean salaried){
        for(Employee e : employees){
            if(salaried && e instanceof SalariedEmployee){
                System.out.println(e.toString(false));
            } else if (!salaried && e instanceof HourlyEmployee) {
                System.out.println(e.toString(false));
            }
        }
    }

    public String getCompanyName(){
        return companyName;
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }
}
