package com.tom;

public class Person {

	float weight;
	float height;
	String name;	
		public Person(String name,float weight,float height) {
			this.name=name;
			this.height=height;
			this.weight=weight;
			}
		

		public float bmi() {
			float bmi=weight/(height*height);
			return bmi;
		}
		public void hello() {
			System.out.println("Hello");
		}
		
		
		}
	

