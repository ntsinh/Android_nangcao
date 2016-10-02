package sinhntpk00491_lab5;

import java.io.Serializable;

public class Danhba implements Serializable{
	// Serializable: cho phép mã hóa đối tượng(để chuyển đổi dữ liệu qua lại)
	private int ma;
	private String ten;
	private String phone;
	public Danhba() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Danhba(int ma, String ten, String phone) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.phone = phone;
	}
	public Danhba(String ten, String phone) {
		super();
		this.ten = ten;
		this.phone = phone;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
	