package Service;

import Model.NHANVIEN;

public interface CaNhanService {
	NHANVIEN findByTenTaiKhoan(String tenTaiKhoan);
	Boolean update(NHANVIEN nv);
}
