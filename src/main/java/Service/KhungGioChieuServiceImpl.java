package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.KHUNGGIOCHIEU;
import Repository.KhungGioChieuRepository;

@Service
public class KhungGioChieuServiceImpl implements KhungGioChieuService {
	@Autowired
	private KhungGioChieuRepository kgcRepository;

	@Override
	public List<KHUNGGIOCHIEU> getAll() {
		// TODO Auto-generated method stub
		return this.kgcRepository.findAll();
	}

}
