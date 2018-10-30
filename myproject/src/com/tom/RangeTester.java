package com.tom;

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
		
		Scanner scanner =new Scanner(System.in);
		int range =scanner.nextInt();
		boolean f =(range>=-3&&range<=5);
		System.out.println(f);
		
		

	}

}
