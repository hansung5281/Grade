package com.maple.grade;

public class Printer {
	
	protected Printer(char[] eScore, int totalScore, float average)
	{
		System.out.println("당신의 학점은 다음과 같습니다.");
		for(int i = 0; i<5; i++)
		{
			System.out.println((i+1) + "번째 과목: " + eScore[i]);
		}
		System.out.println("당신의 총점은 " + totalScore + " 입니다.");
		System.out.println("당신의 평점은 " + average + " 입니다.");
		
		TextPrinter textPrinter = new TextPrinter(eScore, totalScore, average);
	}
}
