import java.util.*;

// Base class
class Vehicle {
    private String brand;
    private String country_of_origin;
    private double base_price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Country of Origin: ");
        country_of_origin = sc.nextLine();
        System.out.print("Enter Base Price: ");
        base_price = sc.nextDouble();
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Country of Origin: " + country_of_origin);
        System.out.println("Base Price: " + base_price);
    }

    double getBasePrice() {
        return base_price;
    }
}

// Subclass
class Car extends Vehicle {
    private String model;
    private double speed;
    private double market_price;

    void read() {
        Scanner sc = new Scanner(System.in);

        input(); // parent method

        sc.nextLine(); // clear buffer
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Speed (km/hr): ");
        speed = sc.nextDouble();

        calculateMarketPrice();
    }

    void calculateMarketPrice() {
        double base = getBasePrice();
        if (speed > 80) {
            market_price = base + (0.15 * base);
        } else {
            market_price = base + (0.05 * base);
        }
    }

    void show() {
        display();
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Market Price: " + market_price);
    }
}

// Main class (FIX)
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.read();
        System.out.println("\nCar Details:");
        c.show();
    }
}