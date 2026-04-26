package uap;

public class HourlyEmployee extends Employee{
    private double hourlRate;
    private double hourWorkedPerMonth;

    public HourlyEmployee(String id,String name,String designation, double hourlRate, double hourWorkedPerMonth){
        super(id,name,designation);
        this.hourlRate = hourlRate;
        this.hourWorkedPerMonth = hourWorkedPerMonth;
    }

    public double getHourWorkedPerMonth() {
        return hourWorkedPerMonth;
    }

    public void setHourWorkedPerMonth(double hourWorkedPerMonth) {
        this.hourWorkedPerMonth = hourWorkedPerMonth;
    }

    public double getSalary(int hWorked) {
        return hWorked * hourlRate;
    }

    @Override
    public void increaseSalary(double amt){
        hourlRate += amt;
    }
    @Override
    public double getSalary(){
        return hourWorkedPerMonth * hourlRate;
    }
    @Override
    public String toString(boolean details){
        if(!details){
            return super.toString();
        }else{
            return super.toString() +"; Rate: " +hourlRate;
        }
    }
}
