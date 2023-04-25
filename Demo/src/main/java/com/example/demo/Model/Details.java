package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Details {
	@Id
	private int id;
	private String type;
	private String gender;
	private String model;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", type=" + type + ", gender=" + gender + ", model=" + model + ", price=" + price
				+ "]";
	}
	
}
	