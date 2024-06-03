package HW12;

public abstract class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    protected abstract void startElectricity();
    protected abstract void startCommand();
    protected abstract void startFuelSystem();
}