package Service;

import java.util.Date;
import java.util.List;

import Model.LICHCHIEU;
import Model.LichChieuDTO;
import Model.LichChieuDisplay;
//import Model.PHIM;
import org.springframework.data.domain.Page;

public interface LichChieuService {
	List<LichChieuDTO> getAll();
	Boolean create(LICHCHIEU lichchieu);
	LICHCHIEU findByNgayChieu(Date NgayChieu);
	Boolean update(LICHCHIEU lichchieu);
	Boolean delete(Date NgayChieu);
	
	Page<LichChieuDisplay> getAll(Integer pageNo);
	Page<LichChieuDisplay> getAll(Integer pageNo,Integer pageSize);
}
