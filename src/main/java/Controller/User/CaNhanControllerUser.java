package Controller.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import Model.CHINHSACH;
import Model.CHUCVU;
import Model.NHANVIEN;
import Repository.CaNhanRepository;
import Service.CaNhanService;
import Service.NhanVienService;
import Service.StorageService;

@Controller
@RequestMapping("/user")
public class CaNhanControllerUser {
	@Autowired
	private CaNhanService cnService;
	
	@Autowired
	private NhanVienService nvService;
	
	@Autowired
	private StorageService storageService;

	@GetMapping("/canhan")
    public String getUserInfo(Authentication authentication, Model model) {
        String username = authentication.getName(); // Lấy tên tài khoản từ Authentication
        NHANVIEN nv = cnService.findByTenTaiKhoan(username);
        if (nv != null) {
            model.addAttribute("nv", nv);
            return "User/canhan";
        } else {
            return "error"; // Hoặc xử lý thích hợp nếu không tìm thấy nhân viên
        }
    }
}
