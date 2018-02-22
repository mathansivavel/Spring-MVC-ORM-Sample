package com.bikers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bike.entity.BikeEntity;
//import com.bikers.dao.BikeDao;
import com.bikers.service.BikeService;


@Controller
public class BikeController {

	@Autowired
	private BikeService b;
	
	@RequestMapping("one") 
	public String fun1(@RequestParam("regno") String reg,@ModelAttribute("cmdName") BikeEntity bike ,Model m ) {
		
		
		BikeEntity res=b.dispBike(reg);
		
		if(res!=null) 
		{
		m.addAttribute("products",res);
		System.out.println("-- Value Found");
		return "two";
		}
		else
			return "three";
	}
	
}
