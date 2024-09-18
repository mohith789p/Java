class Vehicle {

    void start(){
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle{

    void start(){
        System.out.println("Car Started");
    }
    
}

public class Inheritance{
    public static void main(String[] args){
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        myVehicle.start();
        myCar.start();
    }
}
