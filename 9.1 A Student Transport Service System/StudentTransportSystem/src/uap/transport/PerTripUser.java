package uap.transport;

public class PerTripUser extends TransportUser{
    private double tripRate;
    private int tripCountPerMonth;

    public PerTripUser(String name,String id,String route,double tripRate,int tripCountPerMonth){
        super(name,id,route);
        this.tripCountPerMonth = tripCountPerMonth;
        this.tripRate = tripRate;
    }

    public double getTripRate() {
        return tripRate;
    }

    public int getTripCountPerMonth() {
        return tripCountPerMonth;
    }

    public void setTripCountPerMonth(int tripCountPerMonth) {
        this.tripCountPerMonth = tripCountPerMonth;
    }

    public void setTripRate(double tripRate) {
        this.tripRate = tripRate;
    }
    @Override
    public void increaseCost(double amt){
        tripRate += amt;
    }
    @Override
    public double getCost(){
        return tripCountPerMonth*tripRate;
    }
    @Override
    public String toString(boolean details){
        if(!details){
            return super.toString();
        }else{
            return super.toString() + "; Rate: " + tripRate;
        }
    }
}
