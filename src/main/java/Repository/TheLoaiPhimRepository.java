package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.THELOAIPHIM;

@Repository
public interface TheLoaiPhimRepository extends JpaRepository<THELOAIPHIM, String> {

}
