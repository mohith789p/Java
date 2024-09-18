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
        Car myCar = new Car();
        myCar.start();
    }
}
