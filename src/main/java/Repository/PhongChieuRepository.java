package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.PHONGCHIEU;

@Repository
public interface PhongChieuRepository extends JpaRepository<PHONGCHIEU, String> {
	
}
