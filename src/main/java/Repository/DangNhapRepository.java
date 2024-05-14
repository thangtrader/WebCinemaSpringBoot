package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.NHANVIEN;
import java.util.List;


@Repository
public interface DangNhapRepository extends JpaRepository<NHANVIEN, String> {
	NHANVIEN findByTenTaiKhoan(String tenTaiKhoan);
}
