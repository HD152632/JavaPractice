/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 5. 16.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone p[]=new SmartPhone[2];
		
		p[0]=new IPhone("iPhone 7", "애플", 900000);
		p[1]=new Galaxy("갤럭시 S8","삼성",800000);
		
		for(SmartPhone ip:p){
			System.out.println(ip.toString());
			ip.turnOn();
			ip.pay();
			ip.useSpecialFunction(ip);
			ip.turnOff();
			System.out.println("");
		}
	}

}
