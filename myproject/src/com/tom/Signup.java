package com.tom;

import java.util.Scanner;

public class Signup {
    public static void main(String[] args){
	System.out.println("Are you 18? (y/n)");
	Scanner scanner=new Scanner(System.in);
	String line =scanner.nextLine();
	System.out.println(line);
	boolean adult =line.equalsIgnoreCase("y");
	System.out.println(adult);	
		if(adult){
			System.out.print("Your age");
			int age =scanner.nextInt();
			scanner.nextLine();
			System.out.print("Your name");
			String name =scanner.nextLine();
			System.out.print("Your nickname");
			String nickName=scanner.nextLine();
			System.out.print(age+"\t"+name+"\t"+nickName);
			
		}else{
			System.out.println("xxxxxx");
		}
	
    }
}
