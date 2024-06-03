package HW12;

public class PassengerCar extends Car {

    @Override
    protected void startElectricity() {
        System.out.println("Passenger car electricity started");
    }

    @Override
    protected void startCommand() {
        System.out.println("Passenger car command started");
    }

    @Override
    protected void startFuelSystem() {
        System.out.println("Passenger car fuel system started");
    }
}