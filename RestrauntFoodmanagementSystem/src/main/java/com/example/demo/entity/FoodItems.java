package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RFIM")
public class FoodItems {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String item_number;
	private String item_name;
	private String type;
	private String price;
	private String availability; 

	public FoodItems() {
		super();
	}
	
	public FoodItems(String item_number, String item_name, String type, String price, String availability) {
		super();
		this.item_number = item_number;
		this.item_name = item_name;
		this.type = type;
		this.price = price;
		this.availability = availability;
	}

	public String getItem_number() {
		return item_number;
	}

	public void setItem_number(String item_number) {
		this.item_number = item_number;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "FoodItems [item_number=" + item_number + ", item_name=" + item_name + ", type=" + type + ", price="
				+ price + ", availability=" + availability + "]";
	}
}
