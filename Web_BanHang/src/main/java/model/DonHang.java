package model;

import java.util.Date;

public class DonHang {
	private String maDonHang;
	private String maKhachHang;
	private String diaChiHoaDon;
	private String diaChiNhanHang;
	private String trangThai;
	private String hinhThucThanhToan;
	private String soTienDaThanhToan;
	private String soTienConThieu;
	private Date ngayDatHang;
	private Date ngayGiaoHang;
	public DonHang() {
		super();
	}
	public DonHang(String maDonHang, String maKhachHang, String diaChiHoaDon, String diaChiNhanHang, String trangThai,
			String hinhThucThanhToan, String soTienDaThanhToan, String soTienConThieu, Date ngayDatHang,
			Date ngayGiaoHang) {
		super();
		this.maDonHang = maDonHang;
		this.maKhachHang = maKhachHang;
		this.diaChiHoaDon = diaChiHoaDon;
		this.diaChiNhanHang = diaChiNhanHang;
		this.trangThai = trangThai;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.soTienDaThanhToan = soTienDaThanhToan;
		this.soTienConThieu = soTienConThieu;
		this.ngayDatHang = ngayDatHang;
		this.ngayGiaoHang = ngayGiaoHang;
	}
	public String getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getDiaChiHoaDon() {
		return diaChiHoaDon;
	}
	public void setDiaChiHoaDon(String diaChiHoaDon) {
		this.diaChiHoaDon = diaChiHoaDon;
	}
	public String getDiaChiNhanHang() {
		return diaChiNhanHang;
	}
	public void setDiaChiNhanHang(String diaChiNhanHang) {
		this.diaChiNhanHang = diaChiNhanHang;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}
	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}
	public String getSoTienDaThanhToan() {
		return soTienDaThanhToan;
	}
	public void setSoTienDaThanhToan(String soTienDaThanhToan) {
		this.soTienDaThanhToan = soTienDaThanhToan;
	}
	public String getSoTienConThieu() {
		return soTienConThieu;
	}
	public void setSoTienConThieu(String soTienConThieu) {
		this.soTienConThieu = soTienConThieu;
	}
	public Date getNgayDatHang() {
		return ngayDatHang;
	}
	public void setNgayDatHang(Date ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}
	public Date getNgayGiaoHang() {
		return ngayGiaoHang;
	}
	public void setNgayGiaoHang(Date ngayGiaoHang) {
		this.ngayGiaoHang = ngayGiaoHang;
	}
	
	
}
