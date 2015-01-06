package com.maple.grade;

public class Calculator {
	protected void calculator(int score[]) {

		char[] eScore = new char[5];
		int totalScore = 0; float average = 0; 
		
		//학점 계산
		for(int i = 0; i < 5; i++) {
			if (score[i] >= 90)
				eScore[i] = 'A';
			else if (score[i] < 90 && score[i] >= 80)
				eScore[i] = 'B';
			else if (score[i] < 80 && score[i] >= 70)
				eScore[i] = 'C';
			else if (score[i] < 70 && score[i] >= 60)
				eScore[i] = 'D';
			else if (score[i] < 60)
				eScore[i] = 'F';
		}
		
		//총점, 평점계산
		for(int i=0; i<5; i++)
		{
			totalScore += score[i];
		}
		average = totalScore / 5;
		
		Printer printer = new Printer(eScore, totalScore ,average);
	}
}
