package com.alpha.exam.exam.model;

public class Product {
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", continent=" + continent + ", multiplier=" + multiplier + "]";
	}
	private double 	price;
	private String continent;
	private int multiplier;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	
	

}
