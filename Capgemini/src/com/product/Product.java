package com.product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Product implements Comparable<Product>{

	public long productId;
	public String name;
	public long price;
	public Date dateOfExpire;
	public Date dateOfManufacture;
	public 

	

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Date getDateOfExpire() {
		return dateOfExpire;
	}

	public void setDateOfExpire(String sdateOfExpire) {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dateOfExpire = sd.parse(sdateOfExpire);
			this.dateOfExpire = dateOfExpire;
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String sdateOfManufacture) {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dateOfManufacture = sd.parse(sdateOfManufacture);
			this.dateOfManufacture = dateOfManufacture;
			this.days=Duration.between(this.dateOfManufacture, this.dateOfExpire).toDays;
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
	}
	
	

	@Override
	public int compareTo(Product o) {

		if(productId==o.productId)  
			return 0;  
			else if(productId>o.productId)  
			return 1;  
			else  
			return -1;  
	}

}
