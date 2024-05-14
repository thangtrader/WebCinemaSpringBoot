package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.NHANVIEN;
import Repository.DangNhapRepository;

@Service
public class DangNhapServiceImpl implements DangNhapService {
	@Autowired
	private DangNhapRepository dnRepository;
	
	@Override
	public NHANVIEN findByTenTaiKhoan(String tenTaiKhoan) {
		// TODO Auto-generated method stub
		return dnRepository.findByTenTaiKhoan(tenTaiKhoan);
	}

}
