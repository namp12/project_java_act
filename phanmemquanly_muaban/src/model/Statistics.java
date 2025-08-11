package model;

import java.util.Date;

public class Statistics {
    private Date startDate;
    private Date endDate;
    private int totalTransactions;
    private double totalRevenue;
    private int totalProductsSold;

    public Statistics() {
    }

    public Statistics(Date startDate, Date endDate, int totalTransactions, double totalRevenue, int totalProductsSold) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalTransactions = totalTransactions;
        this.totalRevenue = totalRevenue;
        this.totalProductsSold = totalProductsSold;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getTotalTransactions() {
        return totalTransactions;
    }

    public void setTotalTransactions(int totalTransactions) {
        this.totalTransactions = totalTransactions;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getTotalProductsSold() {
        return totalProductsSold;
    }

    public void setTotalProductsSold(int totalProductsSold) {
        this.totalProductsSold = totalProductsSold;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalTransactions=" + totalTransactions +
                ", totalRevenue=" + totalRevenue +
                ", totalProductsSold=" + totalProductsSold +
                '}';
    }
}
