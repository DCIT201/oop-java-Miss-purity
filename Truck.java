public class Truck extends Vehicle {
    private double loadCapacity; // in tons

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        if (loadCapacity <= 0) throw new IllegalArgumentException("Load capacity must be positive.");
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRentalRate() + (loadCapacity * 50)) * days; // Extra charge for load
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
