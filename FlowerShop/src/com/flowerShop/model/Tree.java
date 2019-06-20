package com.flowerShop.model;

public class Tree extends Product {

	private double height;

	public Tree(double price, double height) {

		setPrice(price);
		this.height = height;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
