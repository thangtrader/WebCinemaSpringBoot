package Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table (name ="CHI_TIET_PHIEU_PHIM")
public class CHITIETPHIEUPHIM implements Serializable{
	
    @EmbeddedId
    private ChiTietPhieuPhimDTO id;

    @ManyToOne
    @MapsId("MaPhim")
    @JoinColumn(name = "MaPhim")
    private PHIM phim;
    
    @ManyToOne
    @MapsId("MaPhieu")
    @JoinColumn(name = "MaPhieu")
    private PHIEU phieu;
    
	@Column(name="DonViTinh")
	private String donViTinh;
	
	@Column(name="SoLuong")
	private int soLuong;
	
	public CHITIETPHIEUPHIM() {
		super();
	}
	public CHITIETPHIEUPHIM(PHIEU Phieu, PHIM Phim, String donViTinh, int soLuong) {
		super();
		this.phieu = Phieu;
		this.phim = Phim;
		this.donViTinh = donViTinh;
		this.soLuong = soLuong;
	}
	public PHIEU getPhieu() {
		return phieu;
	}
	public void setPhieu(PHIEU Phieu) {
		this.phieu = Phieu;
	}
	public PHIM getPhim() {
		return phim;
	}
	public void setPhim(PHIM Phim) {
		this.phim = Phim;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}
