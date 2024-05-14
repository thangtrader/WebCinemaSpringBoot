package Service;
import java.util.List;

import Model.PHIM;
import org.springframework.data.domain.Page;


public interface PhimService {
	List<PHIM> getAll();
	Boolean create(PHIM phim);
	PHIM findByMaPhim(String maPhim);
	Boolean update(PHIM phim);
	Boolean delete(String maPhim);

	Page<PHIM> getAll(Integer pageNo);
}
