package com.klissia;

import java.util.Scanner;

public class ConversaoGraus {

	public static float CalcularFahr (float c){
		float f;
		f = c  / 5 * 9 + 32; 
		return f;
	}

	public static void main(String[] args) {
		float fahrenheit, celsius;
		System.out.println("\nDigite um valor em Graus Celsius para converter: ");
		Scanner tec = new Scanner(System.in);
		celsius = tec.nextFloat();
		fahrenheit = CalcularFahr(celsius);
		System.out.println("Valor em fahrenheit: " + fahrenheit);
	}
}
