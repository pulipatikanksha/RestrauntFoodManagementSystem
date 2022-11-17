package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.FoodService;

@RestController
public class FoodController {

	@Autowired
	FoodService foodService;
	
	@GetMapping("/get")
	public ModelAndView getFoodItems(Model model) {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("FoodItem", foodService.getFood_item());
		return mv;
	}
}
