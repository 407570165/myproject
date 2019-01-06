package com.tom;

import java.util.Random;
import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Is your range between-3~5");
		Scanner scanner= new Scanner(System.in);
		int line =scanner.nextInt();
		
		if (line>=-3&line<=5) {
			System.out.println("ture");
		}else {
			System.out.println(false);
		}*/
		
		/*Scanner scanner =new Scanner(System.in);
		int range =scanner.nextInt();
		boolean f =(range>=-3&&range<=5);
		System.out.println(f);*/
		
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int secret =random.nextInt(100)+1;
		Secret s =new Secret();
		int high=100;
		int low=0;
		while (true) {
		int guess=scanner.nextInt();
		if(guess==secret) {
			System.out.println("bingo");
		}
		else {
			if(secret>guess&&guess>low) low=guess;
			if(guess>secret&&guess<high) high=guess;
			System.out.println(low+"~"+high);
		}
		
	}
	}

}
