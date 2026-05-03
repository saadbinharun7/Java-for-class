package uap.transport;

public class MonthlyPassUser extends TransportUser{
    private double monthlyFee;

    public MonthlyPassUser(String name,String id,String route,double monthlyFee){
        super(name,id,route);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void increaseCost(double amt){
        monthlyFee += amt;
    }
    @Override
    public double getCost(){
        return monthlyFee;
    }
    @Override
    public String toString(boolean details){
        if(!details){
            return super.toString();
        }else {
            return super.toString() + "; Fee: " + monthlyFee;
        }
    }
}
