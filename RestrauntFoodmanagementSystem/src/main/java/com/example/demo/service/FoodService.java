package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FoodItems;
import com.example.demo.repository.FoodRepo;

@Service
public class FoodService {

	@Autowired
	FoodRepo foodRepo;
	
	public List<FoodItems> getFoodItems(){
		return foodRepo.findAll();
	}
	
	public void save(FoodItems foodItem) {
		this.foodRepo.save(foodItem);
		//this.courseRepository.save(course);

	}

	public FoodItems getFoodItems(String item_number) {
		//FoodItems updatedItem = foodRepo.findById(item_number);
		return foodRepo.findById(item_number).get();
	}

	public void deleteItem(String item_number) {
		this.foodRepo.deleteById(item_number);
	}
}
