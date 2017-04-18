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
public class PiggyBank {
	private static int balance=0;
	
	public static void putMoney(FamilyMember member,int amount){
		System.out.println(member.getMemberName()+" : "+amount+"원 넣음");
		balance+=amount;
	}
	
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : "+balance+"원");
	}
}
