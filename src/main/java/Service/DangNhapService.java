package Service;

import Model.NHANVIEN;

public interface DangNhapService {
	NHANVIEN findByTenTaiKhoan(String tenTaiKhoan);
}
