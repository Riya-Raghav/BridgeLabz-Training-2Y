class Product {
    static double discount = 10.0;
    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", ID: " + productID + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2, 111);
        Product p2 = new Product("Phone", 30000, 1, 112);
        p1.display();
        p2.display();
        updateDiscount(15);
        p1.display();
    }
}
