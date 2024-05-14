package Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PHONG_CHIEU")
public class PHONGCHIEU {
	@Id
	@Column(name="MaPhongChieu")
	private String MaPhongChieu;
	@Column(name="TenPhong")
	private String TenPhong;
	@Column(name="MaTinhTrang")
	private String MaTinhTrang;
	public PHONGCHIEU(String maPhongChieu, String tenPhong, String maTinhTrang) {
		super();
		MaPhongChieu = maPhongChieu;
		TenPhong = tenPhong;
		MaTinhTrang = maTinhTrang;
	}
	public PHONGCHIEU() {
		super();
	}
	public String getMaPhongChieu() {
		return MaPhongChieu;
	}
	public void setMaPhongChieu(String maPhongChieu) {
		MaPhongChieu = maPhongChieu;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}
	public String getMaTinhTrang() {
		return MaTinhTrang;
	}
	public void setMaTinhTrang(String maTinhTrang) {
		MaTinhTrang = maTinhTrang;
	}
	
	
}
