package Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import Model.NHANVIEN;


@Repository
@EnableJpaRepositories
public interface NhanVienRepository extends JpaRepository<NHANVIEN, String> {
	
	@Query("Select n From NHANVIEN n Join n.ChinhSach c Join n.ChucVu cv")
	List<NHANVIEN> findAllNhanVien();
	
}
