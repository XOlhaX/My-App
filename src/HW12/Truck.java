package HW12;

public class Truck extends Car {

    @Override
    protected void startElectricity() {
        System.out.println("Truck electricity started");
    }

    @Override
    protected void startCommand() {
        System.out.println("Truck command started");
    }

    @Override
    protected void startFuelSystem() {
        System.out.println("Truck fuel system started");
    }
}