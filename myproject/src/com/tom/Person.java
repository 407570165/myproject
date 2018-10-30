package com.tom;

public class Person {
	String name="justin";
	float height=1.74f;
	float weight=63.6f;
		public Person(String name,float weight,float height){
			this.name=name;
			this.height=height;
			this.weight=weight;
		}
		public float bmi() {
			float bmi=weight/(height*height);
			return bmi;
		}

		
		}
	

