package model;

import java.util.Date;
import java.util.List;

public class Invoice {
    private String invoiceId;
    private List<Product> productList;
    private double totalAmount;
    private Date issueDate;
    private User issuedBy;  // Người lập hóa đơn
    private String customerName;  // Tên khách hàng

    public Invoice() {
    }

    public Invoice(String invoiceId, List<Product> productList, double totalAmount, Date issueDate, User issuedBy, String customerName) {
        this.invoiceId = invoiceId;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.issueDate = issueDate;
        this.issuedBy = issuedBy;
        this.customerName = customerName;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public User getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(User issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", productList=" + productList +
                ", totalAmount=" + totalAmount +
                ", issueDate=" + issueDate +
                ", issuedBy=" + issuedBy +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
