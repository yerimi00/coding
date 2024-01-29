package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.domain.Lab;
import com.springmvc.service.LabService;

@Controller
public class LabController {
	@Autowired
	private LabService labService;
	
	@RequestMapping(value="/labs", method=RequestMethod.GET)
	public String requestLabMethod(Model  model) {
		List<Lab> list = labService.getAllLabList();
		model.addAttribute("LabList", list);
		
		return "labs";
	}

}
