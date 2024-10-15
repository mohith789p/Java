
interface Vehicle {
    void start();

    void stop();
}

interface mileage {
    void displaymileage();
}

class Bike implements Vehicle, mileage {

    @Override
    public void start() { // public is must
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");

    }

    public void displaymileage() {
        System.out.println("Bike milage is 50Km/l");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.displaymileage();
        b.stop();

    }
}