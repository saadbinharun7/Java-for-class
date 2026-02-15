public class UapBazar {
        public static void main(String[] args) {

            Product product = new Product("dontknow", 212, 9999, 0);
            System.out.println("Current Price: " +product.getPrice());
            product.updatePrice(255);
            product.displayInfo();
            product.setDiscountPercentage(20);
            double discountedPrice = product.getDiscountedPrice();
            System.out.println("Discounted Price: " +discountedPrice);
        }
}
