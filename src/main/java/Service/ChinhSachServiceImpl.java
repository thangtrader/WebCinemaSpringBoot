package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.CHINHSACH;
import Repository.ChinhSachRepository;

@Service
public class ChinhSachServiceImpl implements ChinhSachService {

	@Autowired
	private ChinhSachRepository csRepository;
	
	@Override
	public List<CHINHSACH> getAll() {
		// TODO Auto-generated method stub
		return this.csRepository.findAll();
	}

}
