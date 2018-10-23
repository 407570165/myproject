package com.tom;

import java.util.Scanner;

public class Member {
	boolean adult;
	String name;
	int age;
	String nickname;
	
	public Member(boolean adult) {
		this.adult=adult;
	}
	public void quality(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Your age");
		age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Your name");
		name=scanner.nextLine();
		System.out.println("Your nickname");
		nickname=scanner.nextLine();
		
	}
	
}
