package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.KHUNGGIOCHIEU;

@Repository
public interface KhungGioChieuRepository extends JpaRepository<KHUNGGIOCHIEU, String> {

}
