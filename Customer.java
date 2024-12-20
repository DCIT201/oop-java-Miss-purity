import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        if (customerId == null || customerId.isEmpty()) throw new IllegalArgumentException("Customer ID cannot be null or empty.");
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
    @Override
    public String toString() {
        return "Customer [ID: " + customerId + ", Name: " + name + "]";
    }
}


