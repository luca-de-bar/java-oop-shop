package org.lessons.java.shop;

public class Product {
	
	private int productID;
	public String name;
	public String description;
	public float price;
	public int VAT;
	
	// Product Constructor
	protected Product(String name, String description, float price) {
		this.productID = ShopUtils.genRandCode(); //Gen random productID with custom Class
		this.name = name;
		this.description = description;
		this.price = price;
		this.VAT = 22;
	}
	
	//Adding pad left "0" to productID to match 8 numbers
	private String getFormattedProductID() {
		
		int maxCodeLength = 8;
		int thisCodeLength = Integer.toString(productID).length();
		int zeroToAdd = maxCodeLength - thisCodeLength;
		
		// Should return productID with pad left to match 8 numbers
		String paddedProductID = String.format("%0" + zeroToAdd + "d", 0) + productID;
		return paddedProductID;
	}
	
	public void getProductID() {
		// Print the padded productID
		System.out.println(getFormattedProductID());
	}
	
	public void getBasePrice() {
		System.out.println(price);
	}
	
	public void getVATPrice() {
		float vatPrice = price * (1 + (float)this.VAT / 100);
		System.out.println(vatPrice);
	}
	
	public void getProductName() {
		System.out.println(getFormattedProductID() + "-" + this.name);
	}
}
