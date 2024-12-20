public class Motorcycle extends Vehicle {
    private double engineCapacity; // in CC

    public Motorcycle(String vehicleId, String model, double baseRentalRate, double engineCapacity) {
        super(vehicleId, model, baseRentalRate);
        if (engineCapacity <= 0) throw new IllegalArgumentException("Engine capacity must be positive.");
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.9; // Discount for motorcycles
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}

