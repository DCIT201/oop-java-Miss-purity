
public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleId, String model, double baseRentalRate, int seatingCapacity) {
        super(vehicleId, model, baseRentalRate);
        if (seatingCapacity <= 0) throw new IllegalArgumentException("Seating capacity must be positive.");
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days; // Simple daily rate
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}


