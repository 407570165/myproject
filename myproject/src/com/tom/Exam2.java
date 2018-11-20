package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		Random random=new Random();
		int secret=random.nextInt(10)+1;
		while(true){
			System.out.println("your guess");
			int guess=scanner.nextInt();
			if(guess>secret){
				System.out.println("lower");
			}
			if(guess<secret){
				System.out.println("higher");
			}
			else{
				System.out.println("great");
					break;
			}
		
				
		}
		}
	
	
	}
