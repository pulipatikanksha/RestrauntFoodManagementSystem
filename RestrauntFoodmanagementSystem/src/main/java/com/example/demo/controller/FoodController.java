package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.FoodItems;
import com.example.demo.service.FoodService;

@RestController
public class FoodController {
	@Autowired
	FoodService foodService;
	
	@GetMapping("/index")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/homePage")
	public ModelAndView homePage(Model model) {
		ModelAndView mv = new ModelAndView("homePage");
		mv.addObject("FoodItem", foodService.getFoodItems());
		return mv;
	}
	
	@GetMapping("/insertItem")
	public ModelAndView itemInsertion(Model model) {
		ModelAndView mv = new ModelAndView("insertItem");
		mv.addObject("FoodItem", new FoodItems());
		return mv;
	}
	
	@PostMapping("/saveItem")
	public ModelAndView itemInsertion(@ModelAttribute("FoodItems") FoodItems foodItems) {
		ModelAndView mv = new ModelAndView("redirect:/homePage");
		foodService.save(foodItems);
		return mv;
	}
	
	@GetMapping("/editItem")
	public ModelAndView editItem(@RequestParam int item_number) {
		ModelAndView mv = new ModelAndView("editItem");
		FoodItems updatedItems = FoodService.getFoodItems(item_number);
		mv.addObject("FoodItem", new FoodItems());
		return mv;
	}
	
}
