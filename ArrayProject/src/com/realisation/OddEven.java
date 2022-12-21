package com.realisation;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {48,59,55,25,87,32,87,65,87,22};
		 
		for (int i = 0 ; i<arr.length ; i++) {
			if(arr[i]%2==0) {
				int Even = arr [i] ;
				System.out.println("even" + Even);
			}
				else {
					int odd = arr [i];
					System.out.println("odd" + odd);
				}
		}
	}

}
