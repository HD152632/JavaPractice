package org.dimigo.basic;

public class PrimitiveDataType {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="아이유";
		boolean isMale=false;
		int age=25;
		double height=161.8;
		float weight=(float)44.3;
		char bloodType = 'A';
		
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+(isMale?"남자":"여자"));
		System.out.println("나이 : "+age+"살");
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("혈액형 : "+bloodType+"형");
		
	}
	
}