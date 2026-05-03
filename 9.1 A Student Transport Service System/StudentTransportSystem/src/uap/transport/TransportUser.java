package uap.transport;

public abstract class TransportUser {
    private String name;
    private String id;
    private String route;

    public TransportUser(String name,String id,String route){
        this.name = name;
        this.id = id;
        this.route = route;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoute() {
        return route;
    }
    @Override
    public String toString(){
        return "Name: " + name + "; Id: " + id + "; Route: " + route;
    }
    public abstract double getCost();
    public abstract void increaseCost(double amt);
    public abstract String toString(boolean details);
}
