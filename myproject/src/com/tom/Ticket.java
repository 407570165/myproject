package com.tom;

public class Ticket {
	int roundT;
	int totalT;
	int price1=1000;
	int price2;
	public Ticket(int price1,int price2){
		this.price1=price1;
		this.price2=price2;
	}
	public int total(){
		int total=(totalT-roundT)*1000+(int)roundT*price2;
		return total;
	}
}
