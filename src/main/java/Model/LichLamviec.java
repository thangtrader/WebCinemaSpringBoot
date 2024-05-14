package Model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="LICH_LAM_VIEC")
public class LichLamviec implements Serializable {
	@Id
	@Column(name="NgayLamViec")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date NgayLamViec;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maNhanVien")
    private NHANVIEN nhanVien;
    
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "maChinhSach")
//    private CHINHSACH chinhSach;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maCa")
    private CALAMVIEC caLamViec;

	public LichLamviec(Date NgayLamViec, NHANVIEN nhanVien, CALAMVIEC caLamViec) {
		super();
		this.NgayLamViec = NgayLamViec;
		this.nhanVien = nhanVien;
//		this.chinhSach = chinhSach;
		this.caLamViec = caLamViec;
	}

	public LichLamviec() {
		super();
	}

	public Date getNgayLamViec() {
		return NgayLamViec;
	}

	public void setNgayLamViec(Date NgayLamViec) {
		this.NgayLamViec = NgayLamViec;
	}

	public NHANVIEN getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NHANVIEN nhanVien) {
		this.nhanVien = nhanVien;
	}

//	public CHINHSACH getChinhSach() {
//		return chinhSach;
//	}
//
//	public void setChinhSach(CHINHSACH chinhSach) {
//		this.chinhSach = chinhSach;
//	}

	public CALAMVIEC getCaLamViec() {
		return caLamViec;
	}

	public void setCaLamViec(CALAMVIEC caLamViec) {
		this.caLamViec = caLamViec;
	}
    
    
}
