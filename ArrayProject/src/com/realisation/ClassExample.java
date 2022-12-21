package com.realisation;

public class ClassExample {
	private static double[] getSquareRoots(int[] numValues) {
		int size = numValues.length;
		double[] squareRoots = new double[size];
		int index = 0;
		for(int num : numValues) {
			double sqRoot = Math.sqrt(num);
			squareRoots[index] = sqRoot;
			index++; 
		}
		return squareRoots;
	}
	private static void printSum(int[] numValues) {
		int sum = 0;
		/*for(int num : numValues) {
			sum += num; //sum = sum + num;
		}*/
		int size = numValues.length;
		for(int index = 0; index < size; index++) {
			int num = numValues[index];
			sum += num;
		}
		System.out.println("Sum = " + sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numbers[] = {25, 49, 16, 64, 81};
			//printSum(numbers);
			double roots[] = getSquareRoots(numbers);
			for(double root : roots)
				System.out.println(root);



	}

}
