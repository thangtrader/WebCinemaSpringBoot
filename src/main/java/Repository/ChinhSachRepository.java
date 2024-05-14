package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.CHINHSACH;

@Repository
public interface ChinhSachRepository extends JpaRepository<CHINHSACH, String> {

}
