package model;

import java.util.List;

public class Invoice {
    private String id;
    private List<Transaction> items;
    private double totalAmount;

    public Invoice() {
    }

    public Invoice(String id, List<Transaction> items) {
        this.id = id;
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        if (items == null) return 0;
        return items.stream()
                .mapToDouble(Transaction::getTotalPrice)
                .sum();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Transaction> getItems() {
        return items;
    }

    public void setItems(List<Transaction> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Invoice " + id + " - Total: " + totalAmount + " (" + (items != null ? items.size() : 0) + " items)";
    }
}
