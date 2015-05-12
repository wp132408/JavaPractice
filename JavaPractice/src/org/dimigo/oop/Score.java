/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_Score
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		
		StringBuilder sb = new StringBuilder();
		sb.append("국어 점수 : ")
		.append(kor + " 점\n")
		.append("수학 점수 : ")
		.append(mat + " 점\n")
		.append("영어 점수 : ")
		.append(eng + " 점\n")
		.append("총점 : ")
		.append(sum + " 점\n")
		.append("평균 : ")
		.append(String.format("%.1f", avg) + " 점\n");
		
		System.out.println("<< 점수 출력 >>");
		System.out.println(sb);
		

	}

}
