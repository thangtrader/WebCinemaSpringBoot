package Model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="CHI_TIET_PHIEU_PHIM")
public class PHIEU implements Serializable {
	@Id
	@Column(name="MaPhieu")
	private String MaPhieu;
	@Column(name="MaLoaiPhieu")
	private String MaLoaiPhieu;
	@Column(name="MaNhanVien")
	private String MaNhanVien;
	@Column(name="NgayLapPhieu")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date NgayLapPhieu;
	public PHIEU(String maPhieu, String maLoaiPhieu, String maNhanVien, Date ngayLapPhieu) {
		super();
		MaPhieu = maPhieu;
		MaLoaiPhieu = maLoaiPhieu;
		MaNhanVien = maNhanVien;
		NgayLapPhieu = ngayLapPhieu;
	}
	public PHIEU() {
		super();
	}
	public String getMaPhieu() {
		return MaPhieu;
	}
	public void setMaPhieu(String maPhieu) {
		MaPhieu = maPhieu;
	}
	public String getMaLoaiPhieu() {
		return MaLoaiPhieu;
	}
	public void setMaLoaiPhieu(String maLoaiPhieu) {
		MaLoaiPhieu = maLoaiPhieu;
	}
	public String getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public Date getNgayLapPhieu() {
		return NgayLapPhieu;
	}
	public void setNgayLapPhieu(Date ngayLapPhieu) {
		NgayLapPhieu = ngayLapPhieu;
	}
	
	
}
