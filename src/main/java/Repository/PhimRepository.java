package Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Model.PHIM;

@Repository
public interface PhimRepository extends JpaRepository<PHIM, String> {
//    @Query("SELECT p.MaPhim, p.TenPhim, p.AnhPhim, p.ThoiLuong, p.QuocGia, p.NamSanXuat, p.DoTuoiXem, p.MaTheLoai, p.DaoDien FROM PHIM p")
//    List<PHIM> findAllPhim();
	  @Query("SELECT p FROM PHIM p INNER JOIN p.theLoaiPhim t")
	  List<PHIM> findAllPhim();
}
