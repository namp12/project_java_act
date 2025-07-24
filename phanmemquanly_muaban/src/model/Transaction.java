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
public class Transaction {
	public enum Type {
		dangnhap,
		dãnguat
	}

	private String sanpham;
	private int soluong;
	private LocalDate time;
	private Type type;

	public Transaction(String sanpham, int soluong, LocalDate time, Type type) {
		this.sanpham = sanpham;
		this.soluong = soluong;
		this.time = time;
		this.type = type;
	}

	public String getSanpham() {
		return sanpham;
	}

	public void setSanpham(String sanpham) {
		this.sanpham = sanpham;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

    @Override
    public String toString() {
        return "Transaction{" + "sanpham=" + sanpham + ", soluong=" + soluong + ", time=" + time + ", type=" + type + '}';
    }
}
