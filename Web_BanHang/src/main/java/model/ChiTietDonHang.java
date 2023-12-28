package model;

public class ChiTietDonHang {
	private String maChiTietDonHang;
	private String maDonHang;
	private String maSanPham;
	private int soLuong;
	private double giaGoc;
	private int giamGia;
	private double giaBan;
	private double thueVAT;
	private double tongThanhTien;
	public ChiTietDonHang() {
		super();
	}
	public ChiTietDonHang(String maChiTietDonHang, String maDonHang, String maSanPham, int soLuong, double giaGoc,
			int giamGia, double giaBan, double thueVAT, double tongThanhTien) {
		super();
		this.maChiTietDonHang = maChiTietDonHang;
		this.maDonHang = maDonHang;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
		this.giaGoc = giaGoc;
		this.giamGia = giamGia;
		this.giaBan = giaBan;
		this.thueVAT = thueVAT;
		this.tongThanhTien = tongThanhTien;
	}
	public String getMaChiTietDonHang() {
		return maChiTietDonHang;
	}
	public void setMaChiTietDonHang(String maChiTietDonHang) {
		this.maChiTietDonHang = maChiTietDonHang;
	}
	public String getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getGiaGoc() {
		return giaGoc;
	}
	public void setGiaGoc(double giaGoc) {
		this.giaGoc = giaGoc;
	}
	public int getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getThueVAT() {
		return thueVAT;
	}
	public void setThueVAT(double thueVAT) {
		this.thueVAT = thueVAT;
	}
	public double getTongThanhTien() {
		return tongThanhTien;
	}
	public void setTongThanhTien(double tongThanhTien) {
		this.tongThanhTien = tongThanhTien;
	}
	
	
}
