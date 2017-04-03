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
		
		for(int i=0;i<3;i++){
			System.out.println(questions[i]+" "+answers[i]+"입니다.");
		}
	}

}
