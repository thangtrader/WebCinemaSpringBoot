package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Model.NHANVIEN;

@Service
public interface NhanVienService {
	List<NHANVIEN> getAll();
	Boolean create(NHANVIEN nv);
	NHANVIEN findByMaNhanVien(String maNV);
	Boolean update(NHANVIEN nv);
	Boolean delete(String maNV);
}
