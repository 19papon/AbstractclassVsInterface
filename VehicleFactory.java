interface ElectricPowered {
    void chargeBattery();
}

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void startEngine();

    void stopEngine() {
        System.out.println(brand + ": Engine stopped.");
    }
}

class ElectricCar extends Vehicle implements ElectricPowered {
    ElectricCar(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println(brand + ": Electric engine started.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(brand + ": Charging battery...");
    }
}

class PetrolBike extends Vehicle {
    PetrolBike(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println(brand + ": Petrol engine started.");
    }
}



public class VehicleFactory {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla");
        PetrolBike yamaha = new PetrolBike("Yamaha");

        tesla.startEngine();
        tesla.chargeBattery();
        tesla.stopEngine();

        System.out.println("------------");

        yamaha.startEngine();
        yamaha.stopEngine();
    }
}
