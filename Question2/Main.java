

import java.util.Scanner;
class Product {
    private int pid;
    private double price;
    private int quantity;


    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }


        int highestPriceIndex = findHighestPriceProductIndex(products);
        if (highestPriceIndex != -1) {
            int highestPricePid = products[highestPriceIndex].getPid();
            System.out.println("PID of the product with the highest price: " + highestPricePid);
        }


        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);


    }


    private static int findHighestPriceProductIndex(Product[] products) {
        if (products.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > products[maxIndex].getPrice()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}