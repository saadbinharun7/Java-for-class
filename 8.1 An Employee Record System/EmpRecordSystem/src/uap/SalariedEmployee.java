package uap;

import java.awt.image.SampleModel;

public class SalariedEmployee extends Employee {
    public double monthlySalary;

    public SalariedEmployee(String name,String id,String designation, double monthlySalary){
        super(id,name,designation);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public void increaseSalary(double amt){
        monthlySalary += amt;
    }
    @Override
    public double getSalary(){
        return monthlySalary;
    }
    @Override
    public String toString(boolean details){
        if(!details){
            return super.toString();
        }else{
            return super.toString() +"; Salary: " +monthlySalary;
        }
    }
}
