package com.maple.grade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("5과목의 점수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);

		int score[] = new int[5];
		for (int i = 0; i < 5; i++)
			score[i] = scanner.nextInt();

		Calculator calculator = new Calculator();
		calculator.calculator(score);

	}
}
