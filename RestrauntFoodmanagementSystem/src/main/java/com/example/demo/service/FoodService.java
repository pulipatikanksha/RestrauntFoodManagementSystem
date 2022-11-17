package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	public void addItems(FoodItems item) {
		foodRepo.save(item);
	}
}
