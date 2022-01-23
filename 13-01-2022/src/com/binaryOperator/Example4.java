package com.binaryOperator;

public class Example4 {

	public static void main(String[] args)
			{
		
		int a = 80;
		int b = 20;
		boolean validate = (a >= b);//true
		System.out.println("&&:" +((a > b) && (a >= b)));
		System.out.println("||:" +((a < b) || (a >= b)));
		System.out.println("!: " + !validate);//false
	}
	

}
