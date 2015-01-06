package com.maple.grade;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TextPrinter {

	protected TextPrinter(char eScore[], int totalScore, float average) {
		try {
			File file = new File("grade.txt");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file, false), "euc-kr"));

			bw.write("당신의 학점은 다음과 같습니다."); bw.newLine();
			for (int i = 0; i < 5; i++) {
				bw.write((i + 1) + "번째 과목: " + eScore[i]);
				bw.newLine();
			}
			bw.write("당신의 총점은 " + totalScore + " 입니다."); bw.newLine();
			bw.write("당신의 평점은 " + average + " 입니다."); bw.newLine();

			bw.close();

		}
		catch (Exception ex) {
		}
	}
}
