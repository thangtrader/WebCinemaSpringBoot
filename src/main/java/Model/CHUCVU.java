package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CHUC_VU")
public class CHUCVU {
	@Id
	@Column(name="MaChucVu")
	private String maChucVu;
	@Column(name="TenChucVu")
	private String tenChucVu;

	public CHUCVU(String maChucVu, String tenChucVu) {
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
	}

	public CHUCVU() {
		
	}

	public String getMaChucVu() {
		return maChucVu;
	}

	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	public String toString() {
		return this.tenChucVu;
	}
}
