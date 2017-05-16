/**
 * 
 */
package org.dimigo.abstractclass;
/**
 * <pre>
 * org.dimigo.abstractclass
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 5. 16.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){};
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model+"의 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println(model+"의 전원을 끕니다.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(){
		switch(model){
			case "iPhone 7": System.out.println("AirDrop 기능을 사용합니다."); break;
			default :System.out.println("무선 충전 기능을 이용합니다.");
		}
	}
	
	public String toString(){
		return ("모델명 : "+model+", 제조사 : "+company+", 가격 : "+String.format("%,d",price)+"원");
	}
}
