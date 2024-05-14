package Service;

import java.util.Date;
import java.util.List;

import Model.LichChieuDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import Model.LICHCHIEU;
import Model.LichChieuDTO;
import Repository.LichChieuRepository;
@Service
public class LichChieuServiceImpl implements LichChieuService {
	@Autowired
	private LichChieuRepository lcRepository;

	@Override
	public List<LichChieuDTO> getAll() {
		// TODO Auto-generated method stub
		return this.lcRepository.findAllLichChieu();
	}

	@Override
	public Boolean create(LICHCHIEU lichchieu) {
		try {
			this.lcRepository.save(lichchieu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean update(LICHCHIEU lichchieu) {
		try {
			this.lcRepository.save(lichchieu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public LICHCHIEU findByNgayChieu(Date NgayChieu) {
		// TODO Auto-generated method stub
		return this.lcRepository.findById(NgayChieu).get();
	}

	@Override
	public Boolean delete(Date NgayChieu) {
		try {
			this.lcRepository.deleteById(NgayChieu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Page<LichChieuDisplay> getAll(Integer pageNo) {
		Pageable pageable = PageRequest.of(pageNo-1, 4);
		return this.lcRepository.findAllKhungGio(pageable);
	}

	@Override
	public Page<LichChieuDisplay> getAll(Integer pageNo,Integer pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return this.lcRepository.findAllKhungGio(pageable);
	}
	
}
