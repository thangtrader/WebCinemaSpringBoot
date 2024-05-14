package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.NHANVIEN;
import Repository.NhanVienRepository;
import jakarta.transaction.Transactional;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	
	@Autowired
	private NhanVienRepository nvRepository;

	@Override
	public List<NHANVIEN> getAll() {
		return nvRepository.findAllNhanVien();
	}

	@Override
	public Boolean create(NHANVIEN nv) {
		try {
			this.nvRepository.save(nv);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean update(NHANVIEN nv) {
		try {
			this.nvRepository.save(nv);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean delete(String maNV) {
		try {
			this.nvRepository.deleteById(maNV);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public NHANVIEN findByMaNhanVien(String maNV) {
		return this.nvRepository.findById(maNV).get();
	}
}
