package Model;


import java.sql.Time;
import java.util.Date;

public class LichChieuDisplay {
    private String TenPhim;
    private String AnhPhim;
    private String DaoDien;
    private Date NgayChieu;
    private  Time TGBatDau;

    public LichChieuDisplay(String tenPhim, String anhPhim, String daoDien, Date ngayChieu, Time TGBatDau) {
        TenPhim = tenPhim;
        AnhPhim = anhPhim;
        DaoDien = daoDien;
        NgayChieu = ngayChieu;
        this.TGBatDau = TGBatDau;
    }

    public LichChieuDisplay() {
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String tenPhim) {
        TenPhim = tenPhim;
    }

    public String getAnhPhim() {
        return AnhPhim;
    }

    public void setAnhPhim(String anhPhim) {
        AnhPhim = anhPhim;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public void setDaoDien(String daoDien) {
        DaoDien = daoDien;
    }

    public Date getNgayChieu() {
        return NgayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        NgayChieu = ngayChieu;
    }

    public Time getTGBatDau() {
        return TGBatDau;
    }

    public void setTGBatDau(Time TGBatDau) {
        this.TGBatDau = TGBatDau;
    }

    @Override
    public String toString() {
        return "LichChieuDisplay{" +
                "TenPhim='" + TenPhim + '\'' +
                ", AnhPhim='" + AnhPhim + '\'' +
                ", DaoDien='" + DaoDien + '\'' +
                ", NgayChieu=" + NgayChieu +
                ", TGBatDau=" + TGBatDau +
                '}';
    }
}
