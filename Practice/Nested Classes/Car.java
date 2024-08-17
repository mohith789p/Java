class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    class Engine {
        int horsePower;
        String type;

        Engine(int horsePower, String type) {
            this.horsePower = horsePower;
            this.type = type;
        }

        void displayEngine() {
            System.out.println("Car Model: " + model);
            System.out.println("Engine Type: " + type + ", Horsepower: " + horsePower);
        }
    }

    void display(int horsePower, String type){
        Engine engine = new Engine(horsePower, type);
        engine.displayEngine();
    }

    public static void main(String[] args) {
        Car car = new Car("Ford Mustang");
        car.display(250,"V8");
    }
}