package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import Model.PHIM;
import Repository.PhimRepository;

@Service
public class PhimImpl implements PhimService {
	
	@Autowired
	private PhimRepository phimRepository;
	
	@Override
	public List<PHIM> getAll() {
		// TODO Auto-generated method stub
		return this.phimRepository.findAllPhim();
	}

	@Override
	public Boolean create(PHIM phim) {
		try {
			this.phimRepository.save(phim);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PHIM findByMaPhim(String maPhim) {
		return this.phimRepository.findById(maPhim).get();
	}

	@Override
	public Boolean update(PHIM phim) {
		try {
			this.phimRepository.save(phim);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean delete(String maPhim) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Page<PHIM> getAll(Integer pageNo) {
		Pageable pageable = PageRequest.of(pageNo-1, 3);
		return this.phimRepository.findAll(pageable);
	}
}
