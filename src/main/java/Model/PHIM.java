package Model;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="PHIM")
public class PHIM {
	@Id
	@Column(name="MaPhim")
	private String MaPhim;
	@Column(name="TenPhim")
	private String TenPhim;
	@Column(name="AnhPhim")
	private String AnhPhim;
	@Column(name="ThoiLuong")
	private int ThoiLuong;
	@Column(name="QuocGia")
	private String QuocGia;
	@Column(name="NamSanXuat")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date  NamSanXuat;
	@Column(name="DoTuoiXem")
	private int DoTuoiXem;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaTheLoai")
    private THELOAIPHIM theLoaiPhim;
	@Column(name="DaoDien")
	private String DaoDien;

	public PHIM(String maPhim, String tenPhim, String anhPhim, int thoiLuong, String quocGia, Date  namSanXuat,
			int doTuoiXem, THELOAIPHIM theLoaiPhim, String daoDien) {
		this.MaPhim = maPhim;
		this.TenPhim = tenPhim;
		this.AnhPhim = anhPhim;
		this.ThoiLuong = thoiLuong;
		this.QuocGia = quocGia;
		this.NamSanXuat = namSanXuat;
		this.DoTuoiXem = doTuoiXem;
		this.theLoaiPhim = theLoaiPhim;
		this.DaoDien = daoDien;
	}

	public PHIM() {
	}

	public String getMaPhim() {
		return MaPhim;
	}

	public void setMaPhim(String maPhim) {
		this.MaPhim = maPhim;
	}

	public String getTenPhim() {
		return TenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.TenPhim = tenPhim;
	}

	public String getAnhPhim() {
		return AnhPhim;
	}

	public void setAnhPhim(String anhPhim) {
		this.AnhPhim = anhPhim;
	}

	public int getThoiLuong() {
		return ThoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		this.ThoiLuong = thoiLuong;
	}

	public String getQuocGia() {
		return QuocGia;
	}

	public void setQuocGia(String quocGia) {
		this.QuocGia = quocGia;
	}

	public Date  getNamSanXuat() {
		return NamSanXuat;
	}

	public void setNamSanXuat(Date namSanXuat) {
		this.NamSanXuat = namSanXuat;
	}

	public int getDoTuoiXem() {
		return DoTuoiXem;
	}

	public void setDoTuoiXem(int doTuoiXem) {
		this.DoTuoiXem = doTuoiXem;
	}

	public THELOAIPHIM getTheLoaiPhim() {
	    return theLoaiPhim;
	}

	public void setTheLoaiPhim(THELOAIPHIM theLoaiPhim) {
	    this.theLoaiPhim = theLoaiPhim;
	}


	public String getDaoDien() {
		return DaoDien;
	}

	public void setDaoDien(String daoDien) {
		this.DaoDien = daoDien;
	}

	@Override
	public String toString() {
		return "PHIM [maPhim=" + MaPhim + ", tenPhim=" + TenPhim + ", anhPhim=" + AnhPhim + ", thoiLuong=" + ThoiLuong
				+ ", quocGia=" + QuocGia + ", nanSanXuat=" + NamSanXuat + ", doTuoiXem=" + DoTuoiXem + ", maTheLoai="
				+ theLoaiPhim + ", noiDung=" + DaoDien + "]";
	}

}
