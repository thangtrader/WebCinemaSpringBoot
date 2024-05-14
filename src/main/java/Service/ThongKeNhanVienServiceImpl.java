package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.ThongKeNhanVienRepository;

@Service
public class ThongKeNhanVienServiceImpl implements ThongKeNhanVienService {
	
	@Autowired
	private ThongKeNhanVienRepository tknvRepository;

	@Override
	public List<Object[]> getAll() {
		// TODO Auto-generated method stub
		return this.tknvRepository.thongKeNhanVien();
	}
	
	
}
