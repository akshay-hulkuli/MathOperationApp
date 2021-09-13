package com.bridgelabz.lambda;

@FunctionalInterface
interface IMathFunction{
	int calculate(int a, int b);
}

public class MathOperationApp {
	public static void main(String[] args) {
		
		IMathFunction add = (x, y) -> (x+y);
		IMathFunction subtract = (x, y) -> (x-y);
		IMathFunction divide = (int x, int y) -> x/y;
		System.out.println("Addition is : " + add.calculate(6, 3));
		System.out.println("Subtraction is : "+ subtract.calculate(6, 3));
		System.out.println("Division is : "+ divide.calculate(6, 3));
	}
}
