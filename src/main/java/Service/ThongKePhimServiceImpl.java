package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.CHITIETPHIEUPHIM;
import Repository.ThongKePhimRepository;

@Service
public class ThongKePhimServiceImpl implements ThongKePhimService {
	@Autowired
	private ThongKePhimRepository tkpRepository;
	
	

	@Override
	public List<Object[]> getAll() {
		// TODO Auto-generated method stub
		return this.tkpRepository.tinhDoanhThuPhim();
	}

}
