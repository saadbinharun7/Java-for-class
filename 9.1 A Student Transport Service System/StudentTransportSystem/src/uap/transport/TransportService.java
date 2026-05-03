package uap.transport;

import java.util.ArrayList;

public class TransportService{
    private String serviceName;
    private ArrayList<TransportUser> users;

    public TransportService(String serviceName){
        this.serviceName = serviceName;
        users = new ArrayList<>();
    }

    public void addUser(MonthlyPassUser user){
        users.add(user);
    }
    public void addUser(PerTripUser user) {
        users.add(user);
    }

    public TransportUser findUser(String id) {
        for (TransportUser u : users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public void increaseCost(String id, double amount) {
        TransportUser user = findUser(id);
        if (user != null) {
            user.increaseCost(amount);
        }
    }
    public double getCost(String id) {
        TransportUser user = findUser(id);
        if (user != null) {
            return user.getCost();
        }
        return 0;
    }
    public ArrayList<TransportUser> getUsers(boolean monthly) {
        ArrayList<TransportUser> result = new ArrayList<>();

        for (TransportUser u : users) {
            if (monthly && u instanceof MonthlyPassUser) {
                result.add(u);
            } else if (!monthly && u instanceof PerTripUser) {
                result.add(u);
            }
        }
        return result;
    }
    public ArrayList<TransportUser> getAllUsers() {
        return users;
    }

    public String getServiceName() {
        return serviceName;
    }
}
