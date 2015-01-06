package com.maple.grade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true) {
			System.out.println("점수를 입력하시오.");
			Scanner scanner = new Scanner(System.in);
			int score = scanner.nextInt();

			Calculator calculator = new Calculator();
			char eScore = calculator.calculator(score);
			Printer printer = new Printer(eScore);
		}
	}
}
