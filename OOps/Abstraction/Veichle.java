abstract class Vehicle {
    int no_Of_Tyres;

    Vehicle(int no_Of_Tyres) {
        this.no_Of_Tyres = no_Of_Tyres;
    }

    void displayTypres() {
        System.out.println("No of tyres: " + no_Of_Tyres);
    }

    abstract void start();
}

class Car extends Vehicle {

    Car() {
        super(4);
    }

    void start() {
        System.out.println("Starts with a key.");
    }
}

class Scooter extends Vehicle {

    Scooter() {
        super(2);
    }

    void start() {
        System.out.println("Starts with kick.");
    }
}

class MainApp1 {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.displayTypres();
        car.start();

        System.out.println();

        Vehicle scooter = new Scooter();
        scooter.displayTypres();
        scooter.start();
    }
}