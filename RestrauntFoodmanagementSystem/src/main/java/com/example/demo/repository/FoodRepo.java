package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.FoodItems;

@Repository
public interface FoodRepo extends JpaRepository<FoodItems, Long>{

}
