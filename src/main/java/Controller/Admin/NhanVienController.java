package Controller.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import Model.PHIM;
import Model.THELOAIPHIM;
import Service.ChinhSachService;
import Service.ChucVuService;
import Service.NhanVienService;
import Service.StorageService;

@Controller
@RequestMapping("/admin")
public class NhanVienController {
	
	@Autowired
	private NhanVienService nvService;
	
	@Autowired
	private ChinhSachService csService;
	
	@Autowired
	private ChucVuService cvService;
	
	@Autowired
	private StorageService storageService;
	
	@GetMapping("/nhanvien")
	public String NhanVien(Model model) {
		List<NHANVIEN> nhanvien = this.nvService.getAll();
		model.addAttribute("nhanvien", nhanvien);
		return "NhanVien/nhanvien";
	}
	
	@GetMapping("/themnhanvien")
	public String ThemNhanVien(Model model) {
		NHANVIEN nv = new NHANVIEN();
		model.addAttribute("nv", nv);
		List<CHINHSACH> cs = this.csService.getAll();
		model.addAttribute("cs", cs);
		List<CHUCVU> cv = this.cvService.getAll();
		model.addAttribute("cv", cv);
		return "NhanVien/themnhanvien";
	}
	
	@PostMapping("/themnhanvien")
	public String Save(@ModelAttribute("nv") NHANVIEN nv, @RequestParam("file") MultipartFile file) {
		
		this.storageService.store(file);
		String fileName = file.getOriginalFilename();
		nv.setAnh(fileName);
		
		
		if(this.nvService.create(nv)) {
			return "redirect:/admin/nhanvien";
		}else {
			return "/admin/themnhanvien";
		}
	}
	
	@GetMapping("/suanhanvien/{MaNhanVien}")
	public String SuaNhanVien(Model model, @PathVariable("MaNhanVien") String MaNhanVien) {
		NHANVIEN nv = this.nvService.findByMaNhanVien(MaNhanVien);
		model.addAttribute("nv", nv);
		List<CHINHSACH> cs = this.csService.getAll();
		model.addAttribute("cs", cs);
		List<CHUCVU> cv = this.cvService.getAll();
		model.addAttribute("cv", cv);
		return "NhanVien/suanhanvien";
	}
	
	@PostMapping("/suanhanvien")
	public String Update(@ModelAttribute("nv") NHANVIEN nv, @RequestParam("file") MultipartFile file) {
		
		String fileName = file.getOriginalFilename();
		boolean isEmpty = fileName == null || fileName.trim().length() == 0;
		if(!isEmpty) {
			this.storageService.store(file);
			nv.setAnh(fileName);
		}
		if(this.nvService.update(nv)) {
			return "redirect:/admin/nhanvien";
		}else {
			return "/admin/suanhanvien";
		}
	}
	
	@GetMapping("/xoanhanvien/{MaNhanVien}")
	public String XoaNhanVien(@PathVariable("MaNhanVien") String MaNhanVien) {
		if(this.nvService.delete(MaNhanVien)) {
			return "redirect:/admin/nhanvien";
		}else {
			return "redirect:/admin/nhanvien";
		}
	}
}
