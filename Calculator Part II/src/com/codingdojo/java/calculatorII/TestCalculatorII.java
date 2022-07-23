package com.codingdojo.java.calculatorII;



public class TestCalculatorII {

	public static void main(String[] args) {
		CalculatorII calculator = new CalculatorII();
		CalculatorII calculator1 = new CalculatorII(10.5,"*",5.2);
		calculator1.performOperation();
		calculator1.getResult();
		
		System.out.println(calculator1.getResult());
	}

}
