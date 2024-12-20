public class RentalTransaction {
    private String transactionId;
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double rentalCost;

    public RentalTransaction(String transactionId, Vehicle vehicle, Customer customer, int rentalDays, double rentalCost) {
        this.transactionId = transactionId;
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalCost = rentalCost;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    @Override
    public String toString() {
        return "Transaction [ID: " + transactionId + ", Vehicle: " + vehicle + ", Customer: " + customer + ", Days: " + rentalDays + ", Cost: " + rentalCost + "]";
    }
}


