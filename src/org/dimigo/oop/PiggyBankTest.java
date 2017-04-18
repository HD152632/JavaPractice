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
public class PiggyBankTest {
	public static void main(String[] args){
		FamilyMember[] members={new FamilyMember("아빠"),new FamilyMember("엄마"),new FamilyMember("나"),new FamilyMember("남동생")};
		
		FamilyMember.printMemberCnt();
		
		int n=10;
		
		for(FamilyMember mem:members){
			PiggyBank.putMoney(mem, n*1000);
			n/=2;
		}
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(members[2], 1000);
		
		PiggyBank.printBalance();
	}
}
