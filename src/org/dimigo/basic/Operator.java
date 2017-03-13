/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 3. 13.
 * </pre>
 * @author: cuizz
 * @version: 1.0
 */
public class Operator {
	public static void main(String str[]){
		int monthly=1700000;
		int worker=3;
		int shops=1500;
		
		System.out.println("<<디미베테 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d",monthly)+"원");
		System.out.println("점포 내 직원 수 : "+worker+"명");
		System.out.println("점포 수 : "+String.format("%,d", shops)+"개");
		System.out.println();
		long n=(long)monthly*12*worker*shops;
		System.out.println("연간 인건비 : "+String.format("%,d", n)+"원");
	}
}
