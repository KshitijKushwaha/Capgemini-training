
public class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }      

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10000);
        vehicles[2] = new Motorcycle(150, "Petrol", "Single-Cylinder");

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    
    public void displayInfo() {
        System.out.println("Car Info:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println();
    }
}


class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    
    public void displayInfo() {
        System.out.println("Truck Info:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
        System.out.println();
    }
}

class Motorcycle extends Vehicle {
    String engineType;

    Motorcycle(int maxSpeed, String fuelType, String engineType) {
        super(maxSpeed, fuelType);
        this.engineType = engineType;
    }

    public void displayInfo() {
        System.out.println("Motorcycle Info:");
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10000);
        vehicles[2] = new Motorcycle(150, "Petrol", "Single-Cylinder");

    
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
