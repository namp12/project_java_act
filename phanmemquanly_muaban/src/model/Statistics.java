/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Phuong Nam
 */
public class Statistics {
     private String[] productNames;
    private int[] quantitiesSold;
    private double totalRevenue;
    private double totalProfit;

    public Statistics(String[] productNames, int[] quantitiesSold, double totalRevenue, double totalProfit) {
        this.productNames = productNames;
        this.quantitiesSold = quantitiesSold;
        this.totalRevenue = totalRevenue;
        this.totalProfit = totalProfit;
    }

    public String[] getProductNames() {
        return productNames;
    }

    public void setProductNames(String[] productNames) {
        this.productNames = productNames;
    }

    public int[] getQuantitiesSold() {
        return quantitiesSold;
    }

    public void setQuantitiesSold(int[] quantitiesSold) {
        this.quantitiesSold = quantitiesSold;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistics{\n");
        for (int i = 0; i < productNames.length; i++) {
            sb.append("  ").append(productNames[i]).append(": ").append(quantitiesSold[i]).append(" units\n");
        }
        sb.append("  Total Revenue: ").append(totalRevenue).append("\n");
        sb.append("  Total Profit: ").append(totalProfit).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
