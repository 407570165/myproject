package com.tom;

public class Temperature {
	double celsius;
	
	public Temperature(double celsius){
		this.celsius=celsius;
		}
	public double f(){
		double f=celsius*(9.0/5)+32;
		return f;
		}
	
}
