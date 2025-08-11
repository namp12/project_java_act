/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Phuong Nam
 */
public class Product {
   private String id;
   private String name;
   private double price;
   private LocalDate NSX;
   private LocalDate HSD;
   private int quantity;
   private Supplier supplier;

    public Product() {
    }

    public Product(String id, String name, double price, LocalDate NSX, LocalDate HSD, int quantity, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.NSX = NSX;
        this.HSD = HSD;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getNSX() {
        return NSX;
    }

    public void setNSX(LocalDate NSX) {
        this.NSX = NSX;
    }

    public LocalDate getHSD() {
        return HSD;
    }

    public void setHSD(LocalDate HSD) {
        this.HSD = HSD;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", NSX=" + NSX +
                ", HSD=" + HSD +
                ", quantity=" + quantity +
                ", supplier=" + supplier +
                '}';
    }
}
