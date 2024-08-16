class Car {
    private String model;
    private int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void updateCar(Car car) {
        this.model = car.model;
        this.year = car.year;
    }

    void updateCar(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Model = " + model + ", Year = " + year);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car mycar = new Car("Toyota", 2020);
        System.out.print("Original Car: ");
        mycar.displayInfo();

        Car newcar = new Car("Honda", 2022);
        mycar.updateCar(newcar);
        System.out.print("Updated Car (from object): ");
        mycar.displayInfo();

        mycar.updateCar("Ford", 2023);
        System.out.print("Updated Car (from parameters): ");
        mycar.displayInfo();

    }
}