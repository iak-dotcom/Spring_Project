package com.khan.practice2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khan.practice2.entities.Visitors;
import com.khan.practice2.service.VisitorsService;

@Controller
public class VisitorsController {

	@Autowired
	VisitorsService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		
		return "createVisitors";
	}
	
	@RequestMapping("/saveVisitor")
	public String saveVisitors(@ModelAttribute("visitors") Visitors visitors,ModelMap modelMap){
		Visitors visitorSaved= service.saveVisitors(visitors);
		String msg = "Visitor saved with Id: " + visitorSaved.getId();
		modelMap.addAttribute("msg", msg);
		return"createVisitors";
	}
	
	@RequestMapping("/displayVisitors")
	public String displayVisitors(ModelMap modelMap) {
	List<Visitors>visitors=service.getAllVisitors();
	modelMap.addAttribute("visitors", visitors);
	return "displayVisitors";
	}
	
	
	@RequestMapping("deleteVisitor")
	public String deleteVisitor(@RequestParam("id")int id, ModelMap modelMap) {
	 Visitors visitor = new Visitors();
	visitor.setId(id);
	service.deleteVisitors(visitor);
	List<Visitors> visitors=service.getAllVisitors();
	modelMap.addAttribute("visitors", visitors);
	return "displayVisitors";
}

	@RequestMapping("showUpdate")
	public String showUpdate(@RequestParam("id")int id, ModelMap modelMap) {
		Visitors visitor = service.getVisitorsById(id);
		modelMap.addAttribute("visitor", visitor);
		return "updateVisitors";
	}
	
	
	@RequestMapping("/updateVisitors")
	public String updateVisitors(@RequestParam("visitor")Visitors visitor, ModelMap modelMap) {
		service.updateVisitors(visitor);
	List<Visitors> visitors=service.getAllVisitors();
	modelMap.addAttribute("visitors", visitors);
	return "displayVisitors";
	
}
}
