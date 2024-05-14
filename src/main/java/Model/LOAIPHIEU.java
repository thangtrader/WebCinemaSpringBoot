package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LOAI_PHIEU")
public class LOAIPHIEU {
	@Id
	@Column(name="MaLoaiPhieu")
	private String MaLoaiPhieu;
	@Column(name="TenLoaiPhieu")
	private String TenLoaiPhieu;
	
	public LOAIPHIEU() {
	
	}
	public LOAIPHIEU(String maLoaiPhieu, String tenLoaiPhieu) {
		super();
		MaLoaiPhieu = maLoaiPhieu;
		TenLoaiPhieu = tenLoaiPhieu;
	}
	
	public String getMaLoaiPhieu() {
		return MaLoaiPhieu;
	}
	public void setMaLoaiPhieu(String maLoaiPhieu) {
		MaLoaiPhieu = maLoaiPhieu;
	}
	public String getTenLoaiPhieu() {
		return TenLoaiPhieu;
	}
	public void setTenLoaiPhieu(String tenLoaiPhieu) {
		TenLoaiPhieu = tenLoaiPhieu;
	}
	
	
}
