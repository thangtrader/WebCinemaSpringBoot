//package homeController;
//
//import Repository.KhungGioChieuRepository;
//import Repository.LichChieuRepository;
//import Repository.PhimRepository;
//import Service.LichChieuService;
//import Service.PhimService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import Model.PHIM;
//import Model.LichChieuDisplay;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/trangchu")
//public class HomeController {
//
//    @Autowired
//    private PhimRepository phimRepository;
//
//    @Autowired
//    private PhimService phimService;
//
//    @Autowired
//    private LichChieuService lcService;
//
//    @GetMapping()
//    public String danhSachPhim(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
//        List<PHIM> danhSachPhim = phimRepository.findAll();
//        model.addAttribute("danhSachPhim", danhSachPhim);
//
////        Page<LichChieuDisplay> danhSachKhungGio = this.lcService.getAll(pageNo);
////        model.addAttribute("totalPage", danhSachKhungGio.getTotalPages());
////        model.addAttribute("currentPage", pageNo);
////        model.addAttribute("danhSachKhungGio", danhSachKhungGio);
//        return "homepage"; 
//    }
//
//}
////	public String Phim(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {
////		Page<PHIM> phim = this.phimService.getAll(pageNo);
////		model.addAttribute("phim", phim);
////		return "Phim/phim";
////	}
////	public String danhSachPhim(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {
////		Page<PHIM> danhSachPhim = phimService.getAll(pageNo);
////		model.addAttribute("totalPage", danhSachPhim.getTotalPages());
////		model.addAttribute("currentPage", pageNo);
////		model.addAttribute("danhSachPhim", danhSachPhim);
////		List<LichChieuDisplay> danhSachKhungGio = this.lcService.getLichChieuDisplay();
////		model.addAttribute("danhSachKhungGio", danhSachKhungGio);
////		return "HomePage"; // Tên của file HTML sẽ render dữ liệu
////	}
//
//
package homeController;

import Repository.KhungGioChieuRepository;
import Repository.LichChieuRepository;
import Repository.PhimRepository;
import Service.LichChieuService;
import Service.PhimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Model.PHIM;
import Model.LichChieuDisplay;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/trangchu")
public class HomeController {

	@Autowired
	private PhimRepository phimRepository;

	@Autowired
	private PhimService phimService;

	@Autowired
	private LichChieuService lcService;

	@GetMapping()
	public String danhSachPhim(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {
		List<PHIM> danhSachPhim = phimRepository.findAll();
		model.addAttribute("danhSachPhim", danhSachPhim);

//		Page<LichChieuDisplay> danhSachKhungGio = this.lcService.getAll(pageNo);
//		model.addAttribute("totalPage", danhSachKhungGio.getTotalPages());
//		model.addAttribute("currentPage", pageNo);
//		model.addAttribute("danhSachKhungGio", danhSachKhungGio);
		return "homepage"; 
	}
}