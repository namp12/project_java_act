/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Map;

/**
 *
 * @author Phuong Nam
 */
public class Statistics {
    private double totalRevenue;
    private int totalProductsSold;
    private Map<String, Integer> productSalesCount; // productName → quantity sold

    public Statistics() {}

    public Statistics(double totalRevenue, int totalProductsSold, Map<String, Integer> productSalesCount) {
        this.totalRevenue = totalRevenue;
        this.totalProductsSold = totalProductsSold;
        this.productSalesCount = productSalesCount;
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

    public Map<String, Integer> getProductSalesCount() {
        return productSalesCount;
    }

    public void setProductSalesCount(Map<String, Integer> productSalesCount) {
        this.productSalesCount = productSalesCount;
    }
    
    
    @Override
    public String toString() {
        return "Doanh thu: " + totalRevenue + " | Sản phẩm bán: " + totalProductsSold;
    }
}
