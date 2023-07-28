class Vehicle {

     void startEngine() {
        System.out.println("Starting the vehicle engine.");
    }

}

class Car extends Vehicle {
    @Override
     void startEngine() {
        System.out.print("This is the car subclass");
    }

}

class Motorcycle extends Vehicle {
    @Override
     void startEngine() {
       System.out.print("This is the motorcycle subclass");
    }

}