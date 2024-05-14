package Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;


import Model.NHANVIEN;
import Service.DangNhapService;
import Service.NhanVienService;
import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("NHANVIEN")
public class LoginController {
	
    @Autowired
    private DangNhapService dnService;
    
    @GetMapping("/trangchu")
    public String home() {
        return "homepage"; 
    }
    
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("NHANVIEN", new NHANVIEN());
        
        return "admin/login";
    }
}
