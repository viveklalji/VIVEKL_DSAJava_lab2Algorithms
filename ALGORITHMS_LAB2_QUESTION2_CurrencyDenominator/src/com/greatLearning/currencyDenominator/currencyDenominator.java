package com.greatLearning.currencyDenominator;

import java.util.Scanner;

public class currencyDenominator {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter the size of currency denominations");
		
		int size = s.nextInt();
		
		int currency[] = new int[size];
		int counter[] = new int[size];
		
		
		System.out.println("enter the currency denominations value");
		
		for(int i=0;i<size;i++) {
			currency[i] = s.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		
		int amount = s.nextInt();
		
		//sort the currency denomination array
		int temp = 0;
		for(int i=0; i<size; i++) {
			for(int j=1; j<(size); j++) {
				if(currency[j-1] > currency[j]) {
					temp = currency[j-1];
					currency[j-1] = currency[j];
					currency[j] = temp;
				}
			}
		}
		
		// initilize the counter array
		for(int i=0;i<size;i++) {
			counter[i]=0;
		}
		
		// for determining the min number of notes
		for(int i=(size-1);i>=0;i--) {
			while(currency[i] <= amount) {
				counter[i]++;
				amount=amount-currency[i];
			}
		}
		
		
		    System.out.println();
		    System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=(size-1);i>=0;i--) {
				if(counter[i] != 0) {
					System.out.println(currency[i]+":" + counter[i]);
				}
			}
		
		s.close();
		
	}

}
