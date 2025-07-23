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
public class product {
    private String id;
    private String name;
    private LocalDate NSX;
    private LocalDate HSD;
    private int soLuong;
    private double gia;
    private String nhaSanXuat;

    public product(String id, String name, LocalDate NSX, LocalDate HSD, int soLuong, double gia, String nhaSanXuat) {
        this.id = id;
        this.name = name;
        this.NSX = NSX;
        this.HSD = HSD;
        this.soLuong = soLuong;
        this.gia = gia;
        this.nhaSanXuat = nhaSanXuat;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    
}
