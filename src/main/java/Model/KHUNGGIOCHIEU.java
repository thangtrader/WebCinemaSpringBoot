package Model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "KHUNG_GIO_CHIEU")
public class KHUNGGIOCHIEU {
	@Id
	@Column(name="MaKhungGioChieu")
	private String MaKhungGioChieu;
	@Column(name="TenKhungGio")
	private String TenKhungGio;
	@Column(name="TGBatDau")
	private Time TGBatDau;
	@Column(name="TGKetThuc")
	private Time TGKetThuc;
	public KHUNGGIOCHIEU() {
		super();
	}
	public KHUNGGIOCHIEU(String maKhungGioChieu, String tenKhungGio, Time tGBatDau, Time tGKetThuc) {
		super();
		MaKhungGioChieu = maKhungGioChieu;
		TenKhungGio = tenKhungGio;
		TGBatDau = tGBatDau;
		TGKetThuc = tGKetThuc;
	}
	public String getMaKhungGioChieu() {
		return MaKhungGioChieu;
	}
	public void setMaKhungGioChieu(String maKhungGioChieu) {
		MaKhungGioChieu = maKhungGioChieu;
	}
	public String getTenKhungGio() {
		return TenKhungGio;
	}
	public void setTenKhungGio(String tenKhungGio) {
		TenKhungGio = tenKhungGio;
	}
	public Time getTGBatDau() {
		return TGBatDau;
	}
	public void setTGBatDau(Time tGBatDau) {
		TGBatDau = tGBatDau;
	}
	public Time getTGKetThuc() {
		return TGKetThuc;
	}
	public void setTGKetThuc(Time tGKetThuc) {
		TGKetThuc = tGKetThuc;
	}
	
}
