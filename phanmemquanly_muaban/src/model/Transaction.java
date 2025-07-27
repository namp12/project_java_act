package model;

import java.time.LocalDate;

public class Transaction {

	public enum Type {
		dangnhap,
		dangxuat
	}

	private String sanpham;
	private int soluong;
	private double gia; 
	private LocalDate time;
	private Type type;

	public Transaction(String sanpham, int soluong, double gia, LocalDate time, Type type) {
		this.sanpham = sanpham;
		this.soluong = soluong;
		this.gia = gia;
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

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
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

	public double getTotalPrice() {
            return soluong * gia;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"sanpham='" + sanpham + '\'' +
				", soluong=" + soluong +
				", gia=" + gia +
				", time=" + time +
				", type=" + type +
				'}';
	}
}
