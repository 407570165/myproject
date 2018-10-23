package com.tom;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("Your name:");
		String aaa=scanner.nextLine();
		System.out.println(aaa);
		
		
		

		
		Person p=new Person(63.6f,1.74f);
		System.out.println(p.bmi());
		p.hello();
		
		Student stu=new Student("hank",70,90);
		/*stu.name="hank";
		stu.english=70;
		stu.math=90;
		stu.print();*/
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
	}

}
