package model;

import java.util.Date;
import java.util.List;

public class Transaction {
    private String transactionId;
    private List<Product> productList;
    private double totalAmount;
    private Date transactionDate;
    private User createdBy;  // Người thực hiện giao dịch

    public Transaction() {
    }

    public Transaction(String transactionId, List<Product> productList, double totalAmount, Date transactionDate, User createdBy) {
        this.transactionId = transactionId;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.transactionDate = transactionDate;
        this.createdBy = createdBy;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", productList=" + productList +
                ", totalAmount=" + totalAmount +
                ", transactionDate=" + transactionDate +
                ", createdBy=" + createdBy +
                '}';
    }
}
