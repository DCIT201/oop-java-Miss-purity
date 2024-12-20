import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        fleet = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (!vehicle.isAvailable()) {
            throw new IllegalStateException("Vehicle is not available for rental.");
        }
        double cost = vehicle.calculateRentalCost(days);
        vehicle.setAvailable(false);
        RentalTransaction transaction = new RentalTransaction("T" + (transactions.size() + 1), vehicle, customer, days, cost);
        transactions.add(transaction);
        customer.addRentalTransaction(transaction);
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
    }
}


