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
 * 2.date: 2017. 4. 6.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class SnackTest {
	public static void main(String args[]){
		Snack[] snacks=new Snack[3];
		
		snacks[0]=new Snack("새우깡","농심",1100,2);
		snacks[1]=new Snack("콘칲","크라운",1200,1);
		snacks[2]=new Snack("허니버터칩","해태",1500,4);
		
		for(int i=0;i<snacks.length;i++){
			System.out.println(snacks[i].toString());
		}
		
		int sum=0;
		for(int i=0;i<snacks.length;i++){
			sum+=snacks[i].calcPrice();
		}
		System.out.println("총 구매 금액 : "+String.format("%,d",sum)+"원");
	}
}
