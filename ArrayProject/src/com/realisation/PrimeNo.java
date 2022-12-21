package com.realisation;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Prime [] = {5,3,7,15,25,6,98,71,22,35,46,26};
		for (int i = 0 ; i<Prime.length; i++) {
			boolean isprime =true;
		for (int n = 2 ; n<=100 ; n++) {
			if (Prime[i]%n==0) {
				isprime = false;
				break ;
			}
		}
		if (isprime) {
			System.out.println(Prime[i] + "is prime no is array");
		}
		}
	}

}
