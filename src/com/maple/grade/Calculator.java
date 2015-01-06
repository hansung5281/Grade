package com.maple.grade;

public class Calculator {
	protected char calculator(int score)
	{
		char eScore = 0;
		
		if(score >= 90)
			eScore = 'A';
		else if(score < 90 && score >=80)
			eScore = 'B';
		else if(score < 80 && score >=70)
			eScore = 'C';
		else if(score < 60 && score >=50)
			eScore = 'D';
		else if(score < 50)
			eScore = 'F';
		
		return eScore;
	}
}
