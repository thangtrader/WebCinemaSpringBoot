package Repository;

import java.util.Date;
import java.util.List;

import Model.LichChieuDisplay;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import Model.LICHCHIEU;
import Model.LichChieuDTO;

@Repository
@EnableJpaRepositories
public interface LichChieuRepository extends JpaRepository<LICHCHIEU, Date> {
//	@Query("SELECT p.TenPhim, ph.TenPhong, l.NgayChieu, g.TGBatDau,g.TGKetThuc FROM LICH_CHIEU l JOIN l.MaPhim p JOIN l.MaPhongChieu ph JOIN l.MaKhungGioChieu g")
//	List<LICHCHIEU> findAllLichChieu();
	@Query("SELECT new Model.LichChieuDTO(l.MaPhim.TenPhim, l.MaPhongChieu.TenPhong, l.NgayChieu, l.MaKhungGioChieu.TGBatDau, l.MaKhungGioChieu.TGKetThuc, l.TrangThai) " +
		       "FROM LICHCHIEU l")
		List<LichChieuDTO> findAllLichChieu();
	
	@Query("SELECT new Model.LichChieuDisplay(l.MaPhim.TenPhim,l.MaPhim.AnhPhim,l.MaPhim.DaoDien,l.NgayChieu, l.MaKhungGioChieu.TGBatDau) " +
			"FROM LICHCHIEU l")
		Page<LichChieuDisplay> findAllKhungGio(Pageable pageable);

}
