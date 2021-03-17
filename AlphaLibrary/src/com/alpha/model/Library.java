package com.alpha.model;

public class Library {
	private String bookName;
	private int price;

	public Library(){}
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Library(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public String toString() {
		return " bookName=" + bookName + ", price=" + price;
	}

}
