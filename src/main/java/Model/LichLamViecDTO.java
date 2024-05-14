package Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LichLamViecDTO implements Serializable {
	
	@Column(name="MaNhanVien")
	private String MaNhanVien;
	@Column(name="MaCa")
	private String MaCa;
	public LichLamViecDTO(String maNhanVien, String maCa) {
		super();
		this.MaNhanVien = maNhanVien;
		this.MaCa = maCa;
	}
	public LichLamViecDTO() {
		super();
	}
	public String getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public String getMaCa() {
		return MaCa;
	}
	public void setMaCa(String maCa) {
		MaCa = maCa;
	}
	
}
