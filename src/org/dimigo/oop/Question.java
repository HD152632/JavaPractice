/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 4. 3.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class Question {

	public static void main(String[] args) {
		String questions[]={"가장 좋아하는 가수는","가장 좋아하는 배우는","가장 좋아하는 과목은"};
		String answers[]={"MC스나이퍼","오달수","진로"};
		
		Scanner scan=new Scanner(System.in);
		String answer;
		
		for(int i=0;i<3;i++){
			System.out.println((i+1)+". "+questions[i]+"?");
			answer=scan.nextLine();
			if(answer.equals(answers[i])) System.out.println("정답!");
			else System.out.println("오답......");
		}
		
		System.out.println("<<결과 출력>>");
		for(int i=0;i<3;i++){
			StringBuilder sb=new StringBuilder();
			sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.");
			System.out.println(sb);
		}
	}

}
