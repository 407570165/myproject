package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		Random random=new Random();
		Secret secret=new Secret();
		int msecret =random.nextInt(10+1);
			while(true) {
				System.out.println("Your guess:");
				 int guess =scanner.nextInt();
				if(secret.diff(guess)>0) {
					 System.out.println("higher");
			    if(secret.diff(guess)<0) {
					 System.out.println("lower");
					 }
					else {
						System.out.println("Great! the secret nmber is:"+secret);
					    
					}
					
				 }
			}
		}
	
	}
