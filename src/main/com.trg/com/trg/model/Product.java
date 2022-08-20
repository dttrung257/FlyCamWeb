package com.trg.model;

public class Product extends Model implements Comparable<Product> {
	private int productId;
	private String productName;
	private double price;
	private String imageUrl;

	public Product() {
	}

	public Product(int productId, String productName, double price, String imageUrl) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", imageUrl="
				+ imageUrl + "]";
	}

	@Override
	public int compareTo(Product o) {
		// sort descending
		return Double.valueOf(o.price).compareTo(this.price);
	}

}
