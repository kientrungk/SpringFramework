package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.Servicenhavien;
import set.setNhanvIen;

@Controller
public class ControllerNhanVien {
	
	@Autowired
	private Servicenhavien nhanvienservice;
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
	    List<setNhanvIen> list=nhanvienservice.findAll();
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("list",list);
		for(setNhanvIen nhanvien:list) {
			System.out.println(list);
		}
		
		
		return mav;
	}
	@RequestMapping(value = "/addform", method = RequestMethod.GET)
	public ModelAndView addpage() {
	   
		ModelAndView mav = new ModelAndView("add");

		return mav;
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute setNhanvIen nhanvien, Model model) {	
		nhanvienservice.save(nhanvien);    
        return "list"; 
    }
	


}
