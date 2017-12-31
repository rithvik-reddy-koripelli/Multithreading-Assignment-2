package com.accolite.mini_au;

public class Item {
	int number;
	public Item(int num)
	{
		this.number = num;
	}
	@Override
	public String toString() {
		return "Item number: " + number ;
	}
	
}
