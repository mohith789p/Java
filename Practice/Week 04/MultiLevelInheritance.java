class Animal {

    void makeSound(){}
}

class Dog extends Vehicle{
    // override
     void makeSound(){
        System.out.println("Woof!");
    }
    
}

class Puppy extends Dog{
    // override
    @Override
     void makeSound(){
        System.out.println("Yap!");
    }
    
}

public class MultiLevelInheritance{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Puppy myPuppy = new Puppy();
        myAnimal.makeSound();
        myDog.makeSound();
        myPuppy.makeSound();
    }
}
