package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="THE_LOAI_PHIM")
public class THELOAIPHIM {
	@Id
	@Column(name="MaTheLoaiPhim")
	private String maTheLoaiPhim;
	@Column(name="TenTheLoaiPhim")
	private String tenTheLoaiPhim;
	public THELOAIPHIM(String maTheLoaiPhim, String tenTheLoaiPhim) {
		super();
		this.maTheLoaiPhim = maTheLoaiPhim;
		this.tenTheLoaiPhim = tenTheLoaiPhim;
	}
	public THELOAIPHIM() {
		super();
	}
	public String getMaTheLoaiPhim() {
		return maTheLoaiPhim;
	}
	public void setMaTheLoaiPhim(String maTheLoaiPhim) {
		this.maTheLoaiPhim = maTheLoaiPhim;
	}
	public String getTenTheLoaiPhim() {
		return tenTheLoaiPhim;
	}
	public void setTenTheLoaiPhim(String tenTheLoaiPhim) {
		this.tenTheLoaiPhim = tenTheLoaiPhim;
	}
	public String toString() {
		return this.tenTheLoaiPhim;
	}
	
}
