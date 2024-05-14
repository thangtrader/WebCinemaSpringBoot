package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.CHUCVU;
import Repository.ChucVuRepository;

@Service
public class ChucVuServiceImpl implements ChucVuService {
	
	@Autowired
	private ChucVuRepository cvRepository;
	
	@Override
	public List<CHUCVU> getAll() {
		// TODO Auto-generated method stub
		return this.cvRepository.findAll();
	}

}
