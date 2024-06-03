package HW12;

public class MyCar {

    public static void main(String[] args) {

        Employee employee = new Employee("Olga", "Nazarenko","QA Engineer", "olga@example.com", "+380501234567", 22);
        System.out.println(employee.getFullName());

        Car truck = new Truck();
        Car passengerCar = new PassengerCar();
        Car sportsCar = new SportsCar();

        System.out.println("\nStarting the truck:");
        truck.start();

        System.out.println("\nStarting the passenger car:");
        passengerCar.start();

        System.out.println("\nStarting the sports car:");
        sportsCar.start();
    }
}