package model;

import java.util.Date;

public class TacGia {
	private String maTacGia;
	private String tenTacGia;
	private Date ngaySinhTacGia;
	private String tieuSu;
	public TacGia() {
		super();
	}
	public TacGia(String maTacGia, String tenTacGia, Date ngaySinhTacGia, String tieuSu) {
		super();
		this.maTacGia = maTacGia;
		this.tenTacGia = tenTacGia;
		this.ngaySinhTacGia = ngaySinhTacGia;
		this.tieuSu = tieuSu;
	}
	public String getMaTacGia() {
		return maTacGia;
	}
	public void setMaTacGia(String maTacGia) {
		this.maTacGia = maTacGia;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public Date getNgaySinhTacGia() {
		return ngaySinhTacGia;
	}
	public void setNgaySinhTacGia(Date ngaySinhTacGia) {
		this.ngaySinhTacGia = ngaySinhTacGia;
	}
	public String getTieuSu() {
		return tieuSu;
	}
	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}
	
	
}
