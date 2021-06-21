package com.alpha.exam.exam.model;

public class APIResponse {
	
	private String id;
    private double price ;
    private String continent;
    private String multiplier;
    private String createdAt ;
    private String multipliedValue;
    
	@Override
	public String toString() {
		return "APIResponse [id=" + id + ", price=" + price + ", continent=" + continent + ", multiplier=" + multiplier
				+ ", createdAt=" + createdAt + ", multipliedValue=" + multipliedValue + "]";
	}
	public String getMultipliedValue() {
		return multipliedValue;
	}
	public void setMultipliedValue(String multipliedValue) {
		this.multipliedValue = multipliedValue;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(String multiplier) {
		this.multiplier = multiplier;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
    

}
