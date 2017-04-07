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
public class Snack {
	String name;
	String company;
	int price;
	int number;
	
	public Snack(){}
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calcPrice(){
		return price*number;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder("");
		
		sb.append("이름 : "+name+"\n");
		sb.append("제조사 : "+company+"\n");
		sb.append("가격 : "+String.format("%,d",price)+"원\n");
		sb.append("개수 : "+number+"개\n");
		
		return sb.toString();
	}
	
}
