/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 4. 10.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 * 
 */

public class IdolGroup {
	public static void main(String[] args){
		String[] groupNames={"빅뱅","2NE1","걸스데이"};
		String[][] memberNames={
			{"GD", "태양", "대성", "탑", "승리"},
			{"CL", "산다라박", "박봄", "민지"},
			{"유라", "혜리", "소진", "민아"}
		};
		
		for(int i=0;i<groupNames.length;i++){
			System.out.println("<< "+groupNames[i]+" >>");
			for(String str:memberNames[i]){
				System.out.println(str);
			}
			System.out.println();
		}
	}
}
