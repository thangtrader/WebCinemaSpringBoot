package Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ChiTietPhieuPhimDTO implements Serializable {
	
	@Column(name="MaPhieu")
	private String MaPhieu;
	
	@Column(name="MaPhim")
	private String MaPhim;
	
	public ChiTietPhieuPhimDTO() {

	}
	public ChiTietPhieuPhimDTO(String maPhieu, String maPhim) {

		MaPhieu = maPhieu;
		MaPhim = maPhim;
	}
	public String getMaPhieu() {
		return MaPhieu;
	}
	public void setMaPhieu(String maPhieu) {
		MaPhieu = maPhieu;
	}
	public String getMaPhim() {
		return MaPhim;
	}
	public void setMaPhim(String maPhim) {
		MaPhim = maPhim;
	}
	
	
}
