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
 * 2.date: 2017. 4. 18.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class FamilyMember {
	private static int memberCnt=4;
	private String memberName;
	
	public FamilyMember(String memberName){
		this.memberName=memberName;
	}
	
	public String getMemberName(){
		return memberName;
	}
	
	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : "+memberCnt+"명");
	}
}
