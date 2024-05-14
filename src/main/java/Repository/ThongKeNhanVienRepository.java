package Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import Model.LichLamviec;

@Repository
@EnableJpaRepositories
public interface ThongKeNhanVienRepository extends JpaRepository<LichLamviec, Date> {
//	@Query("SELECT llv.nhanVien.maNhanVien, llv.nhanVien.tenNhanVien, llv.nhanVien.gioiTinh, " +
//	           "SUM(CASE WHEN llv.caLamViec.gioBatDau IS NOT NULL AND llv.caLamViec.gioKetThuc IS NOT NULL " +
//	           "THEN TIMESTAMPDIFF(HOUR, llv.caLamViec.gioBatDau, llv.caLamViec.gioKetThuc) ELSE 0 END) AS SoGioLam , " +
//		       "ROUND(SUM(cs.heSoLuong * 18000 * " +
//		       "CASE WHEN llv.caLamViec.gioBatDau IS NOT NULL AND llv.caLamViec.gioKetThuc IS NOT NULL " +
//		       "THEN TIMESTAMPDIFF(HOUR, llv.caLamViec.gioBatDau, llv.caLamViec.gioKetThuc) ELSE 0 END), 2) AS TongLuong " +
//		       "FROM LichLamviec llv " +
//	           "GROUP BY llv.nhanVien.maNhanVien, llv.nhanVien.tenNhanVien, llv.nhanVien.gioiTinh")
	@Query("SELECT llv.nhanVien.maNhanVien, llv.nhanVien.tenNhanVien, llv.nhanVien.gioiTinh, " +
	           "SUM(CASE WHEN llv.caLamViec.gioBatDau IS NOT NULL AND llv.caLamViec.gioKetThuc IS NOT NULL " +
	           "THEN TIMESTAMPDIFF(HOUR, llv.caLamViec.gioBatDau, llv.caLamViec.gioKetThuc) ELSE 0 END) AS SoGioLam " +
	           "FROM LichLamviec llv " +
	           "GROUP BY llv.nhanVien.maNhanVien, llv.nhanVien.tenNhanVien, llv.nhanVien.gioiTinh")
		List<Object[]> thongKeNhanVien();

}
