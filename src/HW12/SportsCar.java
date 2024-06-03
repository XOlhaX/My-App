package HW12;

public class SportsCar extends Car {

    @Override
    protected void startElectricity() {
        System.out.println("Sports car electricity started");
    }

    @Override
    protected void startCommand() {
        System.out.println("Sports car command started");
    }

    @Override
    protected void startFuelSystem() {
        System.out.println("Sports car fuel system started");
    }
}