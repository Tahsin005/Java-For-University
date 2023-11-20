package Theory_Assignment;
class Product{
    private String name;
    private double price;
    private int quantity;

    // Constructors
    public Product(){
        this.name = "Not set";
        this.price = 0.0;
        this.quantity = 0;
    }

    

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Methods
    public double getTotalValue(){
        return price * quantity;
    }

    public void updateQuantity(int newQuantity){
        if(newQuantity >= 0){
            quantity = newQuantity;
        }
        else{
            System.out.println("Quantity cannot be negative.");
        }
    }

    private double calculateDiscount(double discountPercentage){
        return price * quantity * (discountPercentage / 100);
    }

    public void applyDiscount(double discountPercentage){
        double discountAmount = calculateDiscount(discountPercentage);
        System.out.println("Discounted amount: $" + discountAmount);
    }

    public void displayProductInfo(){
        System.out.println("Product Information: ------------------- ");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Value: $" + getTotalValue());
    }
}
public class product_class {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.displayProductInfo();

        Product p2 = new Product("Rice", 50, 10);
        p2.displayProductInfo();
        p2.applyDiscount(10.0);
    }
}
