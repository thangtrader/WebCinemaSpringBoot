package Model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LICH_CHIEU")
public class LICHCHIEU implements Serializable {
	@Id
	@Column(name="NgayChieu")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date NgayChieu;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaPhim")
	private PHIM MaPhim;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MaPhongChieu")
	private PHONGCHIEU MaPhongChieu;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MaKhungGioChieu")
	private KHUNGGIOCHIEU MaKhungGioChieu;
    
	@Column(name="TrangThai")
	private String TrangThai;
	
	public LICHCHIEU(PHIM maPhim, PHONGCHIEU maPhongChieu, KHUNGGIOCHIEU maKhungGioChieu,
			Date ngayChieu, String trangThai) {
		super();
		MaPhim = maPhim;
		MaPhongChieu = maPhongChieu;
		MaKhungGioChieu = maKhungGioChieu;
		NgayChieu = ngayChieu;
		TrangThai = trangThai;
	}
	public LICHCHIEU() {
		super();
	}
	
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	public PHIM getMaPhim() {
		return MaPhim;
	}
	public void setMaPhim(PHIM maPhim) {
		MaPhim = maPhim;
	}
	public PHONGCHIEU getMaPhongChieu() {
		return MaPhongChieu;
	}
	public void setMaPhongChieu(PHONGCHIEU maPhongChieu) {
		MaPhongChieu = maPhongChieu;
	}
	public KHUNGGIOCHIEU getMaKhungGioChieu() {
		return MaKhungGioChieu;
	}
	public void setMaKhungGioChieu(KHUNGGIOCHIEU maKhungGioChieu) {
		MaKhungGioChieu = maKhungGioChieu;
	}
	public Date getNgayChieu() {
		return NgayChieu;
	}
	public void setNgayChieu(Date ngayChieu) {
		NgayChieu = ngayChieu;
	}
	
	
	
}