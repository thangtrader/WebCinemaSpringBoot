package Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="CHINH_SACH")
public class CHINHSACH implements Serializable{
	@Id
	@Column(name="MaChinhSach")
	private String maChinhSach;
	@Column(name="TenChinhSach")
	private String tenChinhSach;
	@Column(name="HeSoLuong")
	private float heSoLuong;
	@Column(name="BHXH")
	private String bhxh;
	@Column(name="TienThuong")
	private int tienThuong;
	
	public CHINHSACH() {

	}

	public CHINHSACH(String maChinhSach, String tenChinhSach, float heSoLuong, String bhxh, int tienThuong) {
		super();
		this.maChinhSach = maChinhSach;
		this.tenChinhSach = tenChinhSach;
		this.heSoLuong = heSoLuong;
		this.bhxh = bhxh;
		this.tienThuong = tienThuong;
	}

	public String getMaChinhSach() {
		return maChinhSach;
	}

	public void setMaChinhSach(String maChinhSach) {
		this.maChinhSach = maChinhSach;
	}

	public String getTenChinhSach() {
		return tenChinhSach;
	}

	public void setTenChinhSach(String tenChinhSach) {
		this.tenChinhSach = tenChinhSach;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getBhxh() {
		return bhxh;
	}

	public void setBhxh(String bhxh) {
		this.bhxh = bhxh;
	}

	public int getTienThuong() {
		return tienThuong;
	}

	public void setTienThuong(int tienThuong) {
		this.tienThuong = tienThuong;
	}
	
}
