package com.jspiders.MobilePattern.Builder;

import com.jspiders.MobilePattern.Object.Laptop;

public class LaptopBuilder {
	private String brand;
	private String processor;
	private String color;
	private double price;
	private int ram;
	private int ssd;
	private String os;
	private int graphic;
	private int battery;
	private double disp_size;
	
	public LaptopBuilder brand (String brand) {
		this.brand= brand;
		return this;
	}
	public LaptopBuilder processor (String processor) {
		this.processor= processor;
		return this;
	}
	public LaptopBuilder color (String color) {
		this.color= color;
		return this;
	}
	public LaptopBuilder os (String os) {
		this.os= os;
		return this;
	}
	public LaptopBuilder ram (int ram) {
		this.ram= ram;
		return this;
	}
	public LaptopBuilder ssd (int ssd) {
		this.ssd= ssd;
		return this;
	}
	public LaptopBuilder graphic (int graphic) {
		this.graphic= graphic;
		return this;
	}
	public LaptopBuilder battery (int battery) {
		this.battery= battery;
		return this;
	}
	public LaptopBuilder price (double price) {
		this.price= price;
		return this;
	}
	public LaptopBuilder disp_size (double disp_size) {
		this.disp_size= disp_size;
		return this;
	}
	public Laptop getLaptop() {
		Laptop laptop = new Laptop(this.brand, this.processor, this.color, 
				this.price, this.ram, this.ssd, this.os, this.graphic, 
				this.battery, this.disp_size);
		return laptop;
	}
}
