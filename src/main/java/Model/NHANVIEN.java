package Model;


import java.awt.Image;
import java.io.Serializable;
import java.util.Date;

import javax.swing.Icon;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="NHAN_VIEN")
public class NHANVIEN implements Serializable {
	@Id
	@Column(name="MaNhanVien")
	private String maNhanVien;
	@Column(name="TenNhanVien")
	private String tenNhanVien;
	@Column(name="NgaySinh")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngaySinh;
	@Column(name="GioiTinh")
	private String gioiTinh;
	@Column(name="DiaChi")
	private String diaChi;
	@Column(name="SoDienThoai")
	private String sdt;
	@Column(name="CCCD")
	private String cccd;
	@Column(name="TenTaiKhoan")
	private String tenTaiKhoan;
	@Column(name="MatKhau")
	private String matKhau;
	@Column(name="Anh")
	private String anh;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaChinhSach")
	private CHINHSACH ChinhSach;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaChucVu")
	private CHUCVU ChucVu;
	@Column(name="TrangThai")
	private String trangThai;

	public NHANVIEN(String maNhanVien, String tenNhanVien, Date ngaySinh, String gioiTinh, String diaChi, String sdt,
			String cccd, String tenTaiKhoan, String matKhau, String anh, CHINHSACH ChinhSach, CHUCVU ChucVu,
			String trangThai) {
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.cccd = cccd;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.anh = anh;
		this.ChinhSach = ChinhSach;
		this.ChucVu = ChucVu;
		this.trangThai = trangThai;
	}


	public NHANVIEN() {
	}


	public String getMaNhanVien() {
		return maNhanVien;
	}


	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}


	public String getTenNhanVien() {
		return tenNhanVien;
	}


	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}


	public Date getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public String getSdt() {
		return sdt;
	}


	public void setSdt(String sdt) {
		this.sdt = sdt;
	}


	public String getCccd() {
		return cccd;
	}


	public void setCccd(String cccd) {
		this.cccd = cccd;
	}


	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}


	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}


	public String getMatKhau() {
		return matKhau;
	}


	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}


	public String getAnh() {
		return anh;
	}


	public void setAnh(String anh) {
		this.anh = anh;
	}


	public CHINHSACH getChinhSach() {
		return ChinhSach;
	}


	public void setChinhSach(CHINHSACH ChinhSach) {
		this.ChinhSach = ChinhSach;
	}


	public CHUCVU getChucVu() {
		return ChucVu;
	}


	public void setChucVu(CHUCVU ChucVu) {
		this.ChucVu = ChucVu;
	}


	public String getTrangThai() {
		return trangThai;
	}


	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	

}
