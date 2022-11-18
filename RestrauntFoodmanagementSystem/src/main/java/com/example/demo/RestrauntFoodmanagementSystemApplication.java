package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.FoodItems;
import com.example.demo.service.FoodService;

@SpringBootApplication
public class RestrauntFoodmanagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestrauntFoodmanagementSystemApplication.class, args);
		
		FoodService foodRepo = context.getBean(FoodService.class);
		
		/*
		FoodItems item = new FoodItems();
        item.setItem_name("biryani");
        item.setItem_number(101);
        item.setAvailability("Yes");
        item.setPrice(200);
        item.setType("Indian");
        foodRepo.addItems(item);  */
		
		System.out.println(foodRepo.getFoodItems());
		
		
	}

}
