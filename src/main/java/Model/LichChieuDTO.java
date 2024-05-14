package Model;

import java.util.Date;

public class LichChieuDTO {
    private String tenPhim;
    private String tenPhong;
    private Date ngayChieu;
    private Date tgBatDau;
    private Date tgKetThuc;
    private String trangThai;

    public LichChieuDTO(String tenPhim, String tenPhong, Date ngayChieu, Date tgBatDau, Date tgKetThuc, String trangThai) {
        this.tenPhim = tenPhim;
        this.tenPhong = tenPhong;
        this.ngayChieu = ngayChieu;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
        this.trangThai = trangThai;	
    }

    
    public String getTrangThai() {
		return trangThai;
	}


	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}


	public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public Date getTgBatDau() {
        return tgBatDau;
    }

    public void setTgBatDau(Date tgBatDau) {
        this.tgBatDau = tgBatDau;
    }

    public Date getTgKetThuc() {
        return tgKetThuc;
    }

    public void setTgKetThuc(Date tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }

    @Override
    public String toString() {
        return "LichChieuDTO{" +
                "tenPhim='" + tenPhim + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", ngayChieu=" + ngayChieu +
                ", tgBatDau=" + tgBatDau +
                ", tgKetThuc=" + tgKetThuc +
                '}';
    }
}
