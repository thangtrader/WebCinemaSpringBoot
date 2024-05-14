package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.NHANVIEN;
import Repository.CaNhanRepository;

@Service
public class CaNhanServiceImpl implements CaNhanService {
	@Autowired
	private CaNhanRepository cnRepository;
	
	@Override
	public NHANVIEN findByTenTaiKhoan(String tenTaiKhoan) {
		// TODO Auto-generated method stub
		return this.cnRepository.findByTenTaiKhoan(tenTaiKhoan);
	}

	@Override
	public Boolean update(NHANVIEN nv) {
		try {
			this.cnRepository.save(nv);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }
}
