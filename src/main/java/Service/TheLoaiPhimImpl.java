package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.THELOAIPHIM;
import Repository.TheLoaiPhimRepository;

@Service
public class TheLoaiPhimImpl implements TheLoaiPhimService {
	
	@Autowired
	private TheLoaiPhimRepository theLoaiPhimRepository;

	@Override
	public List<THELOAIPHIM> getAll() {
		return this.theLoaiPhimRepository.findAll();
	}

}
