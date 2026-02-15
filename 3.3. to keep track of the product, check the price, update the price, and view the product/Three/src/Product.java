public class Product {
    String name;
    int id;
    double price;
    double discountPercentage;

    public Product(String name, int id, double price, double discountPercentage) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }
    public void updatePrice(double newPrice) {
        price = newPrice;
    }
    public double getPrice() {
        return price;
    }
    public void setDiscountPercentage(double discPercentage) {
        discountPercentage = discPercentage;
    }
    public double getDiscountedPrice() {
        return price - (price * discountPercentage / 100);
    }
    public void displayInfo() {
        System.out.println("Product Name: " +name);
        System.out.println("Product ID: " +id);
        System.out.println("Price: " +price);
        System.out.println("Discount: " +discountPercentage + "%");
    }
}
