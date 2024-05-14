package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.CHUCVU;

@Repository
public interface ChucVuRepository extends JpaRepository<CHUCVU, String> {

}
