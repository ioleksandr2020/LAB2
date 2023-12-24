

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private int shelfLife;
    private int quantity;

    public Product(int id, String name, String manufacturer, double price, int shelfLife, int quantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iPhone 13", "Apple", 999.99, 365, 50));
        products.add(new Product(2, "Samsung Galaxy S21", "Samsung", 799.99, 365, 40));
        products.add(new Product(3, "Sony Bravia 4K TV", "Sony", 1299.99, 730, 30));
        products.add(new Product(4, "Dell XPS 13", "Dell", 1299.99, 365, 25));
        products.add(new Product(5, "HP Spectre x360", "HP", 1099.99, 365, 35));
        products.add(new Product(6, "LG OLED TV", "LG", 1999.99, 730, 20));
        products.add(new Product(7, "Canon EOS Rebel T7i", "Canon", 799.99, 365, 15));
        products.add(new Product(8, "Bose QuietComfort 35 II", "Bose", 349.99, 365, 10));
        products.add(new Product(9, "Microsoft Surface Laptop 4", "Microsoft", 1299.99, 365, 28));
        products.add(new Product(10, "Sony PlayStation 5", "Sony", 499.99, 365, 22));
        products.add(new Product(11, "Xbox Series X", "Microsoft", 499.99, 365, 18));
        products.add(new Product(12, "Amazon Echo Dot", "Amazon", 49.99, 365, 40));
        products.add(new Product(13, "Google Pixel 6", "Google", 699.99, 365, 30));
        products.add(new Product(14, "Fitbit Charge 5", "Fitbit", 179.99, 365, 25));
        products.add(new Product(15, "Nintendo Switch", "Nintendo", 299.99, 365, 20));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. List of products with a specific name");
            System.out.println("2. List of products with a specific name and price not exceeding a certain amount");
            System.out.println("3. List of products with a shelf life greater than a specified value");
            System.out.println("4. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Enter the product name:");
                    String searchName = scanner.next();
                    for (Product product : products) {
                        if (product.getName().toLowerCase().contains(searchName.toLowerCase())) {
                            System.out.println(product.getName() + " - " + product.getManufacturer() + " - " + product.getPrice());
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Enter the product name:");
                    String searchName2 = scanner.next();
                    System.out.println("Enter the maximum price:");
                    double maxPrice = scanner.nextDouble();
                    for (Product product : products) {
                        if (product.getName().toLowerCase().contains(searchName2.toLowerCase()) && product.getPrice() <= maxPrice) {
                            System.out.println(product.getName() + " - " + product.getManufacturer() + " - " + product.getPrice());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Enter the minimum shelf life:");
                    int minShelfLife = scanner.nextInt();
                    for (Product product : products) {
                        if (product.getShelfLife() > minShelfLife) {
                            System.out.println(product.getName() + " - " + product.getManufacturer() + " - " + product.getShelfLife());
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using the program!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
