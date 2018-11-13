package com.tom;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		Ticket ticket =new Ticket(1000, 1800);
		while (true){
			int totalT=0;
			if(totalT!=-1){
		System.out.println("Please enter number of tickets:");
		totalT=scanner.nextInt();
			if(totalT==-1)
				break;
		System.out.println("How many round-trip tickets:");
		int roundT=scanner.nextInt();
		int totalP =(totalT-roundT)*1000+(int)(roundT*0.9*2000);
		System.out.println("Please enter number of tickets:"+totalT);
		System.out.println("How many round-trip tickets:"+roundT);
		System.out.println("Total:"+totalP);
		
			}
		}
		
	}

}
