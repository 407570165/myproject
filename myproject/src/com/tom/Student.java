package com.tom;

public class Student {

	String name="hank";
	int english;
	int math;
	char c ='\t';
	
	public Student(String name,int english,int math){
		this.name=name;
		this.english=english;
		this.math=math;
		
	}
	
	
	
	public void print(){
		System.out.print(name+"\t"+english+"\t"+math+"\t"+average()+"\t"+
	highest()+"\t");
		if (average()>60){
			System.out.println("pass");
		}
		else{
			System.out.println("failed");
			char grading='F';
			int gAverage=average();
			switch(gAverage/10){
			case 10:
				break;
			case 9:
				grading='A';
				break;
			}
		}
	}
	public int average(){
		return (english+math)/2;
	}
	public int highest (){
		if (math>english){
			return math;
	}
		else{
			return english;
		}
		
		
	
}
}
