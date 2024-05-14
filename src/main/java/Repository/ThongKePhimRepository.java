package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Model.CHITIETPHIEUPHIM;
import Model.ChiTietPhieuPhimDTO;
@Repository
public interface ThongKePhimRepository extends JpaRepository<CHITIETPHIEUPHIM, ChiTietPhieuPhimDTO> {
	@Query("SELECT c.phim.MaPhim, c.phim.TenPhim, SUM(c.soLuong) AS soluong, SUM(c.soLuong) * 60000 AS doanhthu " +
		       "FROM CHITIETPHIEUPHIM c " +
		       "GROUP BY c.phim.MaPhim, c.phim.TenPhim")
     List<Object[]> tinhDoanhThuPhim();
}
