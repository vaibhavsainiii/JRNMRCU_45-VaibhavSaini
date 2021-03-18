package com.fkart.exception;

public class cartEmptyException extends Exception{
	private static final long serialVersionUID = 1L;

	public cartEmptyException(){
		super("Cart is Empty");
	}
}
