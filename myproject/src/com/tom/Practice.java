package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*float n=10.666f;
			String m ="justin";
			System.out.printf("hi,%s,your age,%.2f"+"\n",m,n);
			
			Scanner scanner =new Scanner(System.in);
			double c=scanner.nextDouble();
			Temperature temper=new Temperature(c);
			System.out.printf("%.1f c=%.1f F",c,temper.f());*/
			/*int n = (int)(3%5);*/
			
				Random random=new Random();
				int secret=random.nextInt(100)+1;
				Scanner scanner =new Scanner(System.in);
				int high=100;
				int low =1;
				while(true) {
					int guess =scanner.nextInt();
					 if (guess==secret) {
						System.out.println("bingo");
					}
					else {
						if(guess>=low&&guess<secret)  low=guess;
						if(guess>secret&&guess<high)  high=guess;
						System.out.println(low+"~"+high);
					}
					
					
					
					
				}
			
			
			
				}
		}
		


