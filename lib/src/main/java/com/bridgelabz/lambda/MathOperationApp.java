package com.bridgelabz.lambda;

@FunctionalInterface
interface IMathFunction{
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, IMathFunction fObj) {
		System.out.println("Result of "+function+" is "+fObj.calculate(a, b));
	}
}

public class MathOperationApp {
	public static void main(String[] args) {
		
		IMathFunction add = (x, y) -> (x+y);
		IMathFunction subtract = (x, y) -> (x-y);
		IMathFunction multiply = (x, y) -> x*y;
		IMathFunction divide = (int x, int y) -> {
			if(y==0) return 0;
			return x/y;
		};
		
		
		System.out.println("Addition is : " + add.calculate(6, 3));
		System.out.println("Subtraction is : "+ subtract.calculate(6, 3));
		System.out.println("Multiplication is : "+ multiply.calculate(6, 3));
		System.out.println("Division is : "+ divide.calculate(6, 3));
		
		
		IMathFunction.printResult(6, 3, "addition", add);
		IMathFunction.printResult(6, 3, "subtraction", subtract);
		IMathFunction.printResult(6, 3, "Multiplication", multiply);
		IMathFunction.printResult(6, 3, "division", divide);
	}
}
