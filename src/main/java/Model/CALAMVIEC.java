package Model;

import java.io.Serializable;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="CA_LAM_VIEC")
public class CALAMVIEC implements Serializable {
	@Id
	@Column(name="MaCa")
	private String maCa;
	@Column(name="TenCa")
	private String tenCa;
	@Column(name="GioBatDau")
	private Time gioBatDau;
	@Column(name="GioKetThuc")
	private Time gioKetThuc;
	public CALAMVIEC(String maCa, String tenCa, Time gioBatDau, Time gioKetThuc) {
		super();
		this.maCa = maCa;
		this.tenCa = tenCa;
		this.gioBatDau = gioBatDau;
		this.gioKetThuc = gioKetThuc;
	}
	public CALAMVIEC() {
		super();
	}
	public String getMaCa() {
		return maCa;
	}
	public void setMaCa(String maCa) {
		this.maCa = maCa;
	}
	public String getTenCa() {
		return tenCa;
	}
	public void setTenCa(String tenCa) {
		this.tenCa = tenCa;
	}
	public Time getGioBatDau() {
		return gioBatDau;
	}
	public void setGioBatDau(Time gioBatDau) {
		this.gioBatDau = gioBatDau;
	}
	public Time getGioKetThuc() {
		return gioKetThuc;
	}
	public void setGioKetThuc(Time gioKetThuc) {
		this.gioKetThuc = gioKetThuc;
	}
	
}
