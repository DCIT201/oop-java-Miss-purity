public class Main {
    public static void main(String[] args) {
        // Create the Rental Agency
        RentalAgency rentalAgency = new RentalAgency();

        // Add vehicles to the fleet
        Vehicle car1 = new Car("C001", "Toyota Hilux", 50.0, 5);
        Vehicle motorcycle1 = new Motorcycle("M001", "Yamaha R15", 30.0, 150);
        Vehicle truck1 = new Truck("T001", "Ford F-150", 100.0, 2.0);

        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(motorcycle1);
        rentalAgency.addVehicle(truck1);

        // Create a customer
        Customer customer1 = new Customer("CU001", "John Doe");

        // Simulate rentals
        System.out.println("Available vehicles:");
        System.out.println(car1);
        System.out.println(motorcycle1);
        System.out.println(truck1);

        System.out.println("\nProcessing rental...");
        rentalAgency.processRental(customer1, car1, 3); // Rent the car for 3 days

        System.out.println("\nUpdated vehicle status:");
        System.out.println(car1);
        System.out.println(motorcycle1);
        System.out.println(truck1);

        // Simulate returning the vehicle
        System.out.println("\nReturning vehicle...");
        rentalAgency.returnVehicle(car1);

        System.out.println("\nUpdated vehicle status:");
        System.out.println(car1);
    }

}

