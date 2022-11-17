package com.example.demo.entity;

public class FoodItems {

	private int item_number;
	private String item_name;
	private String type;
	private float price;
	private String availability;
	private String action;

	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItems(int item_number, String item_name, String type, float price, String availability, String action) {
		super();
		this.item_number = item_number;
		this.item_name = item_name;
		this.type = type;
		this.price = price;
		this.availability = availability;
		this.action = action;
	}

	public int getItem_number() {
		return item_number;
	}

	public void setItem_number(int item_number) {
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "FoodItems [item_number=" + item_number + ", item_name=" + item_name + ", type=" + type + ", price="
				+ price + ", availability=" + availability + ", action=" + action + "]";
	}
}
