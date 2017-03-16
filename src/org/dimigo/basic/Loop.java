/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 3. 14.
 * </pre>
 * @author: cuizz
 * @version: 1.0
 */
public class Loop {
	public static void main(String[] args){
		int n;
		int att=100;
		Scanner scanner = new Scanner(System.in);
		String str[]={"마법사","영주","기사","농민"};
		do{
			System.out.println("--------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1.공격력 증가");
			System.out.println("2.공격력 감소");
			System.out.println("3.캐릭터 설정");
			System.out.println("9.종료");
			System.out.println("--------------------");
			System.out.print("메뉴 입력 => ");
			n=scanner.nextInt();
			switch(n){
			case 1: att+=10; System.out.println("공격력이 증가되었습니다. 현재 공격력:"+att); break;
			case 2: att-=10; System.out.println("공격력이 감소되었습니다. 현재 공격력:"+att); break;
			case 3: Random rand=new Random();
				int r=rand.nextInt(4);
				System.out.println(str[r]+"(으)로 설정되었습니다."); break;
			case 9: System.out.println("이제 공부하세요!"); break;
			default: System.out.println("없는 메뉴입니다!!"); break;
			}
			
		}while(n!=9);
	}
}
