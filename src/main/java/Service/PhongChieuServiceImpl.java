package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.PHONGCHIEU;
import Repository.PhongChieuRepository;
@Service
public class PhongChieuServiceImpl implements PhongChieuService {
	@Autowired
	private PhongChieuRepository pcRepository;

	@Override
	public List<PHONGCHIEU> getAll() {
		// TODO Auto-generated method stub
		return this.pcRepository.findAll();
	}

}
