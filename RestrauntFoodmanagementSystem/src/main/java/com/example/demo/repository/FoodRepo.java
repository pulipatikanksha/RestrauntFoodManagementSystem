package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.FoodItems;


public interface FoodRepo extends JpaRepository<FoodItems, Long>{

}
