package Controller.Admin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.PHIM;
import Model.THELOAIPHIM;
import Repository.PhimRepository;
import Service.PhimService;
import Service.TheLoaiPhimService;

@Controller
@RequestMapping("/admin")
public class PhimController {
	
	@Autowired
	private TheLoaiPhimService tlpService;
	
	@Autowired
	private PhimService phimService;

	@GetMapping("/phim")
	public String danhSachPhim(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {
		Page<PHIM> danhSachPhim = phimService.getAll(pageNo);
		model.addAttribute("totalPage", danhSachPhim.getTotalPages());
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("danhSachPhim", danhSachPhim);
		return "Phim/phim"; // Tên của file HTML sẽ render dữ liệu
	}
//	@GetMapping("/phim")
//	public String Phim() {
//
//		return "Phim/phim";
//	}
	
	@GetMapping("/quanliphim")
	public String QLPhim(Model model) {
		Iterable<PHIM> phim = this.phimService.getAll();
		model.addAttribute("phim", phim);
		return "Phim/quanliphim";
	}
	
	@GetMapping("/themphim")
	public String ThemPhim(Model model) {
		PHIM phim = new PHIM();
		model.addAttribute("phim", phim);
		List<THELOAIPHIM> tlp = this.tlpService.getAll();
		model.addAttribute("tlp", tlp);
		return "Phim/themphim";
	}
	
	@PostMapping("/themphim")
	public String Save(@ModelAttribute("phim") PHIM phim) {
		if(this.phimService.create(phim)) {
			return "redirect:/admin/phim";
		}else {
			return "/admin/themphim";
		}
	}
	
	@GetMapping("/suaphim/{MaPhim}")
	public String SuaPhim(Model model, @PathVariable("MaPhim") String MaPhim) {
		PHIM phim = this.phimService.findByMaPhim(MaPhim);
		model.addAttribute("phim", phim);
		List<THELOAIPHIM> tlp = this.tlpService.getAll();
		model.addAttribute("tlp", tlp);
		return "Phim/suaphim";
	}
	
	@PostMapping("/suaphim")
	public String Update(@ModelAttribute("phim") PHIM phim) {
		if(this.phimService.update(phim)) {
			return "redirect:/admin/phim";
		}else {
			return "/admin/suaphim";
		}
	}
}
